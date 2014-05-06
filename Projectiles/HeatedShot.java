package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.Rhombus;

public class HeatedShot extends Projectile {

	public int id = 6;

	public HeatedShot(Screen screen, int ref, TimeManager currentTime) {
		super(screen, ref, currentTime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		int did = did(6);

		ref = ref - Math.min(dist, did) / 10 - 6;
		
		shooterPosition = shooterPosition.translate(0, (int) Math.round(Math.cos(Math
				.min(dist, did) * Math.PI / 2)));

		if (dist < did) {
			this.hitScreenAction(shooterPosition, ref);
		} else {

			// if (dist > did) {

			SpiderShot spiderShot = new SpiderShot(screen, ref, currentTime);
			spiderShot.shoot(dist - did, shooterPosition);

		}

	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		Rhombus rhombus = new Rhombus();
		rhombus.draw(screen, ref, shooterPosition);
	}

}
