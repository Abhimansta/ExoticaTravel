import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String loginId, password,uname,address,contactno,rememberMe;
    UserDetailsModel udm=new UserDetailsModel();
    HttpSession session;
    Cookie loginIdCookie,passwordCookie;
    int cookieAge=60*60*24*30;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        try {
            session = request.getSession();
            loginId=request.getParameter("loginid");
            password=request.getParameter("password");
            rememberMe=request.getParameter("rememberMe");
            boolean value=readFile();
            
            if(value){
                request.setAttribute("model", udm);
                session.setAttribute("smodel", udm);
                if(rememberMe!=null){
                    System.out.println("rememberMe if");
                    loginIdCookie=new Cookie("loginIdExotica",loginId);
                    passwordCookie=new Cookie("passwordExotica",password);
                    loginIdCookie.setMaxAge(cookieAge);
                    passwordCookie.setMaxAge(cookieAge);
                    response.addCookie(loginIdCookie);
                    response.addCookie(passwordCookie);
                    
                }

                RequestDispatcher rd=request.getRequestDispatcher("WelcomePage.jsp");
                rd.forward(request, response);
                
            }
            else{
                RequestDispatcher rd=request.getRequestDispatcher("ErrorPage.jsp");
                rd.forward(request, response);
                
                
            }
        } finally {            
            out.close();
        }
    }
boolean readFile(){
      
      boolean value=false;
        try{
            FileReader fr=new FileReader("ExoticaTravelLogin.txt"); BufferedReader br=new BufferedReader(fr);
            String data;
            while((data=br.readLine())!=null){
            String text[]=data.split("~");
            
            if(text[3].equals(loginId)&& text[4].equals(password))
            {
                uname=text[0];
                address=text[1];
                contactno=text[2];
                System.out.println(text[0]+" "+text[1]+" "+text[2]);
                udm.setUname(uname);
                udm.setAddress(address);
                udm.setContactno(contactno);
                
                value=true;
                
                break;
            }
            else{
                value=false;
            
            }
            
        }
            fr.close();
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        
        return value;
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
