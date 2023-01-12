package OpenBootcamp;

public class Main {
    public static void main(String[] args) {
        //Ejercicio tema 3
        int respuesta = valoresSumados(1,2,3);


        Coche miCoche = new Coche(4);
        miCoche.incrementarPuertas();
        System.out.println("tenes " + miCoche.doors + " puertas");

    }

    static int valoresSumados(int a,int b,int c){
        int resultado = a + b + c;
        return resultado;
    }
}
