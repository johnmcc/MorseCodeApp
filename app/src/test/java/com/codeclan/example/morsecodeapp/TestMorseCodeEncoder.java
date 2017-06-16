package com.codeclan.example.morsecodeapp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class TestMorseCodeEncoder {
    Encoder encoder;

    @Before
    public void before(){
        encoder = new Encoder();
    }

    @Test
    public void testGetPhrase() throws Exception {
        encoder.setPhrase("The quick brown fox");
        assertEquals("The quick brown fox", encoder.getPhrase());
    }

    @Test
    public void testEmptyStringReturnsEmptyString() throws Exception {
        encoder.setPhrase("");
        assertEquals("", encoder.encode());
    }

    @Test
    public void testMultipleWords() throws Exception {
        encoder.setPhrase("The Quick Brown Fox");
        assertEquals("- .... . / --.- ..- .. -.-. -.- / -... .-. --- .-- -. / ..-. --- -..-", encoder.encode());
    }

    @Test
    public void testSingleWord() throws Exception {
        encoder.setPhrase("sos");
        assertEquals("... --- ...", encoder.encode());
    }

    @Test
    public void testNumbers() throws Exception {
        encoder.setPhrase("help please phone 999");
        assertEquals(".... . .-.. .--. / .--. .-.. . .- ... . / .--. .... --- -. . / ----. ----. ----.", encoder.encode());
    }
}
