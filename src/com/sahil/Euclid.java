package com.sahil;

public class Euclid {
    public int findGCD(int num1, int num2) {
        if( num2 > num1 ) {
            num2 = num2 + num1;
            num1 = num2 - num1;
            num2 = num2 - num1;
        }
        int remainder = num1 % num2;
        if (remainder == 0){
            return num2;
        } else {
            return findGCD(num2, remainder);
        }
    }
}
