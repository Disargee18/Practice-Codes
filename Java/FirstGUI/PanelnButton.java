import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class PanelnButton extends JFrame implements ActionListener
{
    //the panels
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    //the buttons
    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton menuButton1 = new JButton();
    JButton menuButton2 = new JButton();
    JButton tempButton = new JButton();

    //the title
    JLabel title = new JLabel();

    //the storage and counters
    ArrayList<String> answer = new ArrayList<String>();
    ArrayList<String> answerKey = new ArrayList<String>();
    int rand = 0;
    int count=1;
    int fadingTime = 5000;

    public PanelnButton()
    {   
        //Menu Title
        title.setText("Welcome to Simon Game");
        title.setBounds(120, -150, 500, 500);
        title.setFont(new Font("Times New Roman",Font.PLAIN,30));

        //start button
        menuButton1.setBounds(110,200,125,50);
        menuButton1.setAlignmentX(CENTER_ALIGNMENT);
        menuButton1.addActionListener(this);
        menuButton1.setText("Start");
        //exit button
        menuButton2.setBounds(300, 200,125,50);
        menuButton2.setAlignmentX(CENTER_ALIGNMENT);
        menuButton2.addActionListener(this);
        menuButton2.setText("Exit");

        //the temp button for the randomizer *must be deleted in the final  
        tempButton.setBounds(200,300,125,50);
        tempButton.setAlignmentX(CENTER_ALIGNMENT);
        tempButton.addActionListener(this);
        tempButton.setText("*****");



        //Frames
        this.setTitle("Panel and Buttons");
        // this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.setSize(550, 550);
        this.setVisible(true);
        this.setResizable(false);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(title);
        this.add(menuButton1);
        this.add(menuButton2);
        this.add(tempButton);
    }

    public void StartGame()
    {
        panel1.setBackground(Color.CYAN);
        panel1.setBounds(0, 0, 250, 250);

        panel2.setBackground(Color.red);
        panel2.setBounds(0, 250, 250, 250);

        panel3.setBackground(Color.green);
        panel3.setBounds(250, 0, 250, 250);

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
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        //the action for the color buttons
        if(e.getSource()==button1)
        {
            // System.out.println("Blue");
            answer.add("Blue");
        }
        else if(e.getSource()==button2)
        {
            // System.out.println("Green");
            answer.add("Green");
        }
        else if(e.getSource()==button3)
        {
            // System.out.println("Red");
            answer.add("Red");
        }
        else if(e.getSource()==button4)
        {
            // System.out.println("Yellow");
            answer.add("Yellow");
        }

        //the action for the start and exit button
        if(e.getSource()==menuButton1)
        {
            StartGame();
            menuButton1.setVisible(false);
            menuButton1.invalidate();
            menuButton2.setVisible(false);
            menuButton2.invalidate();
        }
        else if(e.getSource()==menuButton2)
        {
            System.exit(0);
        }


        //the randomizer for the sequence
        if(e.getSource()==tempButton)
        {
            int range = 4-1+1;
            //count must be changed to adjust according to the level of the game
            for(int i=0; i<count; i++)
            {
                rand = (int)(Math.random()*range)+1;
                System.out.println(rand);

                if(rand==1)
                {
                    answerKey.add("Blue");
                }
                else if(rand==2)
                {
                    answerKey.add("Green");
                }
                else if(rand==3)
                {
                    answerKey.add("Red");
                }
                else if(rand==4)
                {
                    answerKey.add("Yellow");
                }
            }
        }
    }

    public void displayArray()
    {
        //Displays the randomized sequence
        for (int i = 0; i < answerKey.size(); i++) 
        {
            System.out.println(answerKey.get(i));
        }

        //Displays the "clicked" buttons 
        for (int i = 0; i < answer.size(); i++) 
        {
            System.out.println(answer.get(i));
        }
    }

    public void FadeTimer()
    {
        Timer timer = new Timer();
        
    }
    
    public void Fader()
    {

    }
}