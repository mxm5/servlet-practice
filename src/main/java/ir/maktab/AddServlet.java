package ir.maktab;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        String n11 = req.getParameter("n1");
        String n21 = req.getParameter("n2");
        HttpSession session = req.getSession();
        System.out.println(n11 +" "+n21);
        int n1 = Integer.parseInt(n11);
        System.out.println(n1);
        int n2 = Integer.parseInt(n21);
        System.out.println(n2);
        n1 = n1+n2;
        session.setAttribute("k",n1);

        PrintWriter writer = resp.getWriter();
        writer.println("sum is "+n1);

        resp.sendRedirect("sq");

    }
}
