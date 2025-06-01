package com.xworkz.plate.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actorServlet",loadOnStartup = 1)
public class PlateServlet extends GenericServlet {
    public PlateServlet(){
        System.out.println("running plate servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name=servletRequest.getParameter("name");
        String language=servletRequest.getParameter("language");
        String strSalary=servletRequest.getParameter("salary");
        String blockbusters=servletRequest.getParameter("blockbusters");
        String flops =servletRequest.getParameter("flops");
        String upcomingMovie=servletRequest.getParameter("upcomingMovie");
        String producer=servletRequest.getParameter("producer");
        String director=servletRequest.getParameter("director");
        String strBudget =servletRequest.getParameter("budget");
        String director=servletRequest.getParameter("director");
        String strBudget =servletRequest.getParameter("budget");

        int salary=Integer.parseInt(strSalary);
        int budget=Integer.parseInt(strBudget);
        System.out.println("Name :"+name+" Lang :"+language+" Sal"+salary+" blockbuster"+blockbusters+" flops :"+flops+" upcoming"+upcomingMovie+" producer"+producer+" director"+director+" Budget"+budget);



        PrintWriter writer=servletResponse.getWriter();
        servletResponse.setContentType("text/html");
        writer.println("<!DOCTYPE html>");
        writer.println("<html lang=\"en\">");
        writer.println("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Response</title>\n" +
                "</head>");
        writer.println("<body>");
        writer.println(" <h1>Succsesfull...!!!</h1>");
        writer.println("<label >Name : </label>"+name);
        writer.println("<label >language : <label>"+language);
        writer.println(" <label >salary :</label>"+salary);
        writer.println(" <label >flops :</label>"+flops);
        writer.println(" <label >blockbusters :</label>"+blockbusters);
        writer.println(" <label >upcomingMovie :</label>"+upcomingMovie);
        writer.println(" <label >producer :</label>"+producer);
        writer.println(" <label >director :</label>"+director);
        writer.println(" <label >budget :</label>"+budget);
        writer.println("</body>\n" +
                "</html>");
    }
}
