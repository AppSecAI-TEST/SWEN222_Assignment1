import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Shaun Sinclair
 * SWEN 222
 * 8/08/2017.
 */

public class PieceTests {

	@Test(expected = IllegalArgumentException.class)
	public void testRotate_1() throws java.lang.IllegalArgumentException {
		Piece.Weapon testWeapons[] = {Piece.Weapon.SWORD, Piece.Weapon.SHIELD, Piece.Weapon.SWORD};
		new Piece(testWeapons);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testRotate_2() throws java.lang.IllegalArgumentException {
		Piece.Weapon testWeapons[] = {Piece.Weapon.SWORD, Piece.Weapon.SHIELD, Piece.Weapon.NOTHING, Piece.Weapon.NOTHING};
		Piece testPiece = new Piece(testWeapons);
		Piece.Weapon tempSide = testPiece.getSide(2);
		testPiece.rotate(17);
	}

	@Test
	public void testRotate_3() {
		Piece.Weapon testWeapons[] = {Piece.Weapon.SWORD, Piece.Weapon.SHIELD, Piece.Weapon.NOTHING, Piece.Weapon.NOTHING};
		Piece testPiece = new Piece(testWeapons);
		for (int i = 1; i < 4; i++) {
			Piece.Weapon tempSide = testPiece.getSide(1);
			testPiece.rotate(90);
			assertEquals(tempSide, testPiece.getSide(2));
		}
	}

	@Test
	public void testRotate_4() {
		Piece.Weapon testWeapons[] = {Piece.Weapon.SWORD, Piece.Weapon.SHIELD, Piece.Weapon.NOTHING, Piece.Weapon.NOTHING};
		Piece testPiece = new Piece(testWeapons);
		for (int i = 0; i < 360; i+=90) {
			Piece.Weapon tempSide = testPiece.getSide(1);
			testPiece.rotate(i);
			assertEquals(tempSide, testPiece.getSide(1+(i/90)));
		}
	}
}
