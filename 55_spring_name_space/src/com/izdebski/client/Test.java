package com.izdebski.client;

import com.izdebski.model.Course;
import com.izdebski.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        Student student = ctx.getBean("student", Student.class);

        System.out.println(student.getName()+"\t" + student.getAge());

        System.out.println("-------------------------");

        Course course = student.getCourse();

        System.out.println(course.getCourseName());

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}