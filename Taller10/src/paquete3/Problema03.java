/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {
    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
	double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        double[] sumaNotas = new double[3];
                            
        
        String reporte = "";
        
        for (int i = 0; i < notas.length; i++) { 
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) { 
                suma = suma + notas[i][j];
                     
            }
            sumaNotas[i] = suma; // 
        }
        
        // Presentación de resultados
        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante %s tiene una sumataria "
                    + "de notas: %.3f\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i]);
        }
        
        System.out.printf("%s\n", reporte);
        
    }
}
