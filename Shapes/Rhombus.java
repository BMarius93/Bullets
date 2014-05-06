package Shapes;

import Constants.Symbols;
import ProcessingManagers.DrawManager;
import Screen.Screen;

public class Rhombus extends BasicShape {

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point v1 = centerGrav.translate(0, -2 * ref);
		Point v2 = centerGrav.translate(ref, 0);
		Point v3 = centerGrav.translate(0, 2 * ref);
		Point v4 = centerGrav.translate(-ref, 0);
		DrawManager.drawLine(screen.matrix, v1, v2, Symbols.RHOMBUS_SYMBOL);
		DrawManager.drawLine(screen.matrix, v2, v3, Symbols.RHOMBUS_SYMBOL);
		DrawManager.drawLine(screen.matrix, v3, v4, Symbols.RHOMBUS_SYMBOL);
		DrawManager.drawLine(screen.matrix, v4, v1, Symbols.RHOMBUS_SYMBOL);
	}

}
