package chess;

public class ChessPosition {
	private char col;
	private int row;
	public ChessPosition(char col, int row) {
		if (col < 'a' || col > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantianting ChessPosition. Valid values are a1 to h8.");
		}
		this.col = col;
		this.row = row;
	}
	public char getCol() {
		return col;
	}
	public int getRow() {
		return row;
	}
}
