import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Test {

  public static void main (String[] args) {

    JFrame frame = new JFrame();
    frame.setTitle("SpyCrab");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setSize(450, 450);
    frame.setResizable(false);

    ImageIcon image = new ImageIcon("spycrab.png");
    frame.setIconImage(image.getImage());
    
  } // main
} // Test
