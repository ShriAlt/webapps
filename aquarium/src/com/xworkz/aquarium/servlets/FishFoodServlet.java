package com.xworkz.aquarium.servlets;


import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/FishFoodServlet")
public class FishFoodServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String brand = servletRequest.getParameter("brand");
        String quantity = servletRequest.getParameter("quantity");
        String cost = servletRequest.getParameter("cost");

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<h1>Fish Food Details Submitted Successfully!</h1>");
    }
}

