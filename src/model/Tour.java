package model;

/**
 * Esta clase representa el tour con su precio, nombre y tipo
 * de la empresa LlanquihueTour
 *
 *
 */

public class Tour {
   private String tour;
   private String tipo;
   private double precio;

   public Tour() {
   }

   /**
    *
    * @param tour representa el nombre del tour
    * @param tipo representa el tipo, si es cultural, aventura etc.
    * @param precio el precio del tour por persona.
    */
   public Tour(String tour, String tipo, double precio) {
      this.tour = tour;
      this.tipo = tipo;
      this.precio = precio;
   }

   public String getTour() {
      return tour;
   }

   public void setTour(String tour) {
      this.tour = tour;
   }

   public String getTipo() {
      return tipo;
   }

   public void setTipo(String tipo) {
      this.tipo = tipo;
   }

   public double getPrecio() {
      return precio;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   @Override
   public String toString() {
      return "Tour{" +
              "tour='" + tour + '\'' +
              ", tipo='" + tipo + '\'' +
              ", precio=" + precio +
              '}';
   }
}
