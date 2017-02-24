/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador;

import PatronObservador.Observadores.Persona;
import PatronObservador.Sujetos.LuzuGames;

/**
 *
 * @author Santiago
 */
public class Cliente {
    
    public static void main(String[] args) {
        LuzuGames lz= new LuzuGames();
        Persona p= new Persona("Miguel");
        lz.suscribir(new Persona("Santi"));
        lz.suscribir(new Persona("Felix"));
        lz.suscribir(p);
        lz.setState("Video 1");
        lz.desSuscribir(p);
        lz.setState("Video 2");
    }
    
}
