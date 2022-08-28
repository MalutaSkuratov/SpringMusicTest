package ru.springtest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

   private List<Music>musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(MusicPlayer musicStyle){
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong();
    }

    @Value("${musicPlayer.name}")
    private String name;

    public String getName(){
        return name;
    }

    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume(){
        return volume;
    }



}

