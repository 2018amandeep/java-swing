package com.todoapp.Screens;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

public class todolist extends JLabel {
    todolist(String[] arr) {
        this.setBounds(50, 250, 600, 200);
        String res = "";
        int labelX = 0;
        int labelY = 0;
        int counter = 1;
        List<JLabel> list = new ArrayList<>();

        for (String s : arr) {
            if (s != null) {
                JButton delbutton = new JButton();
                delbutton.setBounds(400,0,50,50);
                delbutton.setIcon(new ImageIcon("src/main/java/com/todoapp/res/delete.png"));
                delbutton.setBackground(Color.red);
                delbutton.setFocusable(false);

                JLabel label = new JLabel(" " + counter + " " + s);
                label.setBounds(labelX, labelY, 450, 50);
                label.setBackground(Color.gray);
                label.setForeground(Color.white);
                label.add(delbutton);
                label.setOpaque(true);
                label.setFont(new Font("Aerial", Font.PLAIN, 15));
                list.add(label);
                label.setLayout(null);
                labelY += 60;
                counter++;
            }
            // this.setText(res);
            this.setBackground(Color.white);
            this.setLayout(null);
            this.setOpaque(true);
            for (JLabel label : list) {
                this.add(label);
            }
        }
    }
}
