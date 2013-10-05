package com.sjl.ant;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {
			public static void main(String[] args) {
				JFrame jFrame = new JFrame("Hello Ant");
				jFrame.setSize(new Dimension(200, 300));
				jFrame.setBackground(new Color(200, 200, 200));
				jFrame.setAlwaysOnTop(true);
				jFrame.getContentPane().add(new JButton("Ant"));
				jFrame.setVisible(true);
				jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
}
