package ru.springtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;

    public MusicPlayer(){
    }

    @Autowired
    public MusicPlayer(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }


    public void playMusic() {
        System.out.println("Playing: " + rockMusic.getSong());


    }
}

