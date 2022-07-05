package com.greatlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("web.xml");
        JdbcTemplate template=(JdbcTemplate)context.getBean("JdbcTemplate");
     String query="insert into employee(empid,empname,empaddress)values(?,?,?)";
     int result= template.update(query,1001,"Suresh","Kolkata");
     System.out.println("inserted successfully");
     }
}
