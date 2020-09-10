package com.company.twoKatas.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {

    @Test
    void toRoman_MustResturnCM_WhenInput900() {

        // arrange
        Roman r = new Roman();
        int num = 900;
        String expected = "CM";

        // act
        String res = r.intToRoman(num);

        // assert
        assertTrue(expected == res);
    }

    @Test
    void toRoman_MustReturnNull_WhenInput0() {

        // arrange
        Roman r = new Roman();
        int num = 0;
        String expected = null;

        // act
        String res = r.intToRoman(num);

        // assert
        assertTrue(expected == res);
    }
}