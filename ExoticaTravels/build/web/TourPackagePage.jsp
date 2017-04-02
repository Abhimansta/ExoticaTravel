<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tour Page</title>
    </head>
    <body>
        <div align="right">
            <a href="LogoutServlet">Logout</a>
        </div>
        <table>
        <form action='HotelBookingServlet'>
          <tr><td><h3>Tour Package Booking</h3></td></tr>
            <tr><td>Select a destination</td>
                    <td><select name='destination'>
                            <option value='Select'>Select</option>
                            <option value='Colombo'>Colombo</option>
                            <option value='Ella'>Ella</option>
                            <option value='Sigiriya'>Sigiriya</option>
                            <option value='Galle'>Galle</option>
                            <option value='Kandy'>Kandy</option>
                        </select>
                    </td>
            </tr>
            <tr>
                <td><input type='submit' value='Next'></td>
            </tr>
        </form>
        </table>

    </body>
</html>
