package com.institute;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();

        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM students WHERE email=? AND password=?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Login successful, redirect to payment page
                int studentId = rs.getInt("id");
                response.sendRedirect("payment.jsp?studentId=" + studentId);
            } else {
                out.println("<h2>Invalid Email or Password</h2>");
                out.println("<a href='login.jsp'>Try Again</a>");
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
    

        }
