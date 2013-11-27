package pobj.partiel2013nov;

abstract class ScoreAbs {

    protected Plateau pl;
    private int score;
    ScoreAbs(Plateau pl, int score) {this.pl=pl; this.score=score;}


    public int getScore(){return score;}
    public void setScore(int score){this.score=score;}

    public  int nouveauScore (Piece p, int pos) {
       int r2;
       int v1 = Question8.valeur(p, Direction.V);
       int v2 = Question8.valeur(p, Direction.Hg);
       int v3 = Question8.valeur(p, Direction.Bg);

       Plateau npl = (Plateau) pl.clone();
       npl.setPiece(p,pos);
       Lignes lg2 = new Lignes(npl);
       int lv1[] = lg2.getLigneDir( pos, Direction.V);
       int lv2[] = lg2.getLigneDir( pos, Direction.Hg);
       int lv3[] = lg2.getLigneDir( pos, Direction.Bg);
       r2=scoreLigne(lv1,v1)+ scoreLigne(lv2,v2)+scoreLigne(lv3,v3);  
       score= r2;
       return score;
      }

    public abstract int scoreLigne(int[] l, int c); 
  
}