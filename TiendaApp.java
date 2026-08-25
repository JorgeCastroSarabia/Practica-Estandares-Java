package com.mycompany.app;

import com.mycompany.model.producto;
import java.util.ArrayList;

public class TiendaApp {
    
    
    public static void main(String[] args) {
        producto uno = new producto("1", "laptop", 67.0, 2);
        producto dos = new producto("2", "celular", 68.0, 1);
        producto tres = new producto("1", "tablet", 600.0, 7);
    
        ArrayList<producto> listaProductos = new ArrayList<>();
        listaProductos.add(uno);
        listaProductos.add(dos);
        listaProductos.add(tres); 
        
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).MostrarInfo();
            System.out.println("-------------------");
        }
        
                
        
    }
    
    
}
