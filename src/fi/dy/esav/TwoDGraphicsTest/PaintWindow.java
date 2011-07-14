package fi.dy.esav.TwoDGraphicsTest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Graphics2D;

import javax.xml.crypto.dsig.CanonicalizationMethod;


public class PaintWindow extends Frame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static boolean lastState;
	TwoDGraphicsTest main = TwoDGraphicsTest.inst;

	public PaintWindow() {
		super("2D graphics test");
		setSize(500, 500);
		setVisible(true);

		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		
		
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Left") {
					Control.left = true;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Right") {
					Control.right = true;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Up") {
					Control.up = true;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Down") {
					Control.down = true;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Space") {
					if (!lastState) {
						Control.fire();
					}
					lastState=true;
				}
				
			}
			
			public void keyReleased(KeyEvent e) {
				
				
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Left") {
					Control.left = false;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Right") {
					Control.right = false;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Up") {
					Control.up = false;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Down") {
					Control.down = false;
				}
				
				if (KeyEvent.getKeyText(e.getKeyCode()) == "Space") {
					lastState = false;
				}				
				
				
			}
			
		
		});
	}
	
	public void paint(Graphics g) {
		this.setTitle("Velocity: " + Math.round(Control.velocity) + ", Angle: " + ((Math.round(Control.angle) - 90) * -1));
		int xOrigin = this.getInsets().left;
		int yOrigin = this.getInsets().bottom;
		int yOffset = this.getHeight();
		int[] cannonPos = Control.getCannon();
		g.drawLine(this.getWidth()/2, yOffset-yOrigin, this.getWidth()/2+cannonPos[0] ,yOffset-cannonPos[1]);
		
		
	}

}
