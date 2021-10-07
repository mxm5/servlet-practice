package ir.maktab;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String n11 = req.getParameter("n1");
        String n21 = req.getParameter("n2");

        System.out.println(n11 + " " + n21);
        int n1 = Integer.parseInt(n11);
        System.out.println(n1);
        int n2 = Integer.parseInt(n21);
        System.out.println(n2);
        n1 = n1 + n2;

        Cookie k = new Cookie("k", n1 + "");
        resp.addCookie(k);
        PrintWriter writer = resp.getWriter();
        writer.println("sum is " + n1);

        resp.sendRedirect("sq");

    }
}
