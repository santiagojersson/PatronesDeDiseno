/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia.Objetos;

import PatronEstrategia.Comportamientos.Flyable;
import PatronEstrategia.Comportamientos.Quakable;

/**
 *
 * @author Labing
 */
public abstract class Duck {
    
    protected Flyable flyBehavior;
    protected Quakable quakBehavior;
    
    public abstract void fly();
    public abstract void quak();
    
}
