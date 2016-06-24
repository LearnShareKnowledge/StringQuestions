package com.lska;

/**
 * Created by 310124463 on 6/24/2016.
 */
public class Swap {

    public static void main (String [] args)
    {
        int x = 2 ;

        int y = 4 ;


        // First way

       /* int temp = x;

        x = y;

        y= temp ;*/


        // Second way

       /* x = x+y ;

        y = x- y ;

        x = x- y ;*/

        // Third way

        x = x ^ y ;

        y = x ^ y ;

        x = x ^ y ;


        System.out.println("x "+ x);

        System.out.println("y "+ y);
    }
}
