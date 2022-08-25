package ru.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;
import java.util.List;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:musicPlayer.properties")
public class Configuration {

    @Bean
    @Scope("prototype")
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    @Scope("prototype")
    public FolkMusic folkMusic(){
        return new FolkMusic();
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(rockMusic(),classicalMusic(),folkMusic());
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }
}
