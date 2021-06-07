package com.cybertek.utilities;

public class BrowserUtils {

    /**
     * Method that will accept int
     * Wait for given second duration
     */
    public static void sleep(int second){

        second*=1000;
        //1sec =1000 milli seconds
        // 1* 1000


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("something happened in the sleep method");

            //e.printStackTrace();
        }

    }


}
