package com.xworkz.aquarium.servlets;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/AquariumServlet",loadOnStartup = 1)
public class AquariumServlet extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String model = request.getParameter("model");
        String shape = request.getParameter("shape");
        String cost = request.getParameter("cost");
        String height = request.getParameter("capacity");
        String company = request.getParameter("company");

//        int number= Integer.parseInt(stNumber);

        response.setContentType("text/html");

        PrintWriter writer=response.getWriter();

        writer.println("<h1>success!!!!</h1>");
    }
}
