package ru.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicStyle musicStyle = MusicStyle.ROCK;

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicStyle.ROCK);
        musicPlayer.playMusic(MusicStyle.CLASSIC);


        context.close();
    }
}


