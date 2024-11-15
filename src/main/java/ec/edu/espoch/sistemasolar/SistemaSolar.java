/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar;

import ec.edu.espoch.sistemasolar.clases.Planeta;
import ec.edu.espoch.sistemasolar.enumeracion.TipoPlaneta;

/**
 *
 * @author SO-LAB-PC5
 */
public class SistemaSolar {

    public static void main(String[] args) {
        Planeta objPlaneta=new Planeta("Saturno",20,10,80000,90010101,149597870, TipoPlaneta.TERRESTRE);
        
        
       
        objPlaneta.imprimir();
        
        
        float densidad=objPlaneta.calcularDensidadPlaneta();
        System.out.println("La densidad es:"+densidad);
    }
}
    

