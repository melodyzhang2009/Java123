/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java123;

/**
 *
 * @author Melody
 */


import javax.swing.JOptionPane;

public class Calculator {

    public static void main(String [] args) {

        String number1= JOptionPane.showInputDialog("Please enter integer1: ");

        String number2= JOptionPane.showInputDialog("Please enter integer2: ");

        String number3= JOptionPane.showInputDialog("please enter integer3: ");

        int int1 = Integer.parseInt(number1);
        int int2 = Integer.parseInt(number2);
        int int3 = Integer.parseInt(number3);

        int sum = int1 + int2 + int3;
        double average = (int1 + int2 + int3)/3;
        double squareRoot = Math.sqrt(sum);
    
        String str = "the sum of the integers is " + Integer.toString(sum);
        JOptionPane.showMessageDialog(null, str);
        String str2 = "the average of the integers is " + Double.toString(average);
        JOptionPane.showMessageDialog(null, str2);
        String str3 = "the square root of sum of three integers is " + Double.toString(squareRoot);
        JOptionPane.showMessageDialog(null, str3);
    }
}
