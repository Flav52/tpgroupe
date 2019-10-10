
package fr.ufrsciencestech.tpgroupe1;

public class Orange extends FruitSimple {
	
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
        
    public String toString() {
	return "Cette orange de "+this.getOrigine()+" coûte "+this.getPrix()+"€";
    }
    
    @Override
    public boolean equals(Object o) { 
        if (o == this) { 
            return true; 
        } 
        
        if (!(o instanceof Orange)) { 
            return false; 
        } 
            
        Orange c = (Orange) o; 
          
        return this.getOrigine().equals(c.getOrigine()) && this.getPrix()==c.getPrix();
    } 
}
