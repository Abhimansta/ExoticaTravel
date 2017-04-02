
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <% 
              
        String loginId="",password="";
        
        Cookie exoticaCookies[] = request.getCookies();
	if (exoticaCookies!=null)
		{

			for (int i=0; i<exoticaCookies.length; i++)
			{
                            if(exoticaCookies[i].getName().equals("loginIdExotica")){
                            loginId=exoticaCookies[i].getValue();
                            System.out.println("If block login id"+loginId);
                            }
                            if(exoticaCookies[i].getName().equals("passwordExotica")){
                            password=exoticaCookies[i].getValue();
                            System.out.println("If block password"+password);
                            }
                            
                        }
            }
               
        %>

        <form action="LoginServlet">
            <table>
                <tr><th colspan='2'>Login Detail</th></tr>
                <tr><td>Login ID<td><input type='text' name='loginid' value="<%=loginId%>"></td></tr>
                <tr><td>Password<td><input type='password' name='password' value="<%=password%>"/></td></tr>
                <tr><td><input type='checkbox' name='rememberMe' value='checked'/>Remember Me</td></tr> 

                <tr><td colspan="2"><input type='submit' name='submit' value='Submit'></td></</tr>
            </table>
        </form>
<a href="DeleteCookiesServlet"> Sign in as a different user</a>
    </body>
</html>
