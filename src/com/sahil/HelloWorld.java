package com.sahil;

import java.lang.reflect.Array;

public class HelloWorld {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


//        Euclid euclid = new Euclid();
//        System.out.println("GCD of 18 and 19 is " + euclid.findGCD(18, 19));
//        System.out.println("GCD of 10 and 5 is " + euclid.findGCD(5, 10));

//        BubbleSort bubble = new BubbleSort();
//        bubble.sort(new int[]{10,9,8,7,6,5,4,3,2,1});

        SelectionSort selection = new SelectionSort();
        selection.sort(new int[]{10,9,8,7,6,5,4,3,2,1});


        System.exit( 0 ); //success
    }
}
