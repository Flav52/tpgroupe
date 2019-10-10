
package fr.ufrsciencestech.tpgroupe1;

import java.util.Observable;
import java.util.Observer;

public class VueConsole implements Observer {

    private String trace;
    
    public VueConsole() {
        
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        //TODO
    }
    
}
