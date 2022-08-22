package ru.springtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(MusicStyle musicStyle){
        Random random = new Random();

        int randomNum = random.nextInt(3);

        if(musicStyle == MusicStyle.CLASSIC){
            System.out.println(classicalMusic.getSong().get(randomNum));
        }else {
            System.out.println(rockMusic.getSong().get(randomNum));
        }
    }



}

