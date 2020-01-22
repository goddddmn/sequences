package com.company;
import java.util.Random;
public class task139 {
    public static void main(String[] args) {
        Random rd = new Random();
        int count = 0;
        int s = rd.nextInt(9);
        System.out.println(s);
        int c;
        for(int i = 0; i < 9; i++) {
            c = s ;
            s= rd.nextInt(9);
            System.out.println(s);
            if( s > c) {
                count++;
            }
        }
        System.out.println("="+ count);
    }
}