package com.institute;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String location = request.getParameter("location");
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM institutes WHERE location=?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, location);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Redirect to the registration page with the first institute found
                int instituteId = rs.getInt("id");
                String instituteName = rs.getString("name");

                response.sendRedirect("register.jsp?instituteId=" + instituteId + "&instituteName=" + instituteName);
            } else {
                PrintWriter out = response.getWriter();
                out.println("<h2>No institutes found in " + location + "</h2>");
                out.println("<a href='index.jsp'>Go Back</a>");
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

        
