
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CabBookingServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session =request.getSession();
        String hotel=request.getParameter("hotel");
        String noofdays=request.getParameter("noofdays");
        session.setAttribute("hotel", hotel);
        session.setAttribute("noofdays", noofdays);
         String cabServicers=this.getInitParameter("CabServicers");
        String cabServicersSplit[]=cabServicers.split(",");
        try {
            out.println("<title>Tour Package Booking Page</title>"); 
            out.println("<div align='right'>");
            out.println("<a href='LogoutServlet'>Logout</a>");
            out.println("</div>");
            out.println("<table>");
            out.println("<form action='TourPackageServlet'>");
            out.println("<tr><td><h3>Tour Package Booking</h3></td></tr>");
            out.println("<tr><td>Select a Cab Service</td>");
            out.println("<td><select name='cab'>");
            
            for(int i=0;i<cabServicersSplit.length;i++)
            out.println("<option value='"+cabServicersSplit[i]+"'>"+cabServicersSplit[i]+"</option>");          
            out.println("</select></td></tr>");
            out.println("<tr><td><input type='submit' value='Submit'></td>");
            out.println("</form>");
            out.println("<form action='HotelBookingServlet'>");
            out.println("<td><input type='submit' value='Back'></td></tr>"); 
            out.println("</form>");
             out.println("</table>");
           
        } finally {            
            out.close();
        }
out.println("<tr><td><input type='submit' value='Submit'></td>");
            out.println("</form>");
            out.println("<form action='CabBookingServlet'>");
            out.println("<td><input type='submit' value='Back'></td></tr>"); 
            out.println("</form>");
             out.println("</table>");
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
