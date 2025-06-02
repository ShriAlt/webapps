package com.xworkz.servelets;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/ContactServlet",loadOnStartup = 1)
public class ContactServelet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {


        String name=servletRequest.getParameter("name");
        String number=servletRequest.getParameter("phone");
        String email=servletRequest.getParameter("email");
        String coments=servletRequest.getParameter("coments");


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("ContactResult.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
