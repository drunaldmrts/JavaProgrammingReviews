package week08_10_29_2022;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
         /*
        Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"
		int[] x = {1,2,3};			 // = > [2,3,1]
		int[] y = {17,12,10,8};		 // = > [12,10,8,17]
		int[] a = {7,0,0}; 			 // = > [0,0,7]
         */
        /*
        int temp=x[0];
        //first place = 2
        x[0]=x[1];
        //second place=3
        x[1]=x[2];
        last=1
        x[2]=temp;
         */
        int[] x = {1,2,3};

        int temp=x[0];

        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];
        }
        x[x.length-1]=temp;
        System.out.println(Arrays.toString(x));

        System.out.println("---------------------------------------");

        int[] y = {17,12,10,8};
        int temp1=y[0];

        for (int i = 0; i < y.length-1; i++) {
            y[i]=y[i+1];
        }
        y[y.length-1]=temp1;
        System.out.println(Arrays.toString(y));
    }
}
