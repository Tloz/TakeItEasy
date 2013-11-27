package pobj.partiel2013nov;

public class Score extends ScoreAbs{

	Score(Plateau pl, int score) {
		super(pl, score);
	}

	@Override
	public int scoreLigne(int[] l, int c) {
		int i;
		int res = 0;
		//Vérifie s'il y a bien une pièce sur toutes les cases de la ligne,
		//renvoie 0 sinon
		for(i = 0; i < l.length; i++)
			if((pl.getPiece(l[i]) == null))
				return 0;

		//Vérifie que toutes les cases sont de la même couleur,
		//renvoie 0 sinon
		for(i = 0; i < l.length -1; i++)
			if((pl.getPiece(l[i]).getBg() != c) && (pl.getPiece(l[i]).getHg() != c) && (pl.getPiece(l[i]).getV() != c))
				return 0;
		
		//Calcule la valeur de la ligne
		for(i = 0; i < l.length; i++)
			res += l[i];
		return res;
			
	}

}
