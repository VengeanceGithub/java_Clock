
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame
  {

    
    
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    
    public MyFrame() throws HeadlessException
      {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("My Clock Proggram");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat(" MMMMMMM dd, yyyy");
        
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana" ,  Font.PLAIN , 50));
        timeLabel.setForeground(new Color(0x00ff00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink free" ,  Font.PLAIN , 35));
        
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink free" ,  Font.PLAIN , 25));
        
        
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
      
        setTime();
        
        
      }
    public void setTime(){
     
        while(true){     
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);
        
        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);
        
        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);
    
            try
              {
                Thread.sleep(1000);
              } catch (InterruptedException e)
              {
               e.printStackTrace();
              }
     
        
        }
        
    }
    
    
    
  }
