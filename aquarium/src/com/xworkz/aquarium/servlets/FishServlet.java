package com.xworkz.aquarium.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/FishServlet")
public class FishServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String color = servletRequest.getParameter("color");
        String lifeSpan = servletRequest.getParameter("lifeSpan");
        String cost = servletRequest.getParameter("cost");
        String type = servletRequest.getParameter("type");
        String size = servletRequest.getParameter("size");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>Fish Details Submitted Successfully!</h1>");
    }
}
