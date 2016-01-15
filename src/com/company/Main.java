package com.company;

public class Main {

    public static void main(String[] args) {

        // the last number is a place holder
        int a[] = {1,2,3,4,5,6,7,8,9,0};


        int temp1 = a[0];

        for(int i = 0; i < a.length; i++){

            if( i < a.length - 1) {
                int temp2 = a[i + 1];
                a[i + 1] = temp1;
                temp1 = temp2;
            }
        }

        //clear a[0] since it's value was shifted
        a[0] = 0;

        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }


    }
}
