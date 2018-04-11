/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Administrador
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int[][]datos = new int[5][5];
        
        for(int F=0; F<=4; F++){
            
            for(int C=0; C<=4; C++){
               
                if((F==C)||((F+C)==4)){
                   
                    datos[F][C]= 1;
                   
                }else{
                datos[F][C] = 0;
                }
                System.out.print(datos[F][C] + " - ");
            }
            System.out.print("\n");
        }
    
    }
    
}
