/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ag.cromosoma;

import ag.gen.Gen;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gerardo
 */
public abstract class Cromosoma implements Comparable<Cromosoma>, Cloneable{

    public int compareTo(Cromosoma o) {
        if (evaluacion() < o.evaluacion())
            return -1;
        else if (evaluacion() > o.evaluacion())
            return 1;
        else
            return 0;
        
    }

    /**
     * Devuelve un double que representa la calidad del cromosoma
     */
    public abstract double evaluacion();
    
    public abstract void aleatoriza();
    
    /**
     * Devuelve un String con la representacion del cromosoma
    */
    public abstract double fenotipo();

    public abstract String toString();


    /**
     * Devuelve una instancia del objeto que hereda
     */
    public abstract Cromosoma nuevo();

    /**
     * Dado un gen devolver la copia
     * TODO : Hacer comprobación de tipos
     */
    public abstract Cromosoma copia(Cromosoma c);

    public abstract Object clone();

    /*














    public Cromosoma clone() {
        Cromosoma nuevo = crearNuevo();
        nuevo.copyFrom(this);
        return nuevo;
    }

    public void copyFrom(Cromosoma c) {
        genes = new Gen[c.genes.length];
        for (int i = 0; i<genes.length; i++) {
            Gen g = new Gen();
            g.copyFrom(c.genes[i]);
            genes[i] = g;
        }
    }

    public int compareTo(Cromosoma o) {
        if (Evaluacion() < o.Evaluacion())
            return -1;
        else if (Evaluacion() > o.Evaluacion())
            return 1;
        else
            return 0;
    }

    public void Cruce(Cromosoma c) {
        for (int i=0; i<genes.length; i++) {
            // Elegimos un punto de corte
            // Del gen g elijo un bit e intercambio a nivel de bit
            int b = utiles.Aleatorio.getRandomInt(genes[i].datos.length);

            // Intercambio todos los bits que están a la izquierda
            for (int j=0; j<b; j++) {
                int aux = c.genes[i].datos[j];
                c.genes[i].datos[j] = genes[i].datos[j];
                genes[i].datos[j] = aux;
            }
        }
    }
    public void mutacion(double prob_mutacion){
        for (int i=0;i<genes.length;i++){
            for (int j=0;j<genes[i].datos.length;j++){
                double r = (double) utiles.Aleatorio.getRandomInt(10000)/10000;
                if (r<prob_mutacion)
                    genes[i].datos[j]=1-genes[i].datos[j];
            }
        }
    }

    public abstract double Fenotipo(int i);

    public String Fenotipo() {
        String resultado = "";
        for (int i = 0; i<genes.length; i++) {
            resultado += "[Gen "+i+" = "+Fenotipo(i)+"] ";
        }

        return resultado;
    }

    public abstract double Fitness();

    public abstract double Evaluacion();

    public abstract Cromosoma crearNuevo();

    public void Aleatorizar() {
        for(int i=0; i<genes.length; i++) {
            int n = genes[i].datos.length;
            for (int j=0; j<n; j++) {
                // TODO: intentar optimizar el cálculo de datos[j]
                genes[i].datos[j] = utiles.Aleatorio.getRandomInt(2); // TODO: comprobar que nºs genera
            }
        }
    }

    public String toString() {
        String r = "TODO: fichero 'Cromosoma.java' linea 103";

        return r;
    }
     *
     *
     */

}
