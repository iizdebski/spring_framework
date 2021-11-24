package com.izdebski.clientTest;

import com.izdebski.info.CompanyInfo;
import com.izdebski.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        CompanyInfo companyInfo = ctx.getBean("companyInfo", CompanyInfo.class);

        Map<Integer, String> empIdAndNameMap = companyInfo.getEmpIdAndNameMap();

        Set<Entry<Integer, String>> entrySet = empIdAndNameMap.entrySet();
        for (Entry<Integer, String> entry : entrySet){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }

        System.out.println("--------------------------------------");

        Map<Integer, Student> studentIdMap = companyInfo.getStudentIdMap();
        Set<Entry<Integer, Student>>entrySet2 = studentIdMap.entrySet();
        for (Entry<Integer, Student> entry : entrySet2){

            System.out.println(entry.getKey());
            Student student = entry.getValue();

            System.out.println(student.getStudentId()+"\t"+student.getStudentName());
        }
        ((AbstractApplicationContext) ctx).close();
    }
}