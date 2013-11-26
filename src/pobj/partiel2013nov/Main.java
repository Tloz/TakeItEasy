package pobj.partiel2013nov;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args)
	{
		Piece p1 = Question1.p1();
		Piece p2 = Question1.p2();
		Piece p3 = Question1.p3();
		PieceEq pe1 = new PieceEq(p1);
		PieceEq pe1b = new PieceEq(p1);
		PieceEq pe2 = new PieceEq(p2);
		PieceEq pe3 = new PieceEq(p3);
		Object o1 = pe1; 

		/*
		  System.out.println("pe1="+pe1+" pe1b="+pe1b+" p2="+p2+" p3="+p3);
		  System.out.println("pe1 == p1 -> "+ (pe1==p1));
		  System.out.println("pe1 == pe1 -> "+ (pe1==pe1));
		  System.out.println("pe1 == pe1b -> "+ (pe1==pe1b));
		  System.out.println("pe1 == p1 -> "+ pe1.equals(p1));
		  System.out.println("pe1 == pe1 -> "+ pe1.equals(pe1));
		  System.out.println("pe1 == pe1b -> "+ pe1.equals(pe1b));
		  System.out.println("o1 == p1 -> " + o1.equals(p1));   
		 



		// avec pe1 et pe2 précédents

		PoolQ3 pl3 = new PoolQ3();
		PieceEq pe;

		PieceEq npe1 = pl3.remove(pe1);
		System.out.println("npe1.equals(pe1)--> "+npe1.equals(pe1));
		npe1 = pl3.remove(pe1);
		System.out.println("npe1==null -->"+(npe1==null));
		// ...
		pe = pl3.remove(12);
		pe = pl3.remove(22);
		pe = pl3.remove(23);
		pe = pl3.remove(24);

		int posPool = pl3.indexOf(pe2);
		System.out.println("pl3.indexOf(pe2)= "+ posPool);

		posPool = pl3.indexOf(pe3);
		System.out.println("pl3.indexOf(pe3)= "+ posPool);
		pl3.remove(posPool);
		System.out.println("pl3.indexOf(pe3)= "+ pl3.indexOf(pe3));
		
		
		Plateau pl1 = new Plateau();
	    Plateau pl1clone = (Plateau)pl1.clone();
	    pl1.setPiece(new PieceEq(Question1.p1()),0);
	    System.out.println(pl1.getPiece(0) + " .. " + pl1clone.getPiece(0));
	    
		
		Plateau fig1 = Question5.Figure1();
		Piece p1_fig1 = fig1.getPiece(2);
		if (new PieceEq(p1_fig1).equals(new Piece(9,8,7))) System.out.println("OK");
		else System.out.println("BAD");

		Plateau fig1clone = Question5.Figure1();
		Piece p2_fig1 = fig1clone.getPiece(2);
		System.out.println(p1_fig1 + " .. " + p2_fig1);
		System.out.println(p1_fig1 == p2_fig1);
		
		PlateauCL pli1 = new PlateauCL(Question5.Figure1());
		ArrayList<Integer> ali = pli1.sontLibres();

		for (int i : ali) {System.out.print(i+" ");}
		System.out.println();
		
		
		Piece pe4 = Question1.p1();
	    int i1 = Question8.valeur(pe4,Direction.V); 
	    int i2 = Question8.valeur(pe4,Direction.Hg); 
	    int i3 = Question8.valeur(pe4,Direction.Bg); 
	    System.out.println("piece "+pe4+" = "+ i1 + " " + i2 + " " + i3);
	    */
		
		Lignes lg = new Lignes(Question5.Figure1());
	    int [] r = lg.getLigneDir(0,Direction.Hg);
	    for (int i = 0; i< r.length; i++) {System.out.println("r["+i+"]="+r[i]);}
	}

}
