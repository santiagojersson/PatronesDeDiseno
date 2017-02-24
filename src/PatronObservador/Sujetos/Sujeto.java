/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Sujetos;

import PatronObservador.Observadores.Observadores;

/**
 *
 * @author Santiago
 */
public interface Sujeto {
        
    public void suscribir(Observadores ob);
    public void desSuscribir(Observadores ob);
    public String getState();
    public void setState(String state);
    public String nombreCanal();
}
