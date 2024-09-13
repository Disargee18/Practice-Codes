import java.awt.Color;
import javax.swing.*;

public class MyFrame extends JFrame
{
    public MyFrame()
    {
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("Nerd.png");

        label.setText("Erhm, Eksfhscuuse may");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.TOP);


        this.setTitle("Title Kunohay ni");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.white);
        this.add(label);
    }

    public void labels()
    {
        
    }
}
