/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Kalaiselvi.S
 */
@WebFilter(filterName = "ProcessingTimeFilter", urlPatterns = {"/*"}, dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.ERROR, DispatcherType.REQUEST, DispatcherType.INCLUDE})
public class ProcessingTimeFilter implements Filter {
    FilterConfig flt_cnfg = null;
   public void init(FilterConfig f_cnfg) throws ServletException
   {
      this.flt_cnfg = f_cnfg;
   }
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
   {
      long service_Start = System.currentTimeMillis();
      chain.doFilter(request, response);
      long service_Stop = System.currentTimeMillis();
      long serviceTime = (service_Stop - service_Start);
      String path = ((HttpServletRequest)request).getRequestURI();
      flt_cnfg.getServletContext().log("Time taken to process request for: "+path+" is: "+serviceTime+ " milliseconds");
   }
   public void destroy ()
   {
      this.flt_cnfg = null;
   }
}