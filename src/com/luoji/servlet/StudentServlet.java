package com.luoji.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luoji.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/studentServlet")
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student(1, "mary", 15);
        Student student1 = new Student(2, "tom", 18);
        Student student2 = new Student(3, "hanmeimei", 22);
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(list);
        PrintWriter writer = response.getWriter();
        writer.print(s);
        writer.close();
    }
}
