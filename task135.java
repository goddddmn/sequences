package com.company;
import java.util.Random;
public class task135 {
    public static void main(String[] args) {
        Random r= new Random();
        int count = 0;
        double sum = 0;
        for(int i = 0; i < 9; i++) {
            double a = r.nextDouble()*100;
            System.out.println(a);
            count++;
            sum += a;
        }
        double ar= sum/count;
        System.out.println(ar);
    }
}