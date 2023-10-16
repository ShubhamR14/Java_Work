package com.tute;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started");
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
//        SessionFactory factory = (SessionFactory) new Configuration().configure().buildSessionFactory();
       
        Student st= new Student();
        st.setName("Natli");
        st.setCity("Kambodia");
        st.setId(43);				
        // we create the object of the student
        System.out.println(st);
        
        //factory find the current session 
        Session session = factory.openSession();
        
        //session is beginTransection
        Transaction tx=session.beginTransaction();
        
        //Now it will save the st object
        session.save(st);
        
        //the tansection which is insde is commited
        tx.commit();
        
        //at last the the session is sava and close
        session.close();
        
        
    }
}
