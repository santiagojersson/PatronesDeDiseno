/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Sujetos;

import PatronObservador.Observadores.Observadores;
import PatronObservador.Observadores.Persona;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Santiago
 */
public class LuzuGames implements Sujeto{

    
    private List<Observadores> subscriptores;
    private String state;
    private String nombreCanal;
    
   public  LuzuGames(){
        this.subscriptores= new LinkedList<Observadores>();
        this.nombreCanal="LuzuGames";
    }
    
    @Override
    public void suscribir(Observadores ob) {
        this.subscriptores.add(ob);
    }

    @Override
    public void desSuscribir(Observadores ob) {
        this.subscriptores.remove(ob);
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void setState(String state) {
        this.state=state;
        for (Observadores subs : subscriptores) {
            subs.notificar(this);
        }
    }

    @Override
    public String nombreCanal() {
        return this.nombreCanal;
    }
}
