package Chap15;

import java.awt.*; 
import java.applet.*; 
/* 
<applet code="StatusWindow" width=300 height=50> 
</applet> 
*/ 
 
public class StatusWindow extends Applet{ 
  // Display msg in applet window. 
  public void paint(Graphics g) { 
    g.drawString("This is in the applet window.", 10, 20); 
    showStatus("This is shown in the status window."); 
  } 
}