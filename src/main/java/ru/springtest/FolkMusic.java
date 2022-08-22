package ru.springtest;

import org.springframework.stereotype.Component;

@Component
public class FolkMusic implements Music{



    @Override
    public String getSong() {
        return "In Extremo -  Vollmond";
    }
}
