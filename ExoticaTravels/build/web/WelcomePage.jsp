<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
         <div align="right">
            <a href="LogoutServlet">Logout</a>
        </div>
        <h1>Welcome ${model.uname}</h1>
        <table border="0" align="center">
            <tr>
                <td><a href='PageUnderConstruction.jsp'><img src="Images/Car.jpg" height="150" width="250"></a></td>
                <td><a href='PageUnderConstruction.jsp'><img src="Images/Hotel.jpg" height="150" width="250"></a></td>
                <td><a href='TourPackagePage.jsp'><img src="Images/Tourpackage.jpg" height="150" width="250"></a>
                <td><a href='PlanTravelPage.jsp'><img src="Images/PlanTour.jpg" height="150" width="250"></a>
            </tr>
            <tr>
                <td align="center">Cab Bookings</td>
                <td align="center">Hotel Bookings</td>
                <td align="center">Tour Package Bookings</td>
                <td align="center">Plan Travel</td>
            </tr>
        </table>

    </body>
</html>
