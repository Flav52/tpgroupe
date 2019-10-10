
package fr.ufrsciencestech.tpgroupe1;

public class Orange {
    
    private double prix;
    private String origine;
	
    public Orange(double p, String o) throws PrixNegatifException {
    	if(p<0.0) {
            throw new PrixNegatifException();
	}
	else {
            prix = p;
            origine = o;
	}
    }

    public Orange() {
        prix=0.5;
        origine = "Inconnue";
    }
	
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
        
    public String toString() {
	return "Cette orange de "+origine+" coûte "+prix+"€";
    }
	
    public void affiche() {
    	System.out.println(toString());
    }
}
