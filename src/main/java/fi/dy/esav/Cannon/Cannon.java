package fi.dy.esav.Cannon;

public class Cannon {

	/**
	 * @param args
	 */
	
	public static Cannon inst;
	
	public static boolean flying = false;
	public static void main(String[] args) {
		
		PaintWindow window = new PaintWindow();
		while(true) {
			if (!flying) {
				Control.calcCannonPos();
			} else {
				Control.calcBallPos();
			}
			
			window.repaint();
			Wait.wait(4);
		}

	}

}
