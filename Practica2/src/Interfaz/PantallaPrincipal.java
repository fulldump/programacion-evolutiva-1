/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ag.AlgoritmoGenetico;
import ag.cromosoma.Cromosoma;
import ag.gen.Gen;
import ag.seleccion.Seleccion;
import ag.seleccion.SeleccionRuleta;
import ag.seleccion.SeleccionTorneo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.math.plot.*;
import practica2.CromosomaE1;

/**
 *
 * @author Alberto
 */
public class PantallaPrincipal extends javax.swing.JFrame {
/*

    public PantallaPrincipal() {
        modelotabla = new DefaultTableModel();        
        initComponents();
        frameGrafica.setVisible(false);
        scrollResultados.setVisible(false);
      }
    

     public boolean esEntero(String cad){
        for(int i = 0; i<cad.length(); i++){
             if(!Character.isDigit(cad.charAt(i)))  return false;
                 }
        return true;
 }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Error = new javax.swing.JDialog();
        PanelPrincipal = new javax.swing.JPanel();
        funcion = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        numGen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        poblacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        probCruce = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        probMutacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valorN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seleccion = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cruce = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        elitismo = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        precision = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        variable = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cotaInf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cotaSup = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        intervalo = new javax.swing.JTextField();
        tamanoElite = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        seleccionados = new javax.swing.JTextField();
        frameGrafica = new javax.swing.JInternalFrame();
        scrollResultados = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTextArea();

        javax.swing.GroupLayout ErrorLayout = new javax.swing.GroupLayout(Error.getContentPane());
        Error.getContentPane().setLayout(ErrorLayout);
        ErrorLayout.setHorizontalGroup(
            ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        ErrorLayout.setVerticalGroup(
            ErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        funcion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Función 1", "Función 2", "Función 3", "Función 4", "Función 5" }));
        funcion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                funcionItemStateChanged(evt);
            }
        });
        funcion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                funcionPropertyChange(evt);
            }
        });

        jLabel1.setText("Función");

        numGen.setText("100");

        jLabel2.setText("Num. generaciones");

        poblacion.setText("100");
        poblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poblacionActionPerformed(evt);
            }
        });

        jLabel3.setText("Tam. población");

        probCruce.setText("0.8");

        jLabel4.setText("Prob. cruce");

        probMutacion.setText("0.1");

        jLabel5.setText("Prob. mutación");

        valorN.setText("3");
        valorN.setEnabled(false);

        jLabel6.setText("Valor de n");
        jLabel6.setEnabled(false);

        seleccion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ruleta", "Torneo" }));

        jLabel7.setText("Selección");

        cruce.setEnabled(false);

        jLabel8.setText("Cruce");
        jLabel8.setEnabled(false);

        elitismo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                elitismoStateChanged(evt);
            }
        });

        jLabel9.setText("Elitismo");

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel10.setText("Precisión");

        precision.setText("0.0001");

        jLabel11.setText("Estudio sobre variable");

        variable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno", "Población", "Generaciones", "Prob. cruce", "Prob. mutacion", "Tamaño de élite", "Precisión", "Seleccionados (%)" }));
        variable.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                variableItemStateChanged(evt);
            }
        });

        jLabel13.setText("Min");
        jLabel13.setEnabled(false);

        cotaInf.setEnabled(false);
        cotaInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotaInfActionPerformed(evt);
            }
        });

        jLabel12.setText("Max");
        jLabel12.setEnabled(false);

        cotaSup.setEnabled(false);

        jLabel14.setText("Intervalo");
        jLabel14.setEnabled(false);

        intervalo.setEnabled(false);
        intervalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intervaloActionPerformed(evt);
            }
        });

        tamanoElite.setText("3");
        tamanoElite.setName(""); // NOI18N

        jLabel15.setText("Seleccionados (%)");

        seleccionados.setText("0.6");
        seleccionados.setName(""); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(variable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cotaInf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cotaSup, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(numGen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(poblacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(probCruce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(probMutacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(valorN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(seleccion, javax.swing.GroupLayout.Alignment.LEADING, 0, 233, Short.MAX_VALUE)
                            .addComponent(precision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(cruce, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(elitismo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tamanoElite, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addComponent(funcion, 0, 233, Short.MAX_VALUE)))
                    .addComponent(calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(probCruce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(probMutacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cruce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(elitismo)
                    .addComponent(tamanoElite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(seleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(variable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cotaInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cotaSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        frameGrafica.setEnabled(false);
        frameGrafica.setVisible(true);

        javax.swing.GroupLayout frameGraficaLayout = new javax.swing.GroupLayout(frameGrafica.getContentPane());
        frameGrafica.getContentPane().setLayout(frameGraficaLayout);
        frameGraficaLayout.setHorizontalGroup(
            frameGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        frameGraficaLayout.setVerticalGroup(
            frameGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        scrollResultados.setEnabled(false);

        resultados.setColumns(20);
        resultados.setRows(5);
        scrollResultados.setViewportView(resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(scrollResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frameGrafica)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameGrafica)
                .addGap(18, 18, 18)
                .addComponent(scrollResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        Cromosoma c = null;
        Seleccion s = null;
        Boolean valido=true;
        //Selecccionamos que funcion ha escogido el usuario
        switch(funcion.getSelectedIndex()){
            case 0 : {
                c = new CromosomaE1();
                frameGrafica.setTitle("Grafica Función 1");
                break;
            }
        }

        // Escogemos el algoritmo de selección
        switch(seleccion.getSelectedIndex()){
            case 0 : s = new SeleccionRuleta(); break;
            case 1 : s = new SeleccionTorneo(); break;
        }

        // Creamos un algoritmo genético nuevo
        AlgoritmoGenetico ag = new AlgoritmoGenetico(c, s);

        // Configuramos las variables del algoritmo desde la GUI
        if (!numGen.getText().isEmpty()) 
            try{ag.num_generaciones=Integer.parseInt(numGen.getText());}
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Numero de generaciones incorrecto.\n Debe ser un número entero.");
                valido=false;}

        if (!poblacion.getText().isEmpty())
            try{ag.tamano=Integer.parseInt(poblacion.getText());}
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Tamaño de población incorrecto.\n Debe ser un número entero.");
                valido=false;}

        if (!probCruce.getText().isEmpty())
            try{ag.prob_cruce=Double.valueOf(probCruce.getText());}
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Probabilidad de cruce incorrecta.\n Debe ser un número real.");
                valido=false;}

        if (!probMutacion.getText().isEmpty())
            try{ag.prob_mutacion=Double.valueOf(probMutacion.getText());}
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, "Probabilidad de mutación incorrecta.\n Debe ser un número real.");
                valido=false;}

        if (!seleccionados.getText().isEmpty())
            try {
                ag.porcentaje_seleccionados = Double.valueOf(seleccionados.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "Porcentaje incorrecto, debe ser un número entre 0 y 1");
                valido=false;
            }

        ag.elitismo = elitismo.isSelected();

        if (!tamanoElite.getText().isEmpty())
            try {ag.tamano_elite = Integer.valueOf(tamanoElite.getText());}
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, "El tamaño de la población debe ser un número entero.");
                valido=false;
            }

        if (valido){
            if (variable.getSelectedIndex()==0){
                ag.inicializa();
                double[] regla = new double[ag.mejor_generacion.size()];
                double[] mejorGeneracion = new double[ag.mejor_generacion.size()];
                double[] mejorAbsoluto = new double[ag.mejor_absoluto.size()];
                double[] mediaGeneracion = new double[ag.media_generacion.size()];
                for (int i=0;i<ag.mejor_generacion.size();i++){
                    regla[i]=(double)i;
                    mejorGeneracion[i]=ag.mejor_generacion.get(i);
                    mejorAbsoluto[i]=ag.mejor_absoluto.get(i);
                    mediaGeneracion[i]=ag.media_generacion.get(i);
                }

                // create your PlotPanel (you can use it as a JPanel)
                Plot2DPanel plot = new Plot2DPanel();

                // define the legend position
                plot.addLegend("SOUTH");
                plot.getAxis(0).setLabelText("Generación");
                plot.getAxis(1).setLabelText("Evaluación");


                // add a line plot to the PlotPanel
                plot.addLinePlot("Mejor Generacion",Color.RED, regla, mejorGeneracion);
                plot.addLinePlot("Mejor Absoluto", Color.GREEN,regla, mejorAbsoluto);
                plot.addLinePlot("Media Generacion", Color.ORANGE, regla, mediaGeneracion);

                // put the PlotPanel in a JFrame like a JPanel
                frameGrafica.setContentPane(plot);
                frameGrafica.setVisible(true);

                Cromosoma mejor = ag.getMejor();

                resultados.setText("Maximo "+mejor.Fitness()+" "+mejor.Fenotipo());
                scrollResultados.setVisible(true);

            } else {
                double min=Double.valueOf(cotaInf.getText());
                double max=Double.valueOf(cotaSup.getText());
                double paso=Double.valueOf(intervalo.getText());
                int indice=0;
                int n=(int)Math.floor((double)(max-min)/paso)+1;
                double[] ejex = new double[n];
                double[] maximoAbsolutoVarias = new double[n];
                double[] minimoAbsolutoVarias = new double[n];
                //ArrayList<Double> mediaVarias = new ArrayList <Double>();
                for (double i=min;i<=max;i+=paso){

                    this.setTitle("Completado "+(100*indice/n)+"%");

                    switch (variable.getSelectedIndex()){
                        //poblacion
                        case 1:
                            ag.tamano=(int)i;
                            break;
                        case 2:
                            ag.num_generaciones=(int)i;
                            break;
                        case 3:
                            ag.prob_cruce=i;
                            break;
                        case 4:
                            ag.prob_mutacion=i;
                            break;
                        case 5:
                            ag.elitismo = true;
                            ag.tamano_elite=(int) i;
                            break;
                        case 7:
                            ag.porcentaje_seleccionados = i;
                            break;


                    }
                    ag.inicializa();
                    Cromosoma mejor = ag.getMejor();
                    if (indice<n) {
                        ejex[indice]=i;
                        maximoAbsolutoVarias[indice]=mejor.Fitness();
                    }
                    indice++;
                    //TODO: Calcular media para la gráfica
                }

                this.setTitle("Completado :D");

                if (indice<n) {
                    ejex[indice]=ejex[indice-1];
                    maximoAbsolutoVarias[indice]=maximoAbsolutoVarias[indice-1];
                }

                Plot2DPanel plot = new Plot2DPanel();

                // define the legend position
                plot.addLegend("SOUTH");
                plot.getAxis(0).setLabelText(variable.getSelectedItem().toString());
                plot.getAxis(1).setLabelText("Evaluación");


                // add a line plot to the PlotPanel
                plot.addLinePlot("Mejor", Color.GREEN,ejex, maximoAbsolutoVarias);

                frameGrafica.setContentPane(plot);
                frameGrafica.setVisible(true);
            }
        }     
    }//GEN-LAST:event_calcularActionPerformed

    private void poblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poblacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_poblacionActionPerformed

    private void funcionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_funcionPropertyChange
        // TODO add your handling code here:


    }//GEN-LAST:event_funcionPropertyChange

    private void funcionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_funcionItemStateChanged
        // TODO add your handling code here:
        boolean activo = funcion.getSelectedIndex() == 4;
        valorN.setEnabled(activo);
        jLabel6.setEnabled(activo);
    }//GEN-LAST:event_funcionItemStateChanged

    private void variableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_variableItemStateChanged
        // TODO add your handling code here:
        boolean activo = (variable.getSelectedIndex() != 0);
        jLabel12.setEnabled(activo);
        jLabel13.setEnabled(activo);
        jLabel14.setEnabled(activo);
        cotaSup.setEnabled(activo);
        cotaInf.setEnabled(activo);
        intervalo.setEnabled(activo);
    }//GEN-LAST:event_variableItemStateChanged

    private void cotaInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotaInfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cotaInfActionPerformed

    private void intervaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intervaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intervaloActionPerformed

    private void elitismoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_elitismoStateChanged
        tamanoElite.setEditable(elitismo.isSelected());
    }//GEN-LAST:event_elitismoStateChanged

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }


    */

    private DefaultTableModel modelotabla;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Error;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField cotaInf;
    private javax.swing.JTextField cotaSup;
    private javax.swing.JTextField cruce;
    private javax.swing.JCheckBox elitismo;
    private javax.swing.JInternalFrame frameGrafica;
    private javax.swing.JComboBox funcion;
    private javax.swing.JTextField intervalo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField numGen;
    private javax.swing.JTextField poblacion;
    private javax.swing.JTextField precision;
    private javax.swing.JTextField probCruce;
    private javax.swing.JTextField probMutacion;
    private javax.swing.JTextArea resultados;
    private javax.swing.JScrollPane scrollResultados;
    private javax.swing.JComboBox seleccion;
    private javax.swing.JTextField seleccionados;
    private javax.swing.JTextField tamanoElite;
    private javax.swing.JTextField valorN;
    private javax.swing.JComboBox variable;
    // End of variables declaration//GEN-END:variables
}
