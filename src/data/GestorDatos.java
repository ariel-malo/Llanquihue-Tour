package data;
/**
 * Esta clase es usada para gestionar datos como archivos.txt
 * tanto como para leer o escribir.
 */

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {
    //creamos un metodo con para cargar los datos
    public ArrayList<Tour> cargar(String archivo){
        //creamos un arraylist de la clase Tour
        ArrayList<Tour> lista=new ArrayList<>();
        //creamos un reader con su buffered para leer el archivo.txt
        try(BufferedReader reader=new BufferedReader(new FileReader(archivo))){
        String linea;
        while((linea= reader.readLine())!=null){
            //creamos un arreglo con un split (";" es el caracter que separa por partes)
            String [] partes=linea.split(";");
            //si partes tiene un tamaño igual a 3 entonces hara esto:
            if(partes.length==3){
                //separamos cada atributo del archivo.txt en partes
                String tour=partes[0];
                String tipo=partes[1];
                double precio= Double.parseDouble(partes[2]);
                //creamos una instancia de la clase Tour
                Tour producto=new Tour(tour,tipo,precio);
                //agregamos el producto a un arraylist
                lista.add(producto);
            }

        }

    }catch(IOException e){
            System.out.println("error al leer los datos" + e.getMessage());
        }

return lista;
}}
