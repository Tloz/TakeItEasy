package pobj.partiel2013nov;

public class JoueurNaif implements IStrategie{

	@Override
	public int jouer(Plateau pl, Piece p) throws PasDeCoup {
		PlateauCL plcl = new PlateauCL(pl);
		if (pl.lp.size() == 0)
			throw new PasDeCoup();
		return plcl.sontLibres().get(0);
	}

}
