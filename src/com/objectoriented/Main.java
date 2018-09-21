package com.objectoriented;
/* the program takes a number from the user
* checks first if the number is even or odd
* if the number is even it divides it by 2
* if its odd  multipys it by 3 and add 1
 * and displays the sequence of numbers on the screen
 * if the user wants to input another number he will press 1 otherwise any key from keyboard to finish the program
 * */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean check = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a number: ");
        //enter an number
        int num = input.nextInt();
        //call a method to produce a sequence of numbers
        seqNumber(num);

        while(check){
            System.out.println("\nWould You like to input another number if yes Press 1 if not press any keyboard key to Quite ");
            int num2=input.nextInt();     // press 1 to continue or any other key to finish the program
            if(num2==1) {
                System.out.println("\n Please Enter a number: ");
                num = input.nextInt();                       // input the other number
                seqNumber(num);
            }else{
                System.out.println("Good Bye !!!!!");
                check =false;                             // finishes the program
            }
        }
    }

    private static void seqNumber(int number ) {

        System.out.print(" " + number + " ");    // outputs the first number
        int count=2;

        while ( count!=1) {
            if (number % 2 == 0) {         // checks is it is even
                number = number / 2;
                System.out.print(" "+number+" ");
            } else {                              // checks and works if it is odd
                number = number * 3 + 1;
                System.out.print(" "+ number+ " ");
            }
            count =number;
        }
    }
}
