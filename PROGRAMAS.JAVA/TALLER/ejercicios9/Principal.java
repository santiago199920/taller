package ejercicio9;

/**
 *
 * @author SANTIAGO ESPINOSA GARCIA--COD 20201187651
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Coche coche = new Coche();
        Motor motor = new Motor();
        Rueda rueda = new Rueda();
        ventana Ventana = new ventana();
        Puerta puerta = new Puerta();
        
        System.out.println("COCHE \n"+"Motorr: "+coche.motorr+"\nPuertass: "+coche.puertass+"\nRuedass: "+coche.ruedass);
        motor.encender();
                
    }
    
}
