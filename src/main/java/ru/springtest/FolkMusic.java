package ru.springtest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FolkMusic implements Music {
    private List<String>folkMusicList = new ArrayList<>();
    {
        folkMusicList.add("In Extremo - Vollmond");
        folkMusicList.add("Arkona - Rus");
        folkMusicList.add("Gray - Mara");
    }

    @Override
    public List<String> getSong() {
        return folkMusicList;
    }
}
