package ru.springtest;

public class FolkMusic implements Music{

    private FolkMusic(){

    }

    public static FolkMusic getFolkMusic(){
        return new FolkMusic();
    }



    @Override
    public String getSong() {
        return "In Extremo -  Vollmond";
    }
}
