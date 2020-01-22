package com.company;
import java.util.Random;
public class task137 {
    public static void main(String[] args) {
        Random r = new Random();
        int a=0;
        int b=0;
        int max=-1;
        int count=0;
        for(int i = 0; i <9 ; i++) {
            int c = r.nextInt(9);
            System.out.println(c);
            count++;
            if (c>max){
                max=c;
                a=count;
                b=count;
            }
            else if(c==max){
                b=count;
            }
        }
        System.out.println(a+" "+b);
    }
}