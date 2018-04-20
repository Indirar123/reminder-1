
import javax.swing.JFrame;

public class Journal {
    public static void main(String args[]) {   // Instantiate the phone book frame window and display it.
        JournalFrame pbFrame = new JournalFrame();
        pbFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BeeperControl bpr=new BeeperControl();
        if(bpr.beepForAnHour() =="true") {
            pbFrame.setVisible(true);
        }
    }

}