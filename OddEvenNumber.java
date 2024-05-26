package com.company;
import java.util.*;
public class OddEvenNumber {

        public static void main (String args[]){

            Scanner ob=new Scanner(System.in);
            int a,b;
            System.out.println("Enter any number");
            a=ob.nextInt();
            if(a%2==0)
                System.out.println("Your no is an Even");
            else
                System.out.println("Your no is an Odd");
        }
    }

