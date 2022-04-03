package com.simplilearn;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class IfElseIf {
    public static void main(String[] args) {
//        
//        System.out.println("Enter the value for x: ");
//        
//        Scanner scanner  = new Scanner(System.in);
//        int x =  scanner.nextInt();
        
        String input = JOptionPane.showInputDialog("Enter value for x :");
        
//        int x = input; Errr
        int x = Integer.parseInt(input);
        
        if ( x == 10 ) {
            System.out.println("value of x is 10");
        }else if ( x == 20 ){
            System.out.println("value of x is 20");
        }else if ( x == 30 ) {
            System.out.println(" value of x is 30");
        }else {
            System.out.println("This is else statement");
        }
    }
}