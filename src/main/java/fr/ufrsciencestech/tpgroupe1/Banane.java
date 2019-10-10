/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fr108211
 */
package fr.ufrsciencestech.tpgroupe1;

public class Banane extends FruitSimple {
     public Banane(double p, String o) throws PrixNegatifException {
    	if(p<0.0) {
            throw new PrixNegatifException();
	}
	else {
            prix = p;
            origine = o;
	}
    }

    public Banane() {
        prix=0.5;
        origine = "Inconnue";
    }
        
    public String toString() {
	return "Cette banane de "+this.getOrigine()+" coûte "+this.getPrix()+"€";
    }
}
