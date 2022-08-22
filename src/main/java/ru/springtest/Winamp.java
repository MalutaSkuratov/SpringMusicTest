package ru.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Winamp {

    private MusicPlayer musicPlayer;

    @Autowired
    public Winamp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Winamp playing " + musicPlayer.playMusic();
    }
}
