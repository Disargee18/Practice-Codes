import java.awt.*;
import javax.swing.*;

public class JavaLabels
{
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("ngi.png");

        label.setText("Erhm, Ekshscuse me");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);
        label.setForeground(Color.CYAN);
        label.setFont(new Font("MV Boli", Font.ROMAN_BASELINE, 20));
        


        frame.setTitle("Title Kunohay ni");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setResizable(false);
        // frame.getContentPane().setBackground(new Color(255,255,255,255));
        frame.add(label);
        frame.pack();

        
        
    }
}