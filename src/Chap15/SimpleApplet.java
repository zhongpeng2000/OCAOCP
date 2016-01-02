package Chap15;

import java.awt.*; 
import java.applet.*; 
/* 
<applet code="SimpleApplet" width=200 height=60> 
</applet> 
*/ 
 
public class SimpleApplet extends Applet { 
  /**
	 * 
	 */
	private static final long serialVersionUID = -6713607652277086396L;

public void paint(Graphics g) { 
    g.drawString("Java makes applets easy.", 20, 20); 
  } 
}