import java.awt.Color;

import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;


public class Driver {
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    
    try {
      GLCanvas canvas = new GLCanvas();
      
      canvas.setBackground(Color.green);
    
      frame.add(canvas);
      frame.pack();
    } catch (UnsatisfiedLinkError e) {
      e.printStackTrace();
      frame.setBackground(Color.red);
    }
    
    frame.setSize(400, 400);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
