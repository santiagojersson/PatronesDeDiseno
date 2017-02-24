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
public abstract class Decorador extends Cafe{
   
    protected Cafe c;
    public abstract void Decorador(Cafe c);
}
