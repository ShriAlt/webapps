package com.xworkz.aquarium.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/PlantServlet")
public class PlantServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String cost = servletRequest.getParameter("cost");
        String type = servletRequest.getParameter("type");
        String soil = servletRequest.getParameter("soil");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h1>Plant Details Submitted Successfully!</h1>");
    }
}
