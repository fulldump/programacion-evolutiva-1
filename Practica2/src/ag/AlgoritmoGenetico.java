/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ag;

import ag.cromosoma.Cromosoma;
import ag.seleccion.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author gerardo
 */
public class AlgoritmoGenetico {
    /*
    public int tamano = 100;
    public int num_generaciones = 100;
    public double prob_cruce = 0.8;
    public double prob_mutacion = 0.01;
    public boolean elitismo;
    public int tamano_elite = 3;
    public double porcentaje_seleccionados = 0.6;

    protected Cromosoma _c;
    protected Seleccion _s;

    protected ArrayList<Cromosoma> _poblacion;
    protected ArrayList<Cromosoma> _elite;

    public ArrayList<Double> mejor_absoluto;
    public ArrayList<Double> mejor_generacion;
    public ArrayList<Double> media_generacion;

    public AlgoritmoGenetico(Cromosoma c, Seleccion s) {
        _c = c;
        _s = s;

        mejor_generacion = new ArrayList<Double>();
        mejor_absoluto = new ArrayList<Double>();
        media_generacion = new ArrayList<Double>();
    }

    public Cromosoma getMejor() {
        Collections.sort(_elite);
        Collections.reverse(_elite);
        return _elite.get(0);
    }

    public void evaluarPoblacion() {
        //////////////////
        // Elegir élite
        //////////////////

        // Ordenamos la población de MEJOR a PEOR
        Collections.sort(_poblacion);
        Collections.reverse(_poblacion);

        // Añadimos los N mejores al conjunto de la élite
        for (int i=0; i<tamano_elite; i++)
            _elite.add(_poblacion.get(i).clone());

        // Mantenemos el tamaño de la élite eliminando los peores
        Collections.sort(_elite);
        while (_elite.size()>tamano_elite)
            _elite.remove(0);
        Collections.reverse(_elite); // El primero es el mejor

        //////////////////////////
        // Análisis estadístico
        //////////////////////////


        mejor_generacion.add(Collections.max(_poblacion).Fitness());
        mejor_absoluto.add(_elite.get(0).Fitness());

        double suma=0.0;        
        for (Cromosoma c : _poblacion)
            suma+=c.Fitness();
        media_generacion.add(suma/tamano);           
    }

    public void inicializa() {

        // Creamos la población y la élite inicial
        _elite = new ArrayList<Cromosoma>(tamano_elite);
        _poblacion = new ArrayList<Cromosoma>(tamano);
        Cromosoma c;
        for (int i = 0; i<tamano; i++) {
            c = _c.crearNuevo();
            _poblacion.add(c);
        }
        
        evaluarPoblacion();

        int num_seleccionados = (int) (porcentaje_seleccionados*tamano);

        int ng = num_generaciones;
        while (ng>0) { ng--;

            // 0) SI HAY ELITISMO, METEMOS LA ÉLITE EN LA POBLACIÓN
            if (elitismo) {
                for (Cromosoma cromosoma : _elite) {
                    _poblacion.add(cromosoma.clone());
                }
            }

            // 1) SELECCIONAR POBLACION A CRUZAR
            ArrayList<Cromosoma> seleccionados = _s.Selecciona(num_seleccionados, _poblacion);

            // 2) CRUZAMOS LA POBLACIÓN SUSTITUYENDO A LOS PADRES
            for (int i = 1; i<num_seleccionados-1; i+=2) 
                if (utiles.Aleatorio.getRandomDouble()<prob_cruce)
                    seleccionados.get(i).Cruce(seleccionados.get(i-1));

            // 3) MUTAMOS LA POBLACIÓN
            for (int i =0;i<_poblacion.size();i++) 
                _poblacion.get(i).mutacion(prob_mutacion);


            // 4) CONSERVAMOS EL TAMAÑO DE LA POBLACIÓN ELIMINANDO LOS PEORES
            Collections.sort(_poblacion);
            while (_poblacion.size()>tamano)
                _poblacion.remove(0);

            // Evaluamos la población
            evaluarPoblacion();
            
        }
    }

*/
}