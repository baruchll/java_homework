package com.company;

public class Main {

    public static void main(String[] args) {

        // System.out.println(primeN(7));
        // System.out.println(prime(1000));
         System.out.println(Sum(10));
    }
//שאלה 1
public static boolean primeN(int num){
    for(int i = 2; i < num/2; i++){
        if (num % i == 0){
            return false;
        }
    }
    return true;
}
    //שאלה 2
    public static int prime(int num) {

        int i, j;
        int count = 0;
        for (i = 2; i <= 1000000; i++) {
            boolean IsPrime = true;

            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    IsPrime = false;
                    break;
                }
            }
            if (IsPrime) {
                if (IsPrime = true) {
                    count++;
                }
                if (count >= num) {
                    break;
                }
                System.out.println(i + ",");

            }

        }


        return i;
    }

//שאלה 3
    public static int Sum(int num) {

        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;

        }

        return res ;
    }



}
