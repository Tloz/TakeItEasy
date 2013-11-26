package pobj.partiel2013nov; 

class Pool {
  protected static final int taille = 27;
  protected PieceEq[] pool = new PieceEq[taille];
  protected boolean[] mask = new boolean[taille];

  Pool(){
    int[]v={1,5,9};
    int[]hg={3,4,8};
    int[]bg={2,6,7};

    for (int i=0; i< taille; i++) {mask[i]=true;}

    int l = 0;
    for (int i = 0; i<3; i++)       
      for (int j = 0; j<3; j++)       
        for (int k = 0; k<3; k++) {
     pool[l]=new PieceEq(new Piece(v[i],hg[j],bg[k]));
          l++;
        }
  }
    
}