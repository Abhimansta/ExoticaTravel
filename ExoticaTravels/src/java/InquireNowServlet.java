
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InquireNowServlet", urlPatterns = {"/InquireNowServlet"})
public class InquireNowServlet extends HttpServlet {

    String iName, address, phone, email, responseType, query, responseTypePhoneVal = "unchecked", responseTypeEmailVal = "unchecked", day, month, year, time;
    ArrayList errorMessage = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {


            errorMessage.clear();
            address = request.getParameter("address");
            query = request.getParameter("query");
            phone = request.getParameter("phone");
            email = request.getParameter("email");
            responseType = request.getParameter("responseType");
            day = request.getParameter("day");
            month = request.getParameter("month");
            year = request.getParameter("year");
            time = request.getParameter("time");

            if (errorMessage.isEmpty()) {
                iName = request.getParameter("iName");

                if (iName.equals("")) {
                    errorMessage.add("Please enter your name");
                }



                if (query.equals("")) {
                    errorMessage.add("Please specify your query");
                }

                if (phone.equals("") && email.equals("")) {
                    errorMessage.add("Please enter the contact number or email ID");
                } 
                if(!phone.equals("")){
                    if (!(phone.matches("-?\\d+(\\.\\d+)?"))) {
                        errorMessage.add("Please enter a valid contact number");
                    }
                }
                if (responseType == null) {
                    errorMessage.add("Please select the response type");
                } else {
                    if(responseType.equals("viaPhone")){
                        if(phone.equals("")){
                           errorMessage.add("Please enter the contact number"); 
                            responseTypePhoneVal = "checked";
                            responseTypeEmailVal = "unchecked";
                        }
                        else{
                            if (!(phone.matches("-?\\d+(\\.\\d+)?"))) {
                            
                            responseTypePhoneVal = "checked";
                            responseTypeEmailVal = "unchecked";
                            }
                            else{
                                responseTypePhoneVal = "checked";
                                responseTypeEmailVal = "unchecked";
                                if (day.equals("select") || month.equals("select") || year.equals("select") || time.equals("select")) {
                                    errorMessage.add("Please select the date and time");
                                }
                            }
                        }
                            
                    }
                    else{
                        if (email.equals("")) {
                            errorMessage.add("Please enter your your email ID");
                            responseTypeEmailVal = "checked";
                            responseTypePhoneVal = "unchecked";
                    }
                    }
                }
                }
                if (!errorMessage.isEmpty()) {
                    request.setAttribute("iName", iName);
                    request.setAttribute("address", address);
                    request.setAttribute("query", query);
                    request.setAttribute("phone", phone);
                    request.setAttribute("email", email);
                    request.setAttribute("responseTypePhone", responseTypePhoneVal);
                    request.setAttribute("responseTypeEmail", responseTypeEmailVal);
                    request.setAttribute("errorMessage", errorMessage);
                    RequestDispatcher rd = request.getRequestDispatcher("InquireNowPage.jsp");
                    rd.forward(request, response);
                } else {
                    System.out.println("InquireNowDisplayPage.jsp");
                    RequestDispatcher rd = request.getRequestDispatcher("InquireNowDisplayPage.jsp");
                    rd.forward(request, response);
                }
            
            
        }
            
         catch (Exception e) {
            System.out.println(e);

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
