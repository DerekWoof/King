package com.king;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Rafal on 2017-10-24.
 */
public class App {

    public static void main(String [] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        King king = (King) context.getBean("king");
        king.kill();
        king.promote();
        King king1 = (King) context.getBean("king");
        King king2 = (King) context.getBean("king");
        King king3 = (King) context.getBean("king");
        King king4 = (King) context.getBean("king");
    }

}
