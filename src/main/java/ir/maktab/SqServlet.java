package ir.maktab;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SqServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
//        String k = req.getParameter("k");
        Object k = req.getAttribute("k");
        int i = Integer.parseInt(k.toString());
        i = i *i;
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println(
                "this is square "+i
        );


    }
}
