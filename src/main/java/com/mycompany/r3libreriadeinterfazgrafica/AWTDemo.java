/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r3libreriadeinterfazgrafica;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP-TRABAJO
 */
public class AWTDemo {
    public static void launchAWTDemo() {
        Frame frame = new Frame("AWT Example");

        frame.setLayout(new FlowLayout());

        Label label = new Label("Esto es AWT");

        TextField textField = new TextField(20);

        Button button = new Button("Presiona aquí");
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Botón presionado");
        });

        Checkbox checkbox = new Checkbox("CheckBox");

        CheckboxGroup radioGroup = new CheckboxGroup();
        Checkbox radioButton1 = new Checkbox("RadioButton 1", radioGroup, false);
        Checkbox radioButton2 = new Checkbox("RadioButton 2", radioGroup, false);

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkbox);
        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setSize(400, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
