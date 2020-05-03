package com.cosyit.适配器模式.step3;

import com.cosyit.适配器模式.step1.AdvancedMediaPlayer;
import com.cosyit.适配器模式.step1.MediaPlayer;
import com.cosyit.适配器模式.step2.Mp4Player;
import com.cosyit.适配器模式.step2.VlcPlayer;

/**
 * 创建一个实现了MediaPlayer 接口的适配器类。
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer=new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.PlayMp4(fileName);
        }
    }
}
