/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class EjemploJTable extends JFrame {
    private JTable tabla = null;
    DefaultTableModel modelo = null;
    JScrollPane desplazamiento = null;
    
    public EjemploJTable(){
        String[] columnas = { "columna 0", "columna 1","columna 2","columna 3"};
        tabla = new JTable();
        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);
        
        //parametro de la ventana
        
        this.setTitle("Ejemplo de JTable");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Agregamos encabezado de la columna
        
        modelo.setColumnIdentifiers(columnas);
        
        //Barra de desplazamiento
        
        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        //Propiedades a la tabla
        
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);
        
        //Vincular la tabla con el modelo 
        
        tabla.setModel(modelo);
        
        //agregamos elementos a la ventana
        this.getContentPane().add(desplazamiento);
        this.pack();
        
        //Agrego datos a la tabla
        
        //borramos todas las filas en la tabla
        modelo.setRowCount(0);
        
        //creamos los datos a insertar dentro de un vector o un objeto
        
        Object [] datoFila = {"dato 0,0","datos 0,1","datos 0,2","datos 0,3"};
        
        //Agrego esos datos a la tabla
        
        modelo.addRow(datoFila);
       
        //agregamos muchos mas datos
        for (int i=0;i<500;i++){
            datoFila[0] = "datos "+i+", 0";
            datoFila[1] = "datos "+i+", 1";
            datoFila[2] = "datos "+i+", 2";
            datoFila[3] = "datos "+i+", 3";
            modelo.addRow(datoFila);
        }
        
        
    }
    
    public static void main(String[] args) {
        EjemploJTable ventana = new EjemploJTable();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
    }
    
}
