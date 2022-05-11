package awt.demo;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class Listeners extends Frame {
    Label status = new Label("... status ...");
    TextField textField = new TextField("Enter names...");
    Listeners() {
        this.setBackground(Color.BLUE);
        status.setFont(new Font("Arial", Font.BOLD, 14));
        status.setBounds(30, 40, 220, 60);
        status.setForeground(Color.white);
        add(status);
        textField.setBounds(30, 100, 220, 30);
        textField.setBackground(Color.black);
        textField.setForeground(Color.white);
        add(textField);
        Button send = new Button("Send");
        send.setBounds(300,100,100,30);
        add(send);
        Button clear = new Button("Clear");
        clear.setBounds(300,160,100,30);
        add(clear);
        // Adding command
        send.setActionCommand("SEND");
        clear.setActionCommand("CLEAR");
        send.addActionListener(new ButtonClickHandler());
        clear.addActionListener(new ButtonClickHandler());
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
        setTitle("AWT Intro");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String args[]) throws IOException {
        Listeners f = new Listeners();
    }

    class ButtonClickHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getActionCommand().equals("SEND")) {
                status.setText(textField.getText());
                textField.setText("");
            }else if(ae.getActionCommand().equals("CLEAR")){
                status.setText("");
                textField.setText("");
            }
        }
    }
}
