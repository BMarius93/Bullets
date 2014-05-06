package Shapes;

import Constants.Symbols;
import ProcessingManagers.DrawManager;
import Screen.Screen;

public class Square extends BasicShape {

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point v1 = centerGrav.translate(-ref, -ref);
		Point v2 = centerGrav.translate(ref, -ref);
		Point v3 = centerGrav.translate(ref, ref);
		Point v4 = centerGrav.translate(-ref, ref);
		DrawManager.drawLine(screen.matrix, v1, v2, Symbols.SQUARE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v2, v3, Symbols.SQUARE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v3, v4, Symbols.SQUARE_SYMBOL);
		DrawManager.drawLine(screen.matrix, v4, v1, Symbols.SQUARE_SYMBOL);
	}

}
