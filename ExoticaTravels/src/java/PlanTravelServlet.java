/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PlanTravelServlet", urlPatterns = {"/PlanTravelServlet"})
public class PlanTravelServlet extends HttpServlet {

    UserDetailsModel udm=new UserDetailsModel();
    String arr_dd,arr_mm,arr_yy,arrDate,dep_dd,dep_mm,dep_yy,depDate;
    String kind_wild,kind_romantic,kind_fun,kind_peaceful,kind_healthy,holidayKind ;
    String like_beaches,like_archaeological,like_mountains,like_wildlife,like_fauna,holidayLike;
    String faci_accomodation,faci_food,faci_transport,faci_comm,faci_guide, facilities;
    String budget,standard,star2_3,star4_5,accomodation;
    FileWriter fw;
    BufferedWriter bw;
    HttpSession session;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        session=request.getSession();
        try {
            System.out.println("1_1");
            udm=(UserDetailsModel)session.getAttribute("smodel");
            System.out.println(udm);
            arr_dd=request.getParameter("arr_dd");
            arr_mm=request.getParameter("arr_mm");
            arr_yy=request.getParameter("arr_yy");
            arrDate=arr_dd+"."+arr_mm+"."+arr_yy;
            
            dep_dd=request.getParameter("dep_dd");
            dep_mm=request.getParameter("dep_mm");
            dep_yy=request.getParameter("dep_yy");
            depDate=dep_dd+"."+dep_mm+"."+dep_yy;
            kind_wild=request.getParameter("kind_wild");
            kind_romantic=request.getParameter("kind_romantic");
            kind_fun=request.getParameter("kind_fun");
            kind_peaceful=request.getParameter("kind_peaceful");
            kind_healthy=request.getParameter("kind_healthy");
            if(kind_wild!=null)
                holidayKind=kind_wild+",";
            if(kind_romantic!=null)
                holidayKind+=kind_romantic+",";
            if(kind_fun!=null)
                holidayKind+=kind_fun+",";
            if(kind_peaceful!=null)
                holidayKind+=kind_peaceful+",";
            if(kind_healthy!=null)
                holidayKind+=kind_healthy+",";
            like_beaches=request.getParameter("like_beaches");
            like_archaeological=request.getParameter("like_archaeological");
            like_mountains=request.getParameter("like_mountains");
            like_wildlife=request.getParameter("like_wildlife");
            like_fauna=request.getParameter("like_fauna");
            
            if(like_beaches!=null)
                holidayLike=like_beaches+",";
            if(like_archaeological!=null)
                holidayLike+=like_archaeological+",";
            if(like_mountains!=null)
                holidayLike+=like_mountains+",";
            if(like_wildlife!=null)
                holidayLike+=like_wildlife+",";
            if(like_archaeological!=null)
                holidayLike+=like_fauna+",";
            
            faci_accomodation=request.getParameter("faci_accomodation");
            faci_food=request.getParameter("faci_accomodation");
            faci_transport=request.getParameter("faci_accomodation");
            faci_comm=request.getParameter("faci_accomodation");
            faci_guide=request.getParameter("faci_accomodation");
            if(faci_accomodation!=null)
            facilities=faci_accomodation+",";
            if(faci_food!=null)
            facilities+=faci_food+",";
            if(faci_transport!=null)
            facilities+=faci_transport+",";
            if(faci_comm!=null)
            facilities+=faci_comm+",";
            if(faci_guide!=null)
            facilities+=faci_guide+",";
            
            budget=request.getParameter("budget");
            standard=request.getParameter("standard");
            star2_3=request.getParameter("star2_3");
            star4_5=request.getParameter("star4_5");
            if(budget!=null)
                accomodation=budget+",";
            if(standard!=null)
                accomodation+=standard+",";
            if(star2_3!=null)
                accomodation+=star2_3+",";
            if(star4_5!=null)
                accomodation+=star4_5+",";
            
            System.out.println(udm.getUname()+"~"+udm.getAddress()+"~"+udm.getContactno()+"~"+arrDate+"~"+depDate+"~"+holidayKind+"~"+holidayLike+"~"+facilities +"~"+accomodation);
            writeData();
            RequestDispatcher rd=request.getRequestDispatcher("DisplayTravelPlan.jsp");
            rd.forward(request, response);
        } finally {            
            out.close();
        }
    }
public void writeData(){
    try{
        System.out.println("1");
        fw=new FileWriter("PlanTravel.txt",true);
        bw=new BufferedWriter(fw);
        bw.write(udm.getUname()+"~"+udm.getAddress()+"~"+udm.getContactno()+"~"+arrDate+"~"+depDate+"~"+holidayKind+"~"+holidayLike+"~"+facilities +"~"+accomodation);
        bw.newLine();
        System.out.println("2");
        bw.close();
        fw.close();
    }catch(Exception e){
        System.out.println(e);
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
