package com.izdebski.client;

import com.izdebski.model.UserInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map.Entry;

import java.util.Properties;
import java.util.Set;

public class Test {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");

        UserInfo userInfo = ctx.getBean("userInfo", UserInfo.class);

        Properties properties = userInfo.getUserInfo();

        Set<Entry<Object, Object>> entrySet = properties.entrySet();

        for (Entry<Object, Object> entry : entrySet){
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}