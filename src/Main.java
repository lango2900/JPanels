import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("emoji.png");

        JLabel label = new JLabel("These are da panels");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT); //w null layout for a panel, we set bounds below
        label.setBounds(0,0,75,75); // top left corner of blue panel


        JPanel rpanel = new JPanel();
        rpanel.setBackground(Color.red);
        rpanel.setBounds(0,0,250,250);

        JPanel bpanel = new JPanel();
        bpanel.setBackground(Color.blue);
        bpanel.setBounds(250,0,250,250);
        // bpanel.setLayout(new BorderLayout());
        bpanel.setLayout(null);

        JPanel gpanel = new JPanel();
        gpanel.setBackground(Color.green);
        gpanel.setBounds(0,250,500,250);
        //gpanel.setLayout(new BorderLayout());
        gpanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(rpanel);
        bpanel.add(label);
        frame.add(bpanel);
        frame.add(gpanel);



    }
}


// JPanel =  a GUI component that functions as a container to hold other components