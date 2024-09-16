import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class FadeDialog extends JDialog  {

    private float alfa = 1;
    private JLabel label;
    private boolean isFadeIn = true;
    private JButton fadeIn, fadeOut;

    FadeDialog() {

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new Point(300, 300));
        getContentPane().setLayout(new BorderLayout(5,0));
        setUndecorated(true); //opacity supported for undecorated JDialogs

        JButton close = new JButton("Close");
        close.addActionListener(e -> dispose());
        getContentPane().add(close, BorderLayout.PAGE_END);
        getContentPane().add(new ContentPane(), BorderLayout.CENTER);
        pack();
        setVisible(true);

        Timer timer = new Timer(200,  e -> fade());//endless fade-in-out loop
        timer.setInitialDelay(100);
        timer.start();
    }

    void fade() {

        alfa = isFadeIn ? alfa + 0.1f : alfa -0.1f;
        if(alfa <=0 ) {
            alfa = 0; 
            isFadeIn = true;
        }else if(alfa >= 1) {
            alfa = 1; 
            isFadeIn = false;
        }

        fadeIn.setEnabled(! isFadeIn); fadeOut.setEnabled(isFadeIn);
        label.setText("Alfa is " + alfa);
        setOpacity(alfa); //set JDialog opacity
    }

    class ContentPane extends JPanel {

        ContentPane() {
            setPreferredSize(new Dimension(200, 100));
            setLayout(new BorderLayout());
            fadeIn = new JButton("Fade In");
            fadeIn.addActionListener(e -> isFadeIn = true);
            add(fadeIn, BorderLayout.PAGE_START);

            label = new JLabel("Alfa is " + alfa);
            add(label, BorderLayout.CENTER);

            fadeOut = new JButton("Fade Out");
            fadeOut.addActionListener(e -> isFadeIn = false);
            add(fadeOut, BorderLayout.PAGE_END);
        }
    }

    public static void main(String[] args) {
        new FadeDialog();
    }
}