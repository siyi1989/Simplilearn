package com.simplilearn;
public class SwitchTest {
    public static void main(String[] args) {
        //char grade = 'B'; // key
    	char grade=args[0].charAt(0);
        switch (grade) {
        case 'A':
            System.out.println("Excellent!");
            break;
        case 'B':
        case 'C':
            System.out.println("Well done");
            break;
        case 'D':
            System.out.println("You Passed");
        case 'F':
            System.out.println("Better try again");
            break;
        default:
            System.out.println("Invalid grade");
            break;
        }
        System.out.println("Your grade is " + grade);
    }
}

