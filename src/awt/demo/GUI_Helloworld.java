package awt.demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI_Helloworld extends Frame {
    GUI_Helloworld() {
        this.setBackground(Color.BLUE);
        Label label = new Label("Hello world!");
        label.setBounds(30, 40, 220, 60);
        label.setForeground(Color.white);
        add(label);
        TextField txt = new TextField("Enter names...");
        txt.setBounds(30, 100, 220, 30);
        txt.setBackground(Color.black);
        txt.setForeground(Color.white);
        add(txt);
        Button btn = new Button("Submit");
        btn.setBounds(300,100,100,30);
        add(btn);
        Button closeBtn = new Button("Close window");
        closeBtn.setBounds(30, 160, 130, 30);
        closeBtn.setBackground(Color.red);
        closeBtn.setForeground(Color.white);
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(closeBtn);
        setSize(700,300);
        setTitle("This is our basic AWT example");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]) {
        GUI_Helloworld f = new GUI_Helloworld();
    }
}