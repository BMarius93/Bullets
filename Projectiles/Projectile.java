package Projectiles;

import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.BasicShape;
import Shapes.Point;

/**
 * Basic class for all projectiles
 */
public abstract class Projectile {
	protected Screen screen;
	protected BasicShape shape;
	protected int shapeChangingDist;
	protected int ref;
	protected TimeManager currentTime;

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public BasicShape getShape() {
		return shape;
	}

	public void setShape(BasicShape shape) {
		this.shape = shape;
	}

	public int getShapeChangingDist() {
		return shapeChangingDist;
	}

	public void setShapeChangingDist(int shapeChangingDist) {
		this.shapeChangingDist = shapeChangingDist;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public TimeManager getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(TimeManager currentTime) {
		this.currentTime = currentTime;
	}

	public Projectile(Screen screen, int ref, TimeManager currentTime) {

		this.screen = screen;
		this.ref = ref;
		this.currentTime = currentTime;
	}

	/**
	 * The action that takes place when the projectile is propagating. At each
	 * propagation step, the shape of the projectile changes due to the
	 * corrosive atmosphere
	 * 
	 * @param dist
	 *            distance between the shooter and the screen
	 * @param shooterPosition
	 *            the position from which the shooter fires
	 */
	public abstract void shoot(int dist, Point shooterPosition);

	/**
	 * The action that takes places when the projectile hits the screen
	 * 
	 * @param shooterPosition
	 *            the position from which the shooter fires
	 * @param ref
	 *            reference distance
	 */
	protected abstract void hitScreenAction(Point shooterPosition, int ref);
	
	/**
	 * 
	 * @param id
	 * @return Returneaza distanta in care se modifica proiectilul,
	 * in functie de id'ul lui.
	 */
	public int did(int id){
		return 42 + (id * id * currentTime.getH() + id * currentTime.getM() + currentTime
				.getS()) % 42;
	}
}
