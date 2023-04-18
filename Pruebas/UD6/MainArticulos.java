package Pruebas.UD6;

public class MainArticulos {
    
    public static void main(String [] args) {
        
        Articulo a1 = new Articulo("TV", 300.0, 21, 3);
        Articulo a2 = new Articulo("GAFAS", 27.0, 21, 7);
        Articulo a3 = new Articulo("RELOJ", 50.0, 21, 10);

        System.out.println(a1);

        a1.vender(5);
    }
}
