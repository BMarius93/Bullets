package Shapes;

import Constants.Symbols;
import ProcessingManagers.DrawManager;
import Screen.Screen;

public class Rectangle extends BasicShape {

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point v1 = centerGrav.translate(-2 * ref, -ref);
		Point v2 = centerGrav.translate(2 * ref, -ref);
		Point v3 = centerGrav.translate(2 * ref, ref);
		Point v4 = centerGrav.translate(-2 * ref, ref);
		DrawManager.drawLine(screen.matrix, v1, v2, Symbols.RECTANGLE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v2, v3, Symbols.RECTANGLE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v3, v4, Symbols.RECTANGLE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v4, v1, Symbols.RECTANGLE_SYMBOL);
	}

}
