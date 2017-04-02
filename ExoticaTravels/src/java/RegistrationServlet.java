/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/RegistrationServlet"})
public class RegistrationServlet extends HttpServlet {
String uname, address,  contactno, loginid,  password,reEnterPassword;
HttpSession session;
 
ArrayList<String> errorMessage=new ArrayList<String>();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        session=request.getSession();
        try {
           
            uname=request.getParameter("uname");
            address=request.getParameter("address");
            contactno=request.getParameter("contactno");
            loginid=request.getParameter("loginid");
            password=request.getParameter("password");
            reEnterPassword=request.getParameter("repassword");
            errorMessage.clear();
            if(errorMessage.isEmpty()){
                if(uname.equals("")){
                errorMessage.add("Please enter the name");
                uname="";
                
            }
                if(address.equals("")){
                errorMessage.add("Please enter the address");
                address="";
                
            }
            if(contactno.equals("")){
                errorMessage.add("Please enter the contact number");
                contactno="";
            }
            else{
                try{
                int i=Integer.parseInt(contactno);
                }
                catch(Exception e){
                    errorMessage.add("Please enter a valid contact number");
                }
            }
            if(loginid.equals("")){
                errorMessage.add("Please enter the login id");
                loginid="";
            }

            if(password.equals("")){
                
                errorMessage.add("Please enter the password");
                password="";
            }
            
            if(reEnterPassword.equals("")){
                
                errorMessage.add("Please enter the re-enter password");
                reEnterPassword="";
            }
            if(!(password.equals("")) && !(reEnterPassword.equals(""))){
                if(!(password.equals(reEnterPassword))){
                
                errorMessage.add("The password and re-enter password are not same");
                password="";
                reEnterPassword="";
                
                }
            }
if(!errorMessage.isEmpty()){
                
                request.setAttribute("unameAtt", uname);
                request.setAttribute("addressAtt",address);
                request.setAttribute("contactnoAtt", contactno);
                request.setAttribute("loginidAtt", loginid);
                request.setAttribute("passwordAtt",password);
                request.setAttribute("reEnterPasswordAtt", reEnterPassword);
                request.setAttribute("errorMessage", errorMessage);
                
           RequestDispatcher rd=request.getRequestDispatcher("RegistrationPage.jsp");
           rd.forward(request,response); 
                
            }
else{

           writeFile();
           UserDetailsModel udm=new UserDetailsModel(uname,address,contactno,loginid,password);
           request.setAttribute("model", udm);
           session.setAttribute("smodel", udm);
           
           RequestDispatcher rd=request.getRequestDispatcher("WelcomePage.jsp");
           rd.forward(request,response);
        } 
            }
        }
finally {            
            out.close();
        }
        
    }
void writeFile(){
           try{
                FileWriter  fw=new FileWriter("ExoticaTravelLogin.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(uname+"~"+address+"~"+contactno+"~"+loginid+"~"+password);
                bw.newLine();
                bw.close();
                fw.close();
                        
           }catch(IOException ioe){
            System.out.println(ioe);
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
