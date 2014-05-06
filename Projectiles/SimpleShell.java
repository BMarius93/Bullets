package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Dot;
import Shapes.Point;

public class SimpleShell extends Projectile {

	public SimpleShell(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {

		this.hitScreenAction(shooterPosition, ref);
	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		Dot dot = new Dot();
		dot.draw(screen, ref, shooterPosition);
	}

}
