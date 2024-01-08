package ru.kononovea;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(e -> System.out.println("Don't do it, ypu might regret it!"));
        button.addActionListener(e -> System.out.println("Come on, do it!"));

        //////

    }
}
