
package fr.ufrsciencestech.tpgroupe1;

public class App {

    private static VueGraphique vueGraph;

    public VueGraphique getVueGraph() {
        return vueGraph;
    }

    public void setVueGraph(VueGraphique vueGraph) {
        this.vueGraph = vueGraph;
    }
  
    public static void main(String[] args) throws PrixNegatifException, PanierPleinException {
        vueGraph = new VueGraphique();
        Panier p = new Panier(20);
        p.ajoute(new Orange(0.8,"Ouais"));
        Controleur c = new Controleur();
        c.setPanier(p);
        vueGraph.ajoutControleur(c);
    }
    
}
