import java.util.Timer;
import java.util.TimerTask;


public class TrialTimer
{
    public static void main(String[] args)
    {
        String string = null;
        Timer timer = new Timer();
        TimerTask timeTask = new TimerTask()
        {
            public void run()
            {
                System.out.println("WOW");
            }
        };
        timer.schedule(timeTask, 10*1000);
    }

}