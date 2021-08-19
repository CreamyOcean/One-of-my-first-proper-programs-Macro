package harf;

import PersonalUtilities.randomUtilities.AutoFrame;
import PersonalUtilities.randomUtilities.str;
//This is a package I made with methods for things that are used here, methods created there are:
// 1. stringToMacro
// 2. toIntArray
// 3. startsWithIgnoreCase

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Macro {

    //This TextField is for inputting the amount of times a macro is used
    static TextField jopNumber = new TextField();

    //TextField in which I type the macro's instructions
    static TextField jopText = new TextField();

    //AutoFrame is from my PersonalUtilities package, it basically is just an easy setup for JFrame.
    //I see myself using JFrame more and more lately, helps to not have to go through all the hassle
    static AutoFrame jop = new AutoFrame("Macro Activation");

    //Activates the window that makes all this stuff work
    static JButton b = new JButton("Macro");

    static Image img = Toolkit.getDefaultToolkit().getImage("D:\\Users\\Whipo\\Downloads\\download.png");

    public static void notFocused(WindowEvent e) throws AWTException {
        boolean isFocused = e.getWindow().isFocused();

        int textNum =  Integer.parseInt(jopNumber.getText());
        int startNum = 0;

        if (jop.isVisible()) {
            do {
                do {
                    str.stringToMacro(jopText.getText());
                    startNum++;
                } while (startNum < textNum);
                
                if (e.getWindow().isFocused()) {
                    isFocused = true;
                }
                
            } while (isFocused);
        }
    }

    public static void main(String[] args) {
        
            //JFrame creation
            AutoFrame frame = new AutoFrame("Macro Builder");

            b.setBounds(75, 100, 240, 80);
            b.setBackground(Color.lightGray);
            frame.setSVB(400, 250, true, null, b, WindowConstants.EXIT_ON_CLOSE);
            frame.setIconImage(img);
            frame.getContentPane().setBackground(Color.lightGray);

        //TextField settings
                jopText.setBounds(0, 0, 250, 35);
                jopNumber.setBounds(251, 0, 50, 120);
                
        //Buttons for the jop
        JButton jop1 = new JButton("Close");
                jop1.setBounds(0, 35, 250, 50);
                jop1.setBackground(Color.lightGray);

        //Text window's settings for macro activation.

                jop.add(jopNumber);
                jop.add(jopText);

                jopNumber.setBackground(Color.LIGHT_GRAY);
                jopText.setBackground(Color.LIGHT_GRAY);
                jop.setIconImage(img);
                jop.getContentPane().setBackground(Color.lightGray);

                jop.setResizable(false);
                jop.setSVB(315, 125, false, null, jop1, 1);

        jop.setAlwaysOnTop(true);
        jop.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {

            }
            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Found it!");
                try {
                    notFocused(e);
                } catch (AWTException awtException) {
                    awtException.printStackTrace();
                }
            }
        });
        
        b.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jop.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jop1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jop.setVisible(false);


            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Looking for text field...");
            }
        });
    }
}


