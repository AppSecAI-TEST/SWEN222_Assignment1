/**
 * Created by Shaun Sinclair
 * SWEN 222
 * 11/08/2017.
 */

/**
 * Tile stores its position and type
 */
public class Tile {

	private int x, y;
	private Board.Type type;

	public Tile(int x, int y, Board.Type type) {
		this.x = x;
		this.y = y;
		this.type = type;
	}

	public Board.Type getType() {
		return type;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
