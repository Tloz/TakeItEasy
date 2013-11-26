package pobj.partiel2013nov;

import java.util.ArrayList;

public class Lignes extends LignesAbs{

	Lignes(Plateau pl) {
		super(pl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] getLigneDir(int pos, Direction d) {
		int size = 0;
		int i;
		int dir = 0;
		ArrayList<Integer> ligne = new ArrayList<Integer>();
		switch (d)
		{
		case V:
			dir = 0;
			break;
		case Hg:
			dir = 1;
			break;
		case Bg:
			dir = 2;
			break;
		}

		size = c[pos][dir].length;
		for(i = 0; i < size; i++)
			ligne.add(c[pos][dir][i]);

		int[] res = new int[size];

		for(i = 0; i < size ; i++)
		{
			switch (d)
			{
			case V:
				res[i] = pl.getPiece(ligne.get(i)).getV();
				break;
			case Hg:
				res[i] = pl.getPiece(ligne.get(i)).getHg();
				break;
			case Bg:
				res[i] = pl.getPiece(ligne.get(i)).getBg();
				break;
			}
			System.out.println(res[i]);
		}
		return res;
	}



}
