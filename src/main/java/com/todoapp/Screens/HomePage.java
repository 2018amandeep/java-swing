package com.todoapp.Screens;

import java.awt.Color;
import java.awt.Font;
import com.todoapp.DB.db;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
// import screens.topPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage implements ActionListener {
    private int X= 800;
    private int Y=600;
    JButton button = new JButton();
    JButton addTodo =new JButton("+");
    JTextField textField = new JTextField();

    public HomePage()
    {

        
        button.setBounds(50,200,200,50);
        button.setBackground(Color.GREEN);
        button.setText("Button");
        button.setFont(new Font("Comic Sans",Font.ITALIC,25));
        button.setFocusable(false);
        button.setForeground(Color.white);
        button.setLayout(null);
        button.addActionListener(this);

       
        addTodo.setBounds(520,100,70,35);
        addTodo.setBackground(new Color(148,0,211));
        addTodo.setFocusable(false);
        addTodo.setFont(new Font("Comic Sans",Font.PLAIN,18));
        addTodo.setForeground(Color.white);
        addTodo.addActionListener(this);

        
        textField.setText("Add to do");
        textField.setBounds(50,100,450,40);
        textField.setFont(new Font("Aerial",Font.PLAIN,18));

        String[] arr = new db().getAllTheDocuments();
      
        
        


        JFrame frame = new JFrame();
        frame.setSize(X,Y);
        frame.add(new topPanel());
        frame.add(addTodo);
        // frame.setBounds(100,50,X,Y);
        frame.add(button);
        frame.add(textField);
        frame.add(new todolist(arr));
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            System.out.println("Button is clicked");
        }
        if(e.getSource() == addTodo)
        {
            String txt = textField.getText();
            new db().add("todo",txt);
        }
        
    }
    
}
