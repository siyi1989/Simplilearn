package com.simplilearn;
import javax.swing.JOptionPane;
public class SwitchStringStatement {
    public static void main(String[] args) {
        //String color = "Blue"; hard coded
        String color = JOptionPane.showInputDialog("Enter color:");// dynamic
        String shirt = " Shirt";
        switch (color) {
        case "Blue":
            shirt = "Blue" + shirt;
            break;
        case "Red":
            shirt = "Red" + shirt;
            break;
        default:
            shirt = "White" + shirt;
        }
        
        System.out.println("Shirt Type : " + shirt);
    }
}