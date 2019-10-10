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
public abstract class FruitSimple {
    
    protected double prix;
    protected String origine;
    protected boolean pepins;
    
    public double getPrix() {
        return prix;
    }
    
    public String getOrigine() {
        return origine;
    }
    
    public void setPrix(double p) {
        prix = p;
    }
    
    public void setOrigine(String o) {
        origine = o;
    }
    
    public boolean isSeedless(){
        return pepins;
    }
    
    public void affiche() {
    	System.out.println(toString());
    }
    
    public abstract String toString();
    
}
