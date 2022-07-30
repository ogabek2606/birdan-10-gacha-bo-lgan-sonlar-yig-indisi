package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int sum = 0;

        for(int i=0; i<=a; i++){
            if( i % 2 == 0){
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
