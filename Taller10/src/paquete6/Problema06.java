/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
                                {"Carrie Burton", "Lauren Rice"},
                                {"Emma Escobar", "Lori Flores"},
                                {"Steven West", "Toni Martin"}};
        
        
        String reporte = "";
        
        for (int i = 0; i < estudiantes.length; i++) { 
            for (int j = 0; j < estudiantes[i].length; j++) { 
                if (estudiantes[i][j].length() == 11){
                    System.out.printf("%s%s\n",
                            reporte,
                            estudiantes[i][j]);
                }    
            }
            
        }
    }
}
       