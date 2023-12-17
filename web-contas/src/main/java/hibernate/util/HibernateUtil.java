package hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


import model.Conta;


public class HibernateUtil {


 private static SessionFactory sessionFactory;
  public static SessionFactory getSessao() {
   if(sessionFactory == null) {
     try {
       Configuration configuration = new Configuration();
      
       Properties properties = new Properties();
      
       properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
       properties.put(Environment.URL, "jdbc:mysql://localhost:3306/java?serverTimezone=America/Sao_Paulo");
       properties.put(Environment.USER, "root");
       properties.put(Environment.PASS, "admin");
       properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect"); 
       properties.put(Environment.SHOW_SQL, "true");
       properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
       properties.put(Environment.HBM2DDL_AUTO, "update"); // create-drop
      
       configuration.setProperties(properties);
       configuration.addAnnotatedClass(Conta.class);
      
       ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
           .applySettings(configuration.getProperties()).build();
      
       sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      
     } catch (Exception e) {
       e.printStackTrace();
     }
   }
  
   return sessionFactory;
 }
 }

