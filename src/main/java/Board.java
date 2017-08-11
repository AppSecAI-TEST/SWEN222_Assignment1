/**
 * Created by Shaun Sinclair
 * SWEN 222
 * 8/08/2017.
 */
public class Board {
	private final int SIZE = 10;

	enum Type {GREENFACE, YELLOWFACE, GREENSPAWN, YELLOWSPAWN, NORMAL, BLANK}

	private Tile[][] board;

	public Board() {
		this.board = fillBoard();
	}

	private Tile[][] fillBoard() {
		Tile[][] tiles = new Tile[SIZE][SIZE];
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				Type type;
				if ((x <= 1 && y == 0) || (x == 0 && y == 1)||(x==9&&y==8)||(x>=8&&y==9)) {
					type = Type.BLANK;
				} else if (x == 1 && x == y) {
					type = Type.GREENFACE;
				} else if (x == 8 && x == y) {
					type = Type.YELLOWFACE;
				} else if (x == 2 && x == y) {
					type = Type.GREENSPAWN;
				} else if (x == 7 && x == y) {
					type = Type.YELLOWSPAWN;
				}else{
					type = Type.NORMAL;
				}
				tiles[y][x] = new Tile(x, y, type);
			}
		}
		return tiles;
	}

	public Tile[][] getBoard() {
		return board;
	}

	public Tile getTile(int x,int y){
		if (x>=SIZE||x<0|y>=SIZE||y<0) throw new IllegalArgumentException("The tile you are looking for is out of bounds.");
		return board[y][x];
	}
}
