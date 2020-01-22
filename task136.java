package com.company;
import java.util.Random;
public class task136 {
    public static void main(String[] args) {
        Random r = new Random();
        int a=0;
        int max=0;
        int count=0;
        int s=r.nextInt(3);
        for(int i = 0; i <10 ; i++) {
            int c = r.nextInt(3);
            System.out.println(c);
            if (s == c) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                s = c;
                count = 1;
            }
        }
        if(count>max){
            max=count;
        }
        System.out.println(max);}}







