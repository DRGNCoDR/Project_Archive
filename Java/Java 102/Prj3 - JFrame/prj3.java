import javax.swing.JFrame;

public class prj3
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Increment or Decrement value");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new SimplePanel());
        
        frame.pack();
        frame.setVisisble(true);
    }
}
