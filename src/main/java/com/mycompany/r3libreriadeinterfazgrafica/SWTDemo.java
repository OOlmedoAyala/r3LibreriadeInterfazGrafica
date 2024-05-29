/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r3libreriadeinterfazgrafica;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.*;

/**
 *
 * @author HP-TRABAJO
 */
public class SWTDemo {
    public static void launchSWTDemo() {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("SWT Demo");
        shell.setSize(300, 200);
        shell.setLayout(new org.eclipse.swt.layout.FillLayout());

        Composite composite = new Composite(shell, SWT.NONE);
        composite.setLayout(new org.eclipse.swt.layout.GridLayout(1, false));

        Label label = new Label(composite, SWT.NONE);
        label.setText("Esto es SWT");
        Text textField = new Text(composite, SWT.BORDER);
        Button button = new Button(composite, SWT.PUSH);
        button.setText("Botón");
        Button checkBox = new Button(composite, SWT.CHECK);
        checkBox.setText("CheckBox");
        Button radioButton = new Button(composite, SWT.RADIO);
        radioButton.setText("RadioButton");

        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
