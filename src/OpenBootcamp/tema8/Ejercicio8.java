package OpenBootcamp.tema8;

public class Ejercicio8 {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(22);
        persona.setNombre("Juan");
        persona.setTelefono("1123456879");

        System.out.println(persona.getNombre() + " tiene " + persona.getEdad() + " años y su numero es " + persona.getTelefono());
    }
}
