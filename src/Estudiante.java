public class Estudiante extends Persona {

    public Estudiante(String name, int age) {
        super(name, "estudiante", age );
    }

    public void comer() { System.out.println("Ñom Ñom, completos de gorbea"); };

    public void dormir() { System.out.println("ZzzZzZ"); }

    public String hacerLoSuyo() { return "Oh está de pana el capítulo de BEASTARS!!"; }

}
