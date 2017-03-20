/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronAdaptador;

/**
 *
 * @author Labing
 */
public class Secuencias {
    
    int ret=0;
    public void hexagonal(int n){
        for (int i = 1; i <= n; i++) {
            ret=(2*i*((2*i)-1))/2;
            System.out.print(ret+" ");
        }
        
        
    }
    public void catalan(int n){
        for (int i = 0; i <= n; i++) {
            System.out.print(cata(i)+" ");
        }
    }
    
    private long cata(int n){
        long factorial=2*n;
        long facto1=1;
        long facto2=1;
        long facto3=1;
        long retorno=0;
        for (long i = 1; i <= factorial; i++) {
            facto1=facto1*i; 
            if(i==n){
                facto3=facto1;
            }
            if((i+1)==(n+1)){
                facto2=facto1*(i+1);
            }
        }
        //System.out.println(facto1+" "+facto2+" "+facto3);
        retorno=facto1/(facto2*facto3);
        return retorno;
    }
    
    public void fibonacci(int n){
        long ante=0;
        long result=0;
        long temporal=0;
        for(int i=0;i<=n;i++){
            if (i==0) {
                ante=0;
                result=ante+temporal;
                System.out.print(result+" ");
            }
            if(i==1){
                temporal=1;
                result=ante+temporal;
                System.out.print(result+" ");
            }
            if (i!=1 && i!=0) {
                result=ante+temporal;
                System.out.print(result+" ");
                ante=temporal;
                temporal=result;
            }
            
            
            
        }
    }
    
    
}
