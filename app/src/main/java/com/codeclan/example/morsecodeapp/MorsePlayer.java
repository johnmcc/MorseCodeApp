package com.codeclan.example.morsecodeapp;

/**
 * Created by user on 16/06/2017.
 */

import android.media.AudioManager;
import android.media.ToneGenerator;

public class MorsePlayer extends Thread {
    String morse;
    ToneGenerator tg;

    public MorsePlayer() {
        tg = new ToneGenerator(AudioManager.STREAM_ALARM, 100);
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }

    private void sleep(int duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        String words[] = this.morse.split(" / ");
        Character dit = '.';
        Character dah = '-';

        for(String word:words){
            String splitted[] = word.split(" ");

            for(String letter:splitted){
                if(letter.equals(" ")){

                }else{
                    int duration = 0;
                    for(Character c:letter.toCharArray()){
                        if(c == dit){
                            duration = 100;
                        }else if(c == dah){
                            duration = 350;
                        }
                        tg.startTone(ToneGenerator.TONE_CDMA_ABBR_ALERT, duration);
                        sleep(duration + 50);
                    }
                }
                sleep(400);
            }
        }
    }
}
