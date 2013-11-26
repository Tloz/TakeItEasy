package pobj.partiel2013nov;

public class PieceEq extends Piece implements I2{

	@Override
	public boolean equals(Piece p) {
		// TODO Add different class handleing case
		if (this.getV() != p.getV() || this.getBg() != p.getBg() || this.getHg() != p.getHg())
			return false;
		else return true;
	}

	public PieceEq(Piece p)
	{
		super(p.getV(), p.getHg(), p.getBg());
	}
}
