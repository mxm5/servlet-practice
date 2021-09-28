package ir.maktab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>hell lll lll l oo ooo</h1>");
        writer.println("<h2>hell lll lll l oo ooo</h2>");
        writer.println("<h3>hell lll lll l oo ooo</h3>");
        writer.println("<h4>hell lll lll l oo ooo</h4>");
    }
}
