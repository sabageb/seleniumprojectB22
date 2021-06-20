package com.cybertek.tests.day12_actio_appload_javscriptexecutor;

public class Singleton {
/**
    We will create similar logic we created in Driver utility class.
    But it will be for a String.
            */

    //Creat private constructor
    private Singleton() {}

        //By making the String  word private,
        //we will ensure we create access only through our getter method
        private static String word;


        //we allow user to access "word" in the way we want them to have
        public static String getWord(){

            if (word == null) {
                System.out.println("First time call, word object is null.");
                word = "something";

            }else {
                System.out.println("Word already has value.");
            }

return word;
        }


    }


