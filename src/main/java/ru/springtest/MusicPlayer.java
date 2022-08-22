package ru.springtest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private FolkMusic folkMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, FolkMusic folkMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.folkMusic = folkMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + classicalMusic.getSong());
        System.out.println("Playing: " + rockMusic.getSong());
        System.out.println("Playing: " + folkMusic.getSong());


    }
}

