import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Shaun Sinclair
 * SWEN 222
 * 8/08/2017.
 */
public class Piece {
	enum Side {TOP, RIGHT, BOTTOM, LEFT}

	enum Weapon {SWORD, SHIELD, NOTHING}

	private Weapon weapons[];

	public Piece(Weapon[] weapons) {
		if (weapons.length != 4) throw new IllegalArgumentException("A piece must have exactly 4 weapons");
		this.weapons = weapons;
	}

	public void rotate(int degrees) {
		if (degrees % 90 != 0)
			throw new IllegalArgumentException("This is not an allowed amount of degrees. Please try a multiple of 90");
		ArrayUtils.shift(weapons, degrees/90);
	}


	public Weapon getSide(int dir) {
		if (dir > 4 || dir < 1) {
			throw new IllegalArgumentException("Side must be between 0 and 3, was: " + dir);
		}
		return weapons[dir - 1];
	}

	public Weapon getSide(Side dir) {
		switch (dir) {
			case TOP:
				return weapons[0];
			case RIGHT:
				return weapons[1];
			case BOTTOM:
				return weapons[2];
			case LEFT:
				return weapons[3];
			default:
				throw new IllegalArgumentException("Side must be one of: UP, RIGHT, DOWN, LEFT");
		}
	}

}
