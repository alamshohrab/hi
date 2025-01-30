package com.institute;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Simulating payment process
        String studentName = request.getParameter("studentName");
        String course = request.getParameter("course");
        
        // Assume payment is successful
        boolean paymentSuccessful = true;

        if (paymentSuccessful) {
            // Redirect to admission confirmation page with student details
            response.sendRedirect("admissionConfirmation.jsp?studentName=" + studentName + "&course=" + course);
        }else {
        	response.getWriter().println("<h2>Payment Failed<h2>");
        	
        } 
        }
}
