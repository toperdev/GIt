package net.toper.main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;

public class Road extends Collision {

	private float x, y;
	Image road;
	GenerateRoad generate = new GenerateRoad();

	public Road() {
	}

	public void update(Player p, GameContainer gc) {
		y += p.getAccelY();
		x += p.getAccelX();
	}

	public void render(Render r) {
		road = generate.generate(1000, 1000, (int) x);
		r.drawImage(road, -x, -y, 1f);
	}
}
