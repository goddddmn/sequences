package com.company;
import java.util.Random;
public class task138 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 0;
        int count = 0;
        for (int i = 0; i < 9; i++) {
            int c = r.nextInt(9);
            System.out.println(c);
            count++;
            if(c==0){
                n=count;
                break;
            }
        }
        System.out.println(n);
    }
}