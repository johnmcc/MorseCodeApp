package com.codeclan.example.morsecodeapp;

import java.util.HashMap;

/**
 * Created by user on 16/06/2017.
 */

class Encoder {
    private String phrase;
    private HashMap<Character, String> mappings;

    public Encoder() {
        mappings = new HashMap<Character, String>();
        mappings.put('a', ".-");
        mappings.put('b', "-...");
        mappings.put('c', "-.-.");
        mappings.put('d', "-..");
        mappings.put('e', ".");
        mappings.put('f', "..-.");
        mappings.put('g', "--.");
        mappings.put('h', "....");
        mappings.put('i', "..");
        mappings.put('j', ".---");
        mappings.put('k', "-.-");
        mappings.put('l', ".-..");
        mappings.put('m', "--");
        mappings.put('n', "-.");
        mappings.put('o', "---");
        mappings.put('p', ".--.");
        mappings.put('q', "--.-");
        mappings.put('r', ".-.");
        mappings.put('s', "...");
        mappings.put('t', "-");
        mappings.put('u', "..-");
        mappings.put('v', "...-");
        mappings.put('w', ".--");
        mappings.put('x', "-..-");
        mappings.put('y', "-.--");
        mappings.put('z', "--...");

        mappings.put('1', ".----");
        mappings.put('2', "..---");
        mappings.put('3', "...--");
        mappings.put('4', "....-");
        mappings.put('5', ".....");
        mappings.put('6', "-....");
        mappings.put('7', "--...");
        mappings.put('8', "---..");
        mappings.put('9', "----.");
        mappings.put('0', "-----");
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String encode() {
        StringBuilder sb = new StringBuilder();
        for(char c:this.phrase.trim().toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(mappings.get(c) + " ");
            }else{
                sb.append("/ ");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}
