package ru.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Winamp winamp = context.getBean("winamp", Winamp.class);
        System.out.println(winamp);


        context.close();
    }
}

// Цепочка зависимостей Winamp -> MusicPlayer -> ClassicalMusic и RockMusic
