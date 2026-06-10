import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

public class Main {

public static void main(String[] args){
    GestorDatos gestor=new GestorDatos();
    ArrayList<Tour> producto= gestor.cargar("resources/tours.txt");
    for(Tour p: producto){
        System.out.println(p);
    }



}


}