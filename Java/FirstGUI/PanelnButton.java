import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelnButton extends JFrame implements ActionListener
{
    
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();


    public PanelnButton()
    {   
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setBounds(0, 0, 250, 250);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel2.setBounds(0, 250, 250, 250);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.green);
        panel3.setBounds(250, 0, 250, 250);

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.yellow);
        panel4.setBounds(250, 250, 250, 250);
        
        button1.setBounds(62,62,125,125);
        button1.setAlignmentX(CENTER_ALIGNMENT);
        button1.addActionListener(this);

        button2.setBounds(312,62,125,125);
        button2.setAlignmentX(CENTER_ALIGNMENT);
        button2.addActionListener(this);

        button3.setBounds(62,312,125,125);
        button3.setAlignmentX(CENTER_ALIGNMENT);
        button3.addActionListener(this);

        button4.setBounds(312,312,125,125);
        button4.setAlignmentX(CENTER_ALIGNMENT);
        button4.addActionListener(this);
        

        this.setTitle("Panel and Buttons");
        // this.getContentPane().setBackground(Color.BLACK);
        this.setBackground(Color.gray);
        this.setLayout(null);
        this.setSize(550, 550);
        this.setVisible(true);
        this.setResizable(true);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            System.out.println("Blue");
        }
        else if(e.getSource()==button2)
        {
            System.out.println("Green");
        }
        else if(e.getSource()==button3)
        {
            System.out.println("Red");
        }
        else if(e.getSource()==button4)
        {
            System.out.println("Yellow");
        }
    }
}