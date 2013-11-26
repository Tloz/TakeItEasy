package pobj.partiel2013nov;

interface IStrategie {
    int jouer(Plateau pl, Piece p) throws PasDeCoup;
}