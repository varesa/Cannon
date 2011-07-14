package fi.dy.esav.TwoDGraphicsTest;

import java.awt.geom.*;

import javax.swing.text.Position;

import java.lang.Math;


public class Control {
	
	public static boolean left,right,up,down,space;
	public static double angle = 90 ,velocity = 100;
	
	public static void calcCannonPos() {
		if (down==true) {
			if (velocity>=0.1) {
			velocity=velocity-0.1;
			} else {
				velocity = 0;
			}
		} else if (up == true) {
			if (velocity<=99.9) {
			velocity=velocity+0.1;
			} else {
				velocity = 100;
			}
		}
		
		if (right == true) {
			if (angle>=0.1) {
			angle=angle-0.1;
			} else {
				angle=0;
			}
		} else if (left == true) {
			if (angle<=179.9) {
			angle=angle+0.1;
			} else {
				angle=180;
			}
		}
		
	}
	
	public static void fire() {
		TwoDGraphicsTest.flying=true;
	}
	
	public static void calcBallPos() {
		// TODO Auto-generated method stub
		
	}
	// (x+dcosα,y+dsinα)
		
	public static int[] getCannon() {

		

		
		double[] dCannonPos = new double[2];
		dCannonPos[0]= velocity * Math.cos(Math.toRadians(angle));
		dCannonPos[1]= velocity * Math.sin(Math.toRadians(angle));
		int[] cannonPos = {(int)dCannonPos[0],(int)dCannonPos[1]};
		return cannonPos;
	}

}
