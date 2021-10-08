package ir.maktab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sq")
public class SqServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        String k ="";
        for (Cookie cookie : req.getCookies()) {
            if (cookie.getName().equals("k"))   {
                k = cookie.getValue();
                break;
            }
        }

        int i = Integer.parseInt(k);
        i = i *i;
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        writer.println(
                "this is square "+i
        );


    }
}
