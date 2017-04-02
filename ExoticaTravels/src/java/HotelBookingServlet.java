

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HotelBookingServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        String hotelNames=this.getInitParameter("HotelNames");
        String hotelNamesSplit[]=hotelNames.split(",");
        try {
            String destination=request.getParameter("destination");
            session.setAttribute("destination", destination);
            out.println("<title>Tour Package Booking Page</title>");
            out.println("<div align='right'>");
            out.println("<a href='LogoutServlet'>Logout</a>");
            out.println("</div>");

            out.println("<table>");
            out.println("<form action='CabBookingServlet'>");
            out.println("<tr><td><h3>Tour Package Booking</h3></td></tr>");
            out.println("<tr><td>Select a hotel</td>");
            out.println("<td><select name='hotel'>");
            for(int i=0;i<hotelNamesSplit.length;i++)
            out.println("<option value='"+hotelNamesSplit[i]+"'>"+hotelNamesSplit[i]+"</option>");
            
            out.println("</select></h1></td>");
            out.println("<tr><td>Number of Days</td>");
            out.println("<td><input type='text' name='noofdays'></td></tr>");
            out.println("<tr><td><input type='submit' value='Next'></td>");           
            out.println("</form>");
            out.println("<form action='TourPackagePage.jsp'>");
            out.println("<td><input type='submit' value='Back'></td></tr>"); 
            out.println("</form>");
            out.println("</table>");
            
        } finally {            
            out.close();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
