<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <c:if test="${not empty errorMessage}">
<p>
<font color="red">Please correct the following errors:
<ul>
<c:forEach var="message" items="${errorMessage}">
<li>${message}</li>
</c:forEach>
</ul>
</font>
</p>
</c:if>
        <form action="InquireNowServlet">
            
        <table width="100%">
          <tr>
            <td width="21%">Name</td>
            <td width="79%"><input type="text" name="iName" value="${iName}" /></td>
          </tr>
          <tr>
            <td>Address</td>
            <td><input type="text" name="address" value="${address}"/></td>
          </tr>
          <tr>
            <td>Contact Number</td>
            <td><input type="text" name="phone" value="${phone}"/></td>
          </tr>
          <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${email}" /></td>
          </tr>
          <tr>
            <td>Query</td>
            
            <td><textarea name="query"  rows="5">${query}</textarea></td>
          </tr>
         
          <tr><td><input type="radio" value="viaPhone" name="responseType" ${responseTypePhone}>Respond via phone</td>
              <td><input type="radio" name="responseType"   value="viaEmail" ${responseTypeEmail}>Respond via email</td>
          <tr><td colspan="7"> If you opt to respond via phone, specify the date and time you want our executive to contact you</td>    
          <tr><td>Date
              <select name="day">
                      <option value="select">select</option>    
                  <c:forEach begin="1" end="31" var="day">
                      <option value="${day}">${day}</option>
                  </c:forEach>
               </select>
              
                  <select name="month">
                      <option value="select">select</option>    
                      <c:forTokens items="Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec" delims="," var="month">
                      <option value="${month}">${month}</option>
                      </c:forTokens>>
               </select>
                  <select name="year">
                      <option value="select">select</option>    
                      <c:forTokens items="2011,2012,2013,2014,2015,2016,2017,2018,2019,2020" delims="," var="year">
                      <option value="${year}">${year}</option>
                      </c:forTokens>>
               </select>
                
              </td>
              <td>Time
                  <select name="time">
                      <option value="select">select</option>    
                      <c:forTokens items="between 6-7 am,between 7-8 am,between 8-9 am,between 9-10 am,between 10-11 am,between 11-12 am,between 12-1 pm, between 1-2 pm, between 2-3 pm,between 3-4 pm, between 4-5 pm, between 5-6 pm, between 6-7 pm, between 7-8 pm" delims="," var="time">
                      <option value="${time}">${time}</option>
                      </c:forTokens>>
               </select>
                  
              </td>
          <tr><td><input type="submit" value="Submit"></td></tr>
              </table>
        </form>
    </body>
</html>
