package com.company;
import java.util.Random;
public class task140 {
    public static void main(String[] args) {
        Random rd = new Random();
        int max=-1;
        int max2=-1;
        for(int i = 0; i < 9; i++) {
            int s = rd.nextInt(9);
            System.out.println(s);
            if(s>max){
                max2=max;
                max=s;
            }
        }
        if(max2==-1){
            System.out.println("NO");
        }
        else{
            System.out.println("="+ max2);
        }
    }
}