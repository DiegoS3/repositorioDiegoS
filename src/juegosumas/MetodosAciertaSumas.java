package juegosumas;

/**
 *
 * Clase que contiene todos los metodos que usaremos para las diferentes
 * acciones necesarias para que el Juego funcione de manera adecuada
 * 
 * @author diego
 * 
 */
public class MetodosAciertaSumas {
    
    //Atributos
    private int num1, num2, valor, intentos, aciertos, fallos, tiempo = 60;
    
    //Constructores
    public MetodosAciertaSumas() {
    }
    
    //Getters & Setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * 
     * Metodo que obtiene un numero aleatorio entre 1 y 999
     * 
     * @return un int obtenido de manera aleatoria
     * 
     */    
    public int obtenerAleatorio1(){
        
        return (int)(Math.random()*1000);
        
    }   
    
    /**
     * 
     * Metodo que obtiene el resultado real de la suma de los dos numeros
     * obtenidos de manera aleatoria
     * 
     * @return un int que es la suma real de ambos numeros
     */
    public int sumar(){
        
        return num1 + num2;
    }
    
    /**
     * 
     * Metodo que compara si la suma real es la misma que ha introducido
     * por consola el usuario de la aplicacion e incrementa tanto si es como si 
     * no es el numero de intentos.
     * 
     * En caso de ser el mismo numero el del usuario que el de la suma real
     * incrementa los aciertos, en caso de no serlo los fallos
     * 
     */
    public void comparar(){
        
        if (sumar() == valor) {
            
            intentos +=1;
            aciertos +=1;                    
            
        } else {
            
            intentos +=1;
            fallos +=1; 
        }
                
    }
    
    /**
     * 
     * Metodo que se comporta como un cronometro reduciendo el valor del tiempo
     * por defecto que es 60 en 1 cada 1000 milisegundos = 1 segundo
     * 
     * @return un int correspondiente al valor de la variable tiempo
     * 
     * @throws InterruptedException 
     * 
     */    
    public int reloj() throws InterruptedException{
        
        Thread.sleep(1000);
        return tiempo--;
        
    }
    
    /**
     * 
     * Metodo que comprueba si el tiempo es mayor o igual que 0 
     * 
     * En caso de ser mayor que 0 devolvera true y el programa seguira funcionando
     * en caso contrario devolvera false y el programa se parara
     * 
     * @return boolean false -> tiempo = 0; true -> tiempo > 0
     * 
     */
    public boolean comprobarReloj(){
        
        if (tiempo > 0) {
            
            return true;
            
        }else{
            
            return false;
            
        }
        
    }
    
    /**
     * 
     * Metodo que comprueba si un String contiene un valor numerico
     * 
     * @param cadena String que introduce el usuario por consola
     * 
     * @return boolean true si el valor es numerico; false si no lo es
     * 
     */
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    /**
     * 
     * Metodo que muestra los resultados del usuario por consola pasados 2 segundos
     * una vez finalizado el tiempo que tiene el usuario para acertar sumas
     * 
     * @throws InterruptedException 
     * 
     */
    public void mostrarResultados() throws InterruptedException {
        
        Thread.sleep(2000);
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t+++++++++++++++HAS REALIZADO " + intentos + " INTENTOS+++++++++++++++++++++");
        System.out.println("\t+++++++++++++++HAS REALIZADO " + aciertos  + " ACIERTOS+++++++++++++++++++++");
        System.out.println("\t+++++++++++++++Y UNA CANTIDAD DE " + fallos + " FALLOS+++++++++++++++++++");
        System.out.println("\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
    }
    
    

}
