package pobj.partiel2013nov;

public class Piece {

    private int bV;
    private int bHg;
    private int bBg;

    public Piece(int bV, int bHg, int bBg){this.bV=bV; this.bHg=bHg; this.bBg=bBg;}

    public int getV(){return bV;} 
    public int getHg(){return bHg;} 
    public int getBg(){return bBg;} 

    public String toString() {return ""+bV+bHg+bBg;}
}