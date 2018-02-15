package es.altair.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import es.altair.bean.Cantante;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory;
        StandardServiceRegistry sTR = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        
        Metadata mt = new MetadataSources(sTR).getMetadataBuilder().build();
        
        sessionFactory = mt.getSessionFactoryBuilder().build();
        
        Session session = sessionFactory.openSession();
        
        Cantante c = new Cantante(1234, "Bruce", "Springsteen", 58, "EEUU",2);
        
//        session.beginTransaction();
//        session.save(c);
//        session.getTransaction().commit();
        
        Cantante aux = (Cantante)session.get(Cantante.class,1234);
        System.out.println(aux);
        
//        aux.setNombre("NombreAuxCantante");
//        session.beginTransaction();
//        session.update(aux);
//        session.getTransaction().commit();
     
        session.beginTransaction();
		session.delete(aux);
        session.getTransaction().commit();;
       
      
        
        session.close();
        
        sessionFactory.close();
        
    }
}
