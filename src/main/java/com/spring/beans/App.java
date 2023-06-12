package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //REMPLAZAMOS POR SPRING
        //Mundo m = new Mundo(); //
        //m.getSaludo();         //
        //**//

        //ApplicationContext appContext = new ClassPathXmlApplicationContext("com/spring/xml/beans.xml");
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Mundo m = (Mundo) appContext.getBean("mundo");
        System.out.println(m.getSaludo());
        ((ConfigurableApplicationContext)appContext).close();

    }
}
