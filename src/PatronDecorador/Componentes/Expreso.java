/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador.Componentes;

/**
 *
 * @author Santiago
 */
public class Expreso extends Cafe{

  
    @Override
    public int getPrecio() {
        return super.precio;
    }

    @Override
    public void setPrecio(int p) {
        super.precio=super.precio+p;
    }

    
    public Expreso(int pre){
        setPrecio(pre);
    }

    
    
}
