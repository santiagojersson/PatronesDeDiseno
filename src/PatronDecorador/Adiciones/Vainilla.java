/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador.Adiciones;

import PatronDecorador.Componentes.Cafe;

/**
 *
 * @author Santiago
 */
public class Vainilla extends Decorador{

    @Override
    public int getPrecio() {
        return super.c.getPrecio();
                
    }

    @Override
    public void setPrecio(int p) {
        super.c.setPrecio(p);
    }

    @Override
    public void Decorador(Cafe c) {
        super.c=c;
    }
    
    public Vainilla(Cafe c){
        Decorador(c);
    }
}
