package com.institute;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        int instituteId = Integer.parseInt(request.getParameter("instituteId"));
        PrintWriter out = response.getWriter();

        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "INSERT INTO students (name, email, password, institute_id) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setString(2, email);
            pstmt.setString(3, password);
            pstmt.setInt(4, instituteId);
            pstmt.executeUpdate();

            response.sendRedirect("login.jsp");
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
        }
