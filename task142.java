package com.company;
import java.util.Random;
public class task142 {
    public static void main(String[] args) {
        Random rd = new Random();
        int max=-1;
        int max2=-1;
        for(int i = 0; i < 9; i++) {
            int s = rd.nextInt(9);
            System.out.println(s);
        }
    }
}