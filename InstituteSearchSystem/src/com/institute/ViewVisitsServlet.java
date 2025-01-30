package com.institute;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewVisitsServlet")
public class ViewVisitsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT students.name, students.email, institutes.name AS institute FROM students INNER JOIN institutes ON students.institute_id = institutes.id";
            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<h2>Visitor Details:</h2>");
            while (rs.next()) {
                out.println("<p>Student: " + rs.getString("name") + ", Email: " + rs.getString("email") + ", Institute: " + rs.getString("institute") + "</p>");
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

        
