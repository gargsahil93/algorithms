package com.sahil;

public class HelloWorld {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );


        Euclid euclid = new Euclid();
        System.out.println("GCD of 18 and 19 is " + euclid.findGCD(18, 19));
        System.out.println("GCD of 10 and 5 is " + euclid.findGCD(5, 10));



        System.exit( 0 ); //success
    }
}
