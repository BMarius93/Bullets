package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Triangle;

public class ChainShot extends Projectile {

	public ChainShot(Screen screen, int ref, TimeManager currentTime) {

		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		
		int did = did(4);
		ref = ref - Math.min(dist, did) / 10 - 4;
		shooterPosition = shooterPosition.translate(0, -Math.min(dist, did));

		if (dist < did) {
			this.hitScreenAction(shooterPosition, ref);
		} else {

			Shrapnel shrapnel = new Shrapnel(screen, ref, currentTime);
			shrapnel.shoot(dist - did, shooterPosition);

		}

	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle();
		triangle.draw(screen, ref, shooterPosition);

	}

}
