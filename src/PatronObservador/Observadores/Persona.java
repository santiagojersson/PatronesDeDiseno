/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Observadores;

import PatronObservador.Sujetos.Sujeto;


public class Persona implements Observadores{
    
    
    private String nombre;
    
    
    public Persona(String name){
        
        this.nombre=name;
    }

    @Override
    public void notificar(Sujeto s) {
        System.out.println(this.nombre+ " Se subio un nuevo video de "+s.nombreCanal()+" "+s.getState());
    }
    
    public String getNombre(){
        return nombre;
    }
    
    
    
}
