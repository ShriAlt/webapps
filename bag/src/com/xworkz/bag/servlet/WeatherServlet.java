package com.xworkz.bag.servlet;

import com.xworkz.bag.dto.WeatherDTO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/weatherServlet")
public class WeatherServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String location = servletRequest.getParameter("location");
        String recordedBy=servletRequest.getParameter("recordedBy");
        String temperature = servletRequest.getParameter("temperature");
        String date = servletRequest.getParameter("date");


        WeatherDTO dto= new WeatherDTO();
        servletRequest.setAttribute("dto",dto);
        dto.setDate(LocalDate.parse(date));
        dto.setLocation(location);
        dto.setRecordedBy(recordedBy);
        dto.setTemperature(Integer.parseInt(temperature));


        RequestDispatcher dispatcher = servletRequest.getRequestDispatcher("WeatherResult.jsp");
        dispatcher.forward(servletRequest, servletResponse);
    }
}
