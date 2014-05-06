package Shapes;

import Constants.Symbols;
import ProcessingManagers.DrawManager;
import Screen.Screen;

public class Triangle extends BasicShape {

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point v1 = centerGrav.translate(0, -2 * ref);
		Point v2 = centerGrav.translate(-ref, ref);
		Point v3 = centerGrav.translate(ref, ref);

		DrawManager.drawLine(screen.matrix, v1, v2, Symbols.TRIANGLE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v2, v3, Symbols.TRIANGLE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v3, v1, Symbols.TRIANGLE_SYMBOL);

	}

}
