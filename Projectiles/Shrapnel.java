package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Square;

public class Shrapnel extends Projectile {

	public Shrapnel(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		int did = did(5);

		ref = ref - Math.min(dist, did) / 10 - 5;
		shooterPosition = shooterPosition.translate(
				(int) Math.round(Math.sin(Math.min(dist, did) * Math.PI / 2)),
				0);

		if (dist < did) {
			this.hitScreenAction(shooterPosition, ref);
		} else {

			SpiderShot spiderShot = new SpiderShot(screen, ref, currentTime);
			spiderShot.shoot(dist - did, shooterPosition);

		}
	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		Square square = new Square();
		square.draw(screen, ref, shooterPosition);
	}

}
