package com.company;

public class Scope_Block_Scope {
    public static void main(String[] args) {
        /*Block Scoping :
            Anything initialised outside the block can be used inside the block .
            But anything initialised inside cannot be used outside the block.
         */
        int a =20;  //Initialised outside
        int b=19;

        {
//            int a=30; //Error: Because a is already initialised
              int c=10;
              b=40;  //Change the original because we are
                     // assigning value to original value itself
        }
//        System.out.println(c);
        System.out.println(b);
        //Error Because c is in the block, so it can only be
        //used there only

        //Block Scoping :
        //Means value initialised in the block will use only in the block
        //Can not used outside the block
        //But value initialised outside can be used inside
    }
}
