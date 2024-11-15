
package ec.edu.espoch.sistemasolar.clases;

import ec.edu.espoch.sistemasolar.enumeracion.TipoPlaneta;

public class Planeta {
    
    public String nombre;
    public int cantidadSatelites;
    public float masaKg;
    public float volumenKm3;
    public float diametrokm;
    public float distanciaSol;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior=false;

    public Planeta(String nombre, int cantidadSatelites, float masaKg, float volumenKm3, float diametrokm, float distanciaSol, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKg = masaKg;
        this.volumenKm3 = volumenKm3;
        this.diametrokm = diametrokm;
        this.distanciaSol = distanciaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
    }
    public void imprimir(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Cantidad de Satelites"+cantidadSatelites);
        System.out.println("La cantidad de masa en kg es:"+masaKg);
        System.out.println("La cantidad de volumen en Km cubicos es:"+volumenKm3);
        System.out.println("El diametro en km es:"+diametrokm);
        System.out.println("La distancia del sol es:"+distanciaSol);
        System.out.println("El tipo de planeta es:"+tipoPlaneta);
        System.out.println("Diametro"+exterior);
    }
    
    public float calcularDensidadPlaneta(){
        return masaKg/volumenKm3;
    }
    
    public boolean exterior(){
        double maximo=3.4;
        double distancia=149597870;
        double limite=maximo*distancia;
        boolean resp=false;
        if(distanciaSol>limite){
            exterior=true;
        }
        return exterior;
    } 
}
