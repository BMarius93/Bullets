package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Rectangle;

public class CanisterShot extends Projectile {

	public CanisterShot(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {

		int did = did(3);
		ref = ref - Math.min(dist, did) / 10 - 3;
		shooterPosition = shooterPosition.translate(-Math.min(dist, did), 0);

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
		Rectangle rectangle = new Rectangle();
		rectangle.draw(screen, ref, shooterPosition);
	}

}
