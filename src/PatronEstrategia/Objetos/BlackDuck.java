/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia.Objetos;

import PatronEstrategia.Comportamientos.CanFly;
import PatronEstrategia.Comportamientos.RepublicanQuak;

/**
 *
 * @author Labing
 */
public class BlackDuck extends Duck{

    @Override
    public void fly() {
        super.flyBehavior.fly();
    }
    
    public BlackDuck(){
        super.flyBehavior= new CanFly();
        super.quakBehavior= new RepublicanQuak();
    }

    @Override
    public void quak() {
        super.quakBehavior.quak();
    }
    
    
    
}
