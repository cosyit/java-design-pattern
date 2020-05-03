package com.cosyit.适配器模式.step2;

import com.cosyit.适配器模式.step1.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //todo nothing,什么也不做。
    }

    @Override
    public void PlayMp4(String fileName) {
        System.out.println("playing mp4 file . file Name : "+fileName);
    }
}
