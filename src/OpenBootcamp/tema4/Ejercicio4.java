package OpenBootcamp.tema4;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numeroIf = 2;

        if(numeroIf == 0) {
            System.out.println("El numero es igual a 0");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        int doWhile = 0;

        do {
            System.out.println(doWhile);
        } while (numeroWhile > 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor+=1){
            System.out.println(numeroFor);
        }

        String estacion = "verano";

        switch (estacion){

            case "invierno":
                System.out.println("la estacion es invierno");
                break;
            case "verano":
                System.out.println("la estacion es verano");
                break;
            case "otoño":
                System.out.println("la estacion es otoño");
                break;
            case "primavera":
                System.out.println("la estacion es primavera");
                break;
            default:
                System.out.println("ingreso no valido");
        }
    }
}
