package bai3;

import javax.swing.*;
import javax.swing.JOptionPane;
public class ex6_10 {
    public static void main(String[] args) {
        String radiusStr;
        double radius;
        radiusStr= JOptionPane.showInputDialog("Enter the radius of the circle");
        radius =double.class.cast(radiusStr);
        double area = radius * radius * Math.PI;
        System.out.println("The area is"+area);

    }
}
