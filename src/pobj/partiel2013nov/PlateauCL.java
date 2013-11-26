package pobj.partiel2013nov;

import java.util.ArrayList;

public class PlateauCL implements I4, CasesLibres{
	
	private Plateau pl;
	public PlateauCL(Plateau pl){
		this.pl = pl;
	}

	@Override
	public ArrayList<Integer> sontLibres() {
		int index;
		ArrayList<Integer> casesLibres = new ArrayList<Integer>();
		for(index = 0; index < pl.nbCases; index++)
			if(estLibre(index))
				casesLibres.add(index);
		return casesLibres;
	}

	@Override
	public Piece getPiece(int pos) {
		return pl.lp.get(pos);
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
			pl.lp.set(pos, p);
	}

}
