public class Persona {

    public Persona( String name, String occupation, int age) {
        nombre = name;
        ocupacion = occupation;
        edad = age;
    }

    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "Estoy en cuarentena uwu";
    }
}
