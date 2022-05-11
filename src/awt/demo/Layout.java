package awt.demo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Layout extends Frame {
    public static Panel mainPanel=new Panel();
    Layout() {
        mainPanel.setLayout(new GridLayout(1, 3));
        Label label = new Label("Test content");
        label.setBackground(Color.black);
        add(label);
        label.setForeground(Color.MAGENTA);
        createLabel(Color.pink, "Heading");
        createLabel(Color.green, "Content");
        createLabel(Color.blue, "Conclusion");
        Button closeBtn = new Button("Close window");
        closeBtn.setBounds(0, 160, 130, 30);
        closeBtn.setBackground(Color.red);
        closeBtn.setForeground(Color.white);
        closeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(mainPanel);
        add(closeBtn);
        setSize(1366, 768);
        setTitle("AWT Grid layout");
        setLayout(new GridLayout(3, 1));
        setVisible(true);
    }

    public static void main(String args[]) throws IOException {
        Layout f = new Layout();
    }

    public void createLabel(Color color, String content) {
        Panel panel = new Panel();
        Label label = new Label(content);
        panel.setBackground(color);
        panel.add(label);
        mainPanel.add(panel);
    }
}
