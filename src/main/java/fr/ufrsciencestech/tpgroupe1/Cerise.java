/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package fr.ufrsciencestech.tpgroupe1;

/**
 *
 * @author fr108211
 */
public class Cerise extends FruitSimple{
    public Cerise(double p, String o) throws PrixNegatifException {
        if(p<0.0) {
            throw new PrixNegatifException();
        }
        else {
            prix = p;
            origine = o;
        }
    }
    public Cerise() {
        prix=0.5;
        origine = "Inconnue";
    }
    @Override
    public String toString() {
        return "Cette cerise de "+this.getOrigine()+" coûte "+this.getPrix()+"€";
    }
    
}
