
package juegosumas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Clase principal en la que se ejecuta el Juego de 
 * Acierta La Suma, en ella se pedira un numero que debera
 * ser el resultado de la suma de dos numeros mostrados
 * que se generan de manera aleatoria. Una vez finaliza el tiempo
 * se muestran los resultados obtenidos.
 * 
 * @author diego
 */
public class JuegoSumasApp {

    /**
     * Metodo main que ejecuta Acierta La Suma
     * 
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.lang.InterruptedException
     * 
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
        //Atributos
        MetodosAciertaSumas mas = new MetodosAciertaSumas();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String lectura;
        
        //Prints para dar la bienvenida al usuario
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t++++++++++++BIENVENIDO AL JUEGO DE ACIERTA SUMAS++++++++++++");
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
        //Bucle que estara ejecutandose mientras el tiempo no se acabe
        do {
            
            //Llamada al metodo de cuenta atras 
            //y a generar un numero aleatorio
            mas.reloj();
            mas.setNum1(mas.obtenerAleatorio1());
            mas.setNum2(mas.obtenerAleatorio1());
            //Mostramos por pantalla los dos numeros que el usuario debe sumar
            System.out.println("\tNUMERO 1:  " + mas.getNum1());
            System.out.println("\t          +");
            System.out.println("\tNUMERO 2:  " + mas.getNum2());
            System.out.println("\t          -----");
            
            //Bucle que pedira un resultado mientras el campo 
            //este vacio o no sea numerico
            do {
                
                System.out.print("\tRESULTADO: ");
                lectura = teclado.readLine();
                
            } while (lectura.isEmpty() || !mas.isNumeric(lectura));
            
            //Guardamos el valor introducido por el usuario en la variable
            mas.setValor(Integer.parseInt(lectura));
            //Llamada al metodo que nos comparara el resultado del usuario
            //con el resultado real
            mas.comparar();
            
            System.out.println("");
            
        } while (mas.comprobarReloj());
        
        //Prints para hacer mas bonito el final del programa
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t+++++++++++++++++++++++FIN DEL JUEGO++++++++++++++++++++++++");
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t++++++++++++++++++++ MOSTRANDO RESULTADOS...");
        
        //Llamada al metodo que imprime los resultados del usuario por pantalla
        mas.mostrarResultados();
    }
    
}
