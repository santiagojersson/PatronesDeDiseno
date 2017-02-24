/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador;

import PatronDecorador.Adiciones.Vainilla;
import PatronDecorador.Componentes.Cafe;
import PatronDecorador.Componentes.Expreso;

/**
 *
 * @author Santiago
 */
public class Main {
    public static void main(String[] args) {
        Cafe expreso= new Expreso(1200);
        
        Vainilla v= new Vainilla(expreso);
        v.setPrecio(200);
        expreso = v;
        
        System.out.println("precio total del cafe "+expreso.getPrecio());
        
        
        
    }
}
