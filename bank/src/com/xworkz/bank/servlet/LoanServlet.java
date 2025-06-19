package com.xworkz.bank.servlet;

import com.xworkz.bank.dto.LoanDTO;
import com.xworkz.bank.service.LoanService;
import com.xworkz.bank.service.LoanServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/LoanServlet")
public class LoanServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String loanType = request.getParameter("loanType");
        String city = request.getParameter("city");
        String occupation = request.getParameter("occupation");
        int loanAmount = Integer.parseInt(request.getParameter("loanAmount"));
        boolean termsAccepted = Boolean.parseBoolean(request.getParameter("termsAccepted"));
        int termsAcceptedInt = termsAccepted ? 1 : 0;

        LoanDTO loanDTO=new LoanDTO(fullName,email,phone,loanType,city,occupation,loanAmount,termsAcceptedInt);
        LoanService loanService=new LoanServiceImpl();
        loanService.validate(loanDTO);

    }
}
