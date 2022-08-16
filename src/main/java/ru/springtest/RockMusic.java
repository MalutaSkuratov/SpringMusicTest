package ru.springtest;

public class RockMusic implements Music{

    private RockMusic(){

    }

    protected static RockMusic getRockMusic(){
        return new RockMusic();
    }



    @Override
    public String getSong() {
        return "Rammstein - Sonne";
    }
}
