package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Square;

public class Carcass extends Projectile {

	public Carcass(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		int did = did(2);

		ref = ref - Math.min(dist, did) / 10 - 2;
		shooterPosition = shooterPosition.translate(0, Math.min(dist, did));

		if (dist < did) {
			this.hitScreenAction(shooterPosition, ref);
		} else {

			HeatedShot heatedShot = new HeatedShot(screen, ref, currentTime);
			heatedShot.shoot(dist - did, shooterPosition);

		}
	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.draw(screen, ref, shooterPosition);
	}

}
