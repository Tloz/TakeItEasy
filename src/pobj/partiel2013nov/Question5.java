package pobj.partiel2013nov;

class Question5 {
  static Plateau Figure1() { 
	  Plateau pl = new Plateau();
	  pl.setPiece(new Piece(9, 8, 7), 2);
	  pl.setPiece(new Piece(5, 8, 7), 3);
	  pl.setPiece(new Piece(5, 4, 2), 4);
	  pl.setPiece(new Piece(5, 3, 7), 5);
	  pl.setPiece(new Piece(9, 8, 6), 8);
	  pl.setPiece(new Piece(9, 8, 2), 11);
	  pl.setPiece(new Piece(1, 8, 7), 13);
	  pl.setPiece(new Piece(1, 4, 2), 14);
	  pl.setPiece(new Piece(1, 8, 2), 17);
	  pl.setPiece(new Piece(5, 4, 6), 18);
	  return pl;
  }
}