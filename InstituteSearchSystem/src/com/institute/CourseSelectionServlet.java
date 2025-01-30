package com.institute;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
@WebServlet("/CourseSelectionServlet")
public class CourseSelectionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String course = request.getParameter("course");
        HttpSession session = request.getSession();
        session.setAttribute("selectedCourse", course);

        // Redirect to the class schedule page
       response.sendRedirect("schedule.jas?course="  + course);
    }
}