package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //here we defined a parameter
        String name=req.getParameter("user_name");
        String email=req.getParameter("user_email");
        String password=req.getParameter("user_password");
        String course=req.getParameter("course");
        resp.setContentType("text/html");

        PrintWriter out=resp.getWriter();//what to show to the user
        out.print("<h1>Name:"+name+"</h1>");
        out.print("<h1>Email:"+email+"</h1>");
        out.print("<h1>Password:"+password+"</h1>");
        out.print("<h1>Course:"+course+"</h1>");
    }
}
