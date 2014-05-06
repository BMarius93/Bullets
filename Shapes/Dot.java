package Shapes;

import Constants.Symbols;
import ProcessingManagers.DrawManager;
import Screen.Screen;

public class Dot extends BasicShape {

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		DrawManager.drawLine(screen.matrix, centerGrav, centerGrav,
				Symbols.DOT_SYMBOL);
	}

}
