package com.company;
import java.util.Random;
public class task133 {
    public static void main(String[] args) {
        Random r = new Random();
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++) {
            int c = r.nextInt(4);
            System.out.println(c);
            if( c > max) {
                max = c;
                count = 1;
            }
            else if( max == c) {
                count++;
            }
        }
        System.out.println (count);
    }
}
//Использование константы Integer.MIN_VALUE позволяет избежать
//необходимости присваивания переменной max значения нулевого элемента
//массива до начала циклического просмотра остальных элементов.