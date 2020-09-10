package com.company.twoKatas.roman;

import java.util.TreeMap;

public class Roman {


    // Dette er hvad jeg startede med, efter jeg have lavet en test der fejlede.
    public String intToRomanOLD(int number)  {
        if(number == 1) return "I";
        if(number == 4) return "IV";
        if(number == 5) return "V";
        if(number == 9) return "IX";
        if(number == 10) return "X";
        if(number == 40) return "XL";
        else return null;

    }


    // Færdig løsning. Størstedelen lånt fra stackoverflow -> Ben-Hur Langoni Junior
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public String intToRoman(int number)  {

        if(number == 0) return null;

            int l = map.floorKey(number);
                //System.out.println(l);
            if (number == l) {
                return map.get(number);
            }
            return map.get(l) + intToRoman(number - l);
        }




}
