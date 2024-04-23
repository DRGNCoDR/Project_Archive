import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimplePanel extends JPanel
{
    
    private JButton inc,dec;
    private JLabel label;
    private JPanel buttonPanel;
    
    public SimplePanel() 
    {
         int count=50;
        
        
        dec=new JButton("Decrement");
        inc=new JButton("Increment");
        
        ButtonListener listener =new ButtonListener();
        inc.addActionListener(listener );    
        dec.addActionListener(listener);        
               
        label= new JLabel("Count: "+count);
        
        buttonPanel=new JPanel();
        buttonPanel.setPreferredSize(new Dimension(200,40));
        buttonPanel.setBackground(Color.blue);
        buttonPanel.add(inc);
        buttonPanel.add(dec);
        
        setPreferredSize(new Dimension(200,80));
        setBackground(Color.cyan);
        add(buttonPanel);
        add(label);
        
       }
   
    
    private  class ButtonListener implements ActionListener
    {
        public void actionPreformed(ActionEvent event)
        {
            if(event.getSource()==inc)
            label.setText("Count: " +count);
            else
            label.setText("Count: "+count);
        }
        
    } 
  
}
 

