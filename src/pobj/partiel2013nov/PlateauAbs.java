package pobj.partiel2013nov;

import java.util.ArrayList;

public abstract class PlateauAbs  implements I4 {
 protected static final int nbCases = 19;

 protected ArrayList<Piece> lp;

 public PlateauAbs() {
   lp = new ArrayList<Piece>(nbCases);
   for (int i = 0; i<nbCases; i++){lp.add(i,null);}
  }
    

  abstract public Piece getPiece(int pos);
  abstract public boolean estLibre(int pos);
  abstract public void setPiece(Piece p, int pos);
}