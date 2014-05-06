import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import Constants.ProjectileNames;
import ProcessingManagers.TimeManager;
import Projectiles.CanisterShot;
import Projectiles.Carcass;
import Projectiles.ChainShot;
import Projectiles.HeatedShot;
import Projectiles.Projectile;
import Projectiles.Shrapnel;
import Projectiles.SimpleShell;
import Projectiles.SpiderShot;
import Projectiles.TriGrapeShot;
import Screen.Screen;
import Shapes.Point;

public class Main {

	static Screen screen;

	public static void main(String[] args) {

		String word;

		FileParser textFile = new FileParser(args[0]);
		textFile.open();
		ArrayList<String> string = new ArrayList<String>();
		while ((word = textFile.getNextWord()) != null) {
			string.add(word);
		}

		screen = new Screen(Integer.parseInt(string.get(0)),
							Integer.parseInt(string.get(1)));
		int contor = Integer.parseInt(string.get(2));

		string.remove(0);
		string.remove(0);
		string.remove(0);

		for (int i = 0; i < contor; i++) {
			Main mein = new Main();
			mein.launch(string);
		}

		try {

			File file = new File(args[0] + "_out");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < screen.matrix.length; i++) {
				for (int j = 0; j < screen.matrix[0].length; j++) {
					bw.write(screen.matrix[i][j]);

				}
				bw.newLine();

			}

			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Functie care citeste fiecare linie si lanseaza 
	 * proiectilul respectiv
	 */
	public void launch(ArrayList<String> string) {
		Projectile obiect = null;

		int ref = Integer.parseInt(string.get(1));
		int h = Integer.parseInt(string.get(2));
		int m = Integer.parseInt(string.get(3));
		int s = Integer.parseInt(string.get(4));
		int dist = Integer.parseInt(string.get(5));
		int x = Integer.parseInt(string.get(6));
		int y = Integer.parseInt(string.get(7));

		TimeManager currentTime = new TimeManager(h, m, s);
		Point shooterPosition = new Point(x, y);

		switch (string.get(0)) {
		case ProjectileNames.CARCASS:
			obiect = new Carcass(screen, ref, currentTime);
			break;
		case ProjectileNames.CANNISTER_SHOT:
			obiect = new CanisterShot(screen, ref, currentTime);
			break;
		case ProjectileNames.CHAIN_SHOT:
			obiect = new ChainShot(screen, ref, currentTime);
			break;
		case ProjectileNames.HEATED_SHOT:
			obiect = new HeatedShot(screen, ref, currentTime);
			break;
		case ProjectileNames.SHRAPNEL:
			obiect = new Shrapnel(screen, ref, currentTime);
			break;
		case ProjectileNames.SIMPLE_SHELL:
			obiect = new SimpleShell(screen, ref, currentTime);
			break;
		case ProjectileNames.SPIDER_SHOT:
			obiect = new SpiderShot(screen, ref, currentTime);
			break;
		case ProjectileNames.TRI_GRAPE_SHOT:
			obiect = new TriGrapeShot(screen, ref, currentTime);
			break;
		}

		obiect.shoot(dist, shooterPosition);
		for (int j = 0; j < 8; j++) {
			string.remove(0);
		}
	}

}
