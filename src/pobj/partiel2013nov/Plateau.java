package pobj.partiel2013nov;

import java.util.ArrayList;

public final class Plateau extends PlateauAbs {

	@SuppressWarnings("unchecked")
	@Override
	public Object clone(){
		Plateau  pl = new Plateau();
		pl.lp = (ArrayList<Piece>) this.lp.clone();
		return pl;
	}
	
	@Override
	public Piece getPiece(int pos) {
		return lp.get(pos);
	}

	@Override
	public boolean estLibre(int pos) {
		if(getPiece(pos) != null)
			return false;
		return true;
	}

	@Override
	public void setPiece(Piece p, int pos) {
		if(estLibre(pos))
			lp.set(pos, p);
	}
}
