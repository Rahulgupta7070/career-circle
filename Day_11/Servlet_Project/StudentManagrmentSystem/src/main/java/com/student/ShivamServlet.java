package com.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShivamServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        

        String studentName = request.getParameter("studentName");
        String rollNumber = request.getParameter("rollNumber");
        String email = request.getParameter("email");
        String ageString = request.getParameter("age");
        String course = request.getParameter("course");
        String gender = request.getParameter("gender");

      

        int age = Integer.parseInt(ageString);

 
//if (studentName == null || studentName.isEmpty())
        if (studentName == null || studentName.isEmpty()) {

            request.setAttribute("error",
                    "Student Name should not be empty.");

        } else if (email.isEmpty()) {

            request.setAttribute("error",
                    "Email should not be empty.");

        } else if (age < 18) {

            request.setAttribute("error",
                    "Age must be 18 or above.");

        } else if (course.isEmpty()) {

            request.setAttribute("error",
                    "Please select a course.");

        } else {

           

            request.setAttribute("studentName", studentName);
            request.setAttribute("rollNumber", rollNumber);
            request.setAttribute("email", email);
            request.setAttribute("age", age);
            request.setAttribute("course", course);
            request.setAttribute("gender", gender);

            request.setAttribute("message",
                    "Registration Successful");
        }

     

        RequestDispatcher rd =
                request.getRequestDispatcher("student.jsp");

        rd.forward(request, response);
    }
}