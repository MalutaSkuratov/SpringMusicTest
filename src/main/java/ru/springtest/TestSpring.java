package ru.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");



        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(musicPlayer));

        context.close();
    }
}


