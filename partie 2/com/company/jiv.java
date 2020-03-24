package com.company;

public class jiv {

    public String RendreMonnaie(double valDemande){
        String aRendre ="La machine donne : \n";
        double temp=0;
        for (Piece piece:pieceAutorise) {
            temp = valDemande%(piece.getValeur());
            int nbPiece =(int)( (valDemande-temp)/(piece.getValeur()));
            if (nbPiece > piece.getNbRestant()){
                temp = temp + (nbPiece-piece.getNbRestant())*piece.getValeur();
                nbPiece=piece.getNbRestant();
                piece.setNbRestant(0);
            }else{
                piece.setNbRestant(piece.getNbRestant()-nbPiece);
            }
            aRendre += "la machine rendra "+nbPiece+" de "+piece.getValeur()+" €.\n";
            valDemande =temp;
            if (temp ==0){
                break;
            }
        }
        if(temp !=0){
            return "ERREUR la machine ne possede pas suffisement de piece pour rendre la monnaie";
        }
        return aRendre;
    }
    private Piece[] pieceAutorise ={
            new Piece(2,100),
            new Piece(1,100),
            new Piece(0.5,100),
            new Piece(0.2,100),
            new Piece(0.1,100),
    };
}
