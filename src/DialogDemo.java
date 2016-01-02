import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
/**
 * Demonstrate how to handle JDialog close
 * events with a WindowAdapter and a ComponentListener.
 */
public class DialogDemo
{
  static JFrame frame;
  static JDialog jdialog;
 
  public static void main(String[] args)
  {
    // schedule this for the event dispatch thread (edt)
    SwingUtilities.invokeLater(new Runnable()
    {
      public void run()
      {
        displayJFrame();
      }
    });
  }
 
  static void displayJFrame()
  {
    frame = new JFrame("Our JDialog Close Example");
 
    // setup our jdialog listener
    jdialog = new JDialog(frame, "Hello", true);
 
    // add a window listener
    jdialog.addWindowListener(new WindowAdapter()
    {
//      public void windowClosed(WindowEvent e)
//      {
//        System.out.println("jdialog window closed");
//      }
// 
//      public void windowClosing(WindowEvent e)
//      {
//        System.out.println("jdialog window closing");
//      }
    });
 
    // add a component listener
    jdialog.addComponentListener(new ComponentListener()
    {
      public void componentHidden(ComponentEvent e)
      {
        System.out.println("dialog hidden");
      }
 
      public void componentMoved(ComponentEvent e)
      {
        System.out.println("dialog moved");
      }
 
      public void componentResized(ComponentEvent e)
      {
        System.out.println("dialog resized");
      }
 
      public void componentShown(ComponentEvent e)
      {
        System.out.println("dialog shown");
      }
    });
 
    // display our jdialog when the jbutton is pressed
    JButton showDialogButton = new JButton("Click Me");
    showDialogButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        jdialog.setLocationRelativeTo(frame);
        jdialog.setVisible(true);
      }
    });
 
    // put the button on the frame
    frame.getContentPane().setLayout(new FlowLayout());
    frame.add(showDialogButton);
 
    // set up the jframe, then display it
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(300, 200));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}