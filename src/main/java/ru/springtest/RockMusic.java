package ru.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> rockMusicList = new ArrayList<>();
    {
        rockMusicList.add("Rammstein - Sonne");
        rockMusicList.add("Metallica - St.Anger");
        rockMusicList.add("Pain - Shat your mouth");
    }


    @Override
    public List<String> getSong() {
        return rockMusicList;
    }
}
