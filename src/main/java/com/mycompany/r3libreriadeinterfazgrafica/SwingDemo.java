/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r3libreriadeinterfazgrafica;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HP-TRABAJO
 */
public class SwingDemo {
     public void createAndShowGUI() {
        JFrame frame = new JFrame("Swing Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Esto es Swing");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Botón");
        JCheckBox checkBox = new JCheckBox("CheckBox");
        JRadioButton radioButton = new JRadioButton("RadioButton");

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkBox);
        frame.add(radioButton);

        frame.setVisible(true);
    }
}
