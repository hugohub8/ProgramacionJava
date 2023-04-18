package Pruebas.UD6;

public class Articulo {
    
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){

        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio <= 0){

            System.out.println("Este precio no puede ser negativo");
        }
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public String toString(){

        return ("Nombre: " + nombre + " ,Precio: " + precio + " ,Cuantos quedan: " + cuantosQuedan);
    }

    public void vender(int cuantosVender){

        if(cuantosVender <= cuantosQuedan){
        cuantosQuedan -= cuantosVender;
            System.out.println("Se han vendido. Salen del almacén");
        }
        else
        System.out.println("ERROR: No se pueden vender. No quedan tantos!");
    }
    

}
