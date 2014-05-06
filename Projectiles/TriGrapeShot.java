package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Triangle;
import Projectiles.Shrapnel;

public class TriGrapeShot extends Projectile {

	public TriGrapeShot(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub

		int did = did(1);
		ref = ref - Math.min(dist, did) / 10 - 1;
		shooterPosition = shooterPosition.translate(Math.min(dist, did), 0);

		if (dist < did) {
			this.hitScreenAction(shooterPosition, ref);
		} else {

			// if (dist > did) {

			Shrapnel shrapnel = new Shrapnel(screen, ref, currentTime);
			shrapnel.shoot(dist - did, shooterPosition);

		}

	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		// DESENEZ - simplu
		Triangle triangle = new Triangle();
		triangle.draw(screen, ref, shooterPosition);
	}

}
