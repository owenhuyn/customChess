
public class Square {
	public int rank;
	public int file;
	public String squareColour;
	public GamePiece piece;
	public final int inBounds;
	
	public Square(int r, int c, String colour, int bounds){
		rank = r;
		file = c;
		squareColour = colour;
		inBounds = bounds;
	}
	
	public void placePiece(String pieceSide, String pieceType) {
		this.piece = new GamePiece(pieceType, pieceSide);
	}
}
