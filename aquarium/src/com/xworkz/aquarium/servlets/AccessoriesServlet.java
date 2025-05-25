package com.xworkz.aquarium.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet(urlPatterns = "/AccessoriesServlet")
public class AccessoriesServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String type = servletRequest.getParameter("type");
        String warranty = servletRequest.getParameter("warranty");
        String price = servletRequest.getParameter("price");
        String quantity = servletRequest.getParameter("quantity");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>Accessories Details Submitted Successfully!</h1>");
    }
}
