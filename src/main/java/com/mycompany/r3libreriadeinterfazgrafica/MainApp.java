/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r3libreriadeinterfazgrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HP-TRABAJO
 */
public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Librerías de GUI en Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new java.awt.FlowLayout());

        JButton swingButton = new JButton("Swing");
        JButton awtButton = new JButton("AWT");
        JButton swtButton = new JButton("SWT");

        swingButton.addActionListener((ActionEvent e) -> {
            SwingUtilities.invokeLater(() -> new SwingDemo().createAndShowGUI());
        });
        awtButton.addActionListener((ActionEvent e) -> {
            AWTDemo.launchAWTDemo();
        });
        swtButton.addActionListener((ActionEvent e) -> {
            SWTDemo.launchSWTDemo();
        });

        frame.add(swingButton);
        frame.add(awtButton);
        frame.add(swtButton);

        frame.setVisible(true);
    }
}
