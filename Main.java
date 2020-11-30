package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
        binaryFunc(14);
        //factorial(4);
        //func(10);


       
    }
    //שאלה 1
    public static void binaryFunc(int num){
        String res = "";
        while (num !=0){
            res += num % 2;
            num/=2;
        }
        for (int i = res.length() - 1; i >=0; i--){
            System.out.print(res.charAt(i));
        }
    }

    //שאלה 2
    public static void func(int num){
        Random r=new Random();
        int[] random=new int[5];
        int[] distance=new int[5];

        for (int i=0;i<random.length;i++){
            random[i]=r.nextInt(100);
            System.out.println(random[i]);
           distance[i]= Math.abs(num-random[i]);


        }
        int min=distance[0];
        num=min;
        for(int i=0;i<random.length;i++){
            if(min>distance[i]){
                min=distance[i];
                num=random[i];

            }
        }


        System.out.println("min: "+num);




    }

    //שאלה 3
    public static void factorial(int num) {

        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;

        }

        System.out.println(res);
    }





}
