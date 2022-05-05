/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

/**
 *
 * @author javi_
 */
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 14;
        int mod;
        String cadena ="";
        
        while(true){
            mod = numero % 2;
            cadena = mod + cadena;
            numero = numero / 2;
            if(numero== 1){
                cadena = 1 + cadena;
                break;
            }
        }
        System.out.println(cadena);
    }
    
}
