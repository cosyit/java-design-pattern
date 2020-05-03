package com.cosyit.适配器模式.step2;

import com.cosyit.适配器模式.step1.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc file. fileName:"+fileName);
    }

    @Override
    public void PlayMp4(String fileName) {
        //todo nothing , 什么也不做。
    }
}
