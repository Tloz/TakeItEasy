package pobj.partiel2013nov;

class Question8 {
	static int valeur (Piece p, Direction d) {
		switch (d)
		{
		case V:
			return p.getV();
		case Bg:
			return p.getBg();
		case Hg:
			return p.getHg();
		default:
			return 0;
		}
	}
}