package ir.maktab;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
//@WebFilter("/add")
public class SimpleFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String remoteAddr = servletRequest.getRemoteAddr();
        String localAddr = servletRequest.getLocalAddr();
        String serverName = servletRequest.getServerName();
        int remotePort = servletRequest.getRemotePort();
        System.out.println(remoteAddr + "    " + localAddr +"  "+ serverName +"  "+remotePort);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
