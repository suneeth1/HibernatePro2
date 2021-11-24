package com.dxc.HibernatePro2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dxc.HibernatePro2.persist.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Starts!" );
        Configuration conf=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=conf.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        Employee obj=new Employee();
        obj.setRoll(103);
        obj.setEname("Shashank");
        obj.setJob("ASE");
        session.save(obj);
        t.commit();
        System.out.println("Done");
           
    }
}
