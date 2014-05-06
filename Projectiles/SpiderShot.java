package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Rectangle;

public class SpiderShot extends Projectile {

	public SpiderShot(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		int did = did(7);
		ref = ref - Math.min(dist, did) / 10 - 7;
		shooterPosition = shooterPosition.translate((int) Math.round(Math.sin(Math
				.min(dist, did) * Math.PI / 2)),(int) Math.round(Math.cos(Math
						.min(dist, did) * Math.PI / 2)));

		if (dist < did) {
			this.hitScreenAction(shooterPosition, ref);
		} else {

			// if (dist > did) {

			SimpleShell simpleShell = new SimpleShell(screen, ref, currentTime);
			simpleShell.shoot(dist - did, shooterPosition);

		}
	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.draw(screen, ref, shooterPosition);
	}

}
