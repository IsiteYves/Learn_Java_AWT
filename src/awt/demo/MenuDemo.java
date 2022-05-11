package awt.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class MenuDemo extends Frame {
    public static JFrame newFrame;
    public MenuDemo() {
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Dropdown");
        JMenuItem m2 = new JMenuItem("Open new window");
        JMenu subm1 = new JMenu("Submenu1");
        JMenuItem mit1 = new JMenuItem("Menu item 1");
        JMenuItem mit2 = new JMenuItem("Menu item 2");
        JMenuItem subitem1 = new JMenuItem("Sub m item1");
        JMenuItem subitem2 = new JMenuItem("Sub m item2");
        subm1.add(subitem1);
        subm1.add(subitem2);
        m1.setIcon(UIManager.getIcon("FileChooser.newFolderIcon"));
        m2.setIcon(UIManager.getIcon("FileChooser.detailsViewIcon"));
        subm1.setIcon(UIManager.getIcon("FileChooser.detailsViewIcon"));
        ImageIcon img = new ImageIcon("C:\\Users\\Benitha\\Team Yves Dropbox\\Yves ISITE\\PC\\Pictures\\menuIcon.png");
        setIconImage(img.getImage());
        m1.add(subm1);
        m1.add(mit1);
        m1.add(mit2);
        mb.add(m1);
        mb.add(m2);
        this.add(mb);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(600, 600);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newFrame=new JFrame("New frame");
                JLabel l1=new JLabel("Welcome to the new window!!");
                l1.setFont(new Font("Arial", Font.BOLD, 14));
                l1.setBounds(40, 40, 400, 30);
                l1.setForeground(Color.BLUE);
                newFrame.add(l1);
                newFrame.setVisible(true);
                newFrame.setBounds(4, 4, 400, 400);
                newFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
            }
        });
    }

    public static void main(String[] args) throws IOException {
        MenuDemo md = new MenuDemo();
    }
}
