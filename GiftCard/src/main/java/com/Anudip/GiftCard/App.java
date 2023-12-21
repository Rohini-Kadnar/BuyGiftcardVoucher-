package com.Anudip.GiftCard;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Anudip.GiftCard.hibernateEntity.Card;
import com.Anudip.GiftCard.hibernateEntity.Giftcart;
import com.Anudip.GiftCard.hibernateEntity.Order;
import com.Anudip.GiftCard.hibernateEntity.User;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main( String[] args )
        { Configuration conf= new Configuration().configure().addAnnotatedClass(Giftcart.class).addAnnotatedClass(Order.class).addAnnotatedClass(Card.class).addAnnotatedClass(User.class);   //create configuration with annotated class
        SessionFactory ss=conf.buildSessionFactory();
        Session s = ss.openSession();
        Transaction t=s.beginTransaction();
        
          Giftcart g1=new Giftcart(1,"Electronics","RelianceDigital",500,10,"Excellent");
          Order o1=new Order(1,"Pooja","Pooja@gmail.com ","7684855769","Online");
          Card c1=new Card(101,"SBI","Pooja Karale",431257);
          User u1=new User(101,"Snehal","snehal1232@gmail.com");
             
        s.save(g1);
        s.save(o1);
        s.save(c1);
        s.save(u1);
        
        t.commit();
        ss.close();
             System.out.println( "Hello World!" );
        }
    
    
   
}