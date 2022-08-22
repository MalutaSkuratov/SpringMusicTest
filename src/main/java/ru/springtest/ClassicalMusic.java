package ru.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicList = new ArrayList<>();
       {
        classicalMusicList.add("Wagner - Flight of the Valkyries");
        classicalMusicList.add("Mozart - Requiem");
        classicalMusicList.add("Bach - suite no 2");
    }


    @Override
    public List<String> getSong() {
        return classicalMusicList;
    }
}
