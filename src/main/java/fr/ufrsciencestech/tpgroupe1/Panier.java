
package fr.ufrsciencestech.tpgroupe1;

import java.util.ArrayList;
import java.util.Observable;

public class Panier extends Observable {

	private ArrayList<FruitSimple> liste;
	private final int max;
	
	public Panier(int m) {
            liste = new ArrayList<FruitSimple>();
            if(m>0) {
		max = m;
            }
            else if(m==0){
                max=1;
            }
            else max = -m;
	}
	
	public ArrayList getListe() {
		return liste;
	}
	
	public void setListe(ArrayList al) {
		liste = al;
	}
	
	public int getMax() {
		return max;
	}

	public int getNbElements() {
		return liste.size();
	}
	
	public boolean estPlein() {
		if(getNbElements()==max) return true;
		return false;
	}
	
	public boolean estVide() {
		if(getNbElements()==0) return true;
		return false;
	}
	
	public void ajoute(FruitSimple o) throws PanierPleinException {
		if(!estPlein()) {
			liste.add(o);
                        setChanged();
                        notifyObservers();
		}
		else throw new PanierPleinException();
	}
        
        public void ajoute() throws PanierPleinException {
	if(!estPlein() && !estVide()) {
                    liste.add(liste.get(liste.size()-1));
                    setChanged();
                    notifyObservers();
		}
                else if(estVide()) {
                    liste.add(new Orange());
                    setChanged();
                    notifyObservers();
                }
                else throw new PanierPleinException();
	}
	
	public void retire() throws PanierVideException {
		if(!estVide()) {
			liste.remove(liste.size()-1);
                        setChanged();
                        notifyObservers();
		}
		else throw new PanierVideException();
	}
	
	public double getPrix() {
		double p = 0;
		for(FruitSimple o : liste) {
			p += o.getPrix();
		}
		return p;
	}
        
        public void boycottOrigine(String o) {
            //TODO
        }
        
        public String toString() {
            String s = "MAX :"+max+"\n";
            for(FruitSimple p : liste) {
                s += p.toString()+"\n";
            }
            return s;
        }

        public void affiche() {
            System.out.println(toString());
        }

        @Override
	public boolean equals(Object o) {
            if(this == o) {
                return true;
            }
            if(o == null || o.getClass() != this.getClass()) {
                return false;
            }
            Panier p = (Panier)o;
            return (p.liste == this.liste && p.max == this.max);
        }
        
        
}

