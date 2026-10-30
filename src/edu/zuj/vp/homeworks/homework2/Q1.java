package edu.zuj.vp.homeworks.homework2;

import javax.swing.*;

public class Q1 {
    String number;
    static void main() {

        //Calculator Application
        //Menu
        String menu = """
                Choose One of The Following:
                1- CM to Inche
                2- Inche to CM
                3- Feet to Meter
                4- Meter to Feet
                5- Dunm to Hiktar
                6- Hiktar to Dunm
                7- Cels to Feh
                8- Feh to Cels
                """;

        //GUI
        String number = JOptionPane.showInputDialog(menu);
        int num = Integer.parseInt(number);
        //Limiting the range
        if(!(num>=1&&num<=8))
        {
            JOptionPane.showMessageDialog(null,"Choose from 1 to 8 ONLY");
            System.exit(0);
        }

        String val = JOptionPane.showInputDialog("Enter The Value You Want To Convert");
        int value = Integer.parseInt(val);


        switch(num)
        {
            case 1 -> JOptionPane.showMessageDialog(null,value/2.54);
            case 2 -> JOptionPane.showMessageDialog(null,value*2.54);
            case 3 -> JOptionPane.showMessageDialog(null,value*0.3048);
            case 4 -> JOptionPane.showMessageDialog(null,value/0.3048);
            case 5 -> JOptionPane.showMessageDialog(null,value*0.1);
            case 6 -> JOptionPane.showMessageDialog(null,value/0.1);
            case 7 -> JOptionPane.showMessageDialog(null,(value*1.8)+32);
            case 8 -> JOptionPane.showMessageDialog(null,(value-32)*0.5555555555);
        }

    }
}
