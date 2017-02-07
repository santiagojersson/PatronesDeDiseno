/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia.Objetos;

import PatronEstrategia.Comportamientos.CantFly;
import PatronEstrategia.Comportamientos.CantQuak;

/**
 *
 * @author Labing
 */
public class WoodDuck extends Duck{

    @Override
    public void fly() {
        super.flyBehavior.fly();
    }
    
    public WoodDuck(){
        super.flyBehavior= new CantFly();
        super.quakBehavior= new CantQuak();
    }

    @Override
    public void quak() {
        super.quakBehavior.quak();
    }
    
}
