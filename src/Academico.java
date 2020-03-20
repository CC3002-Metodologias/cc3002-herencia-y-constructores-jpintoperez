public class Academico extends Persona {

    protected String paper;
    public Academico( String name, int age, String newPaper) {
        super( name, "académico", age );
        paper = newPaper;
    }

    public void dormir() { System.out.println("ZzzZzZz"); }

    public String hacerLoSuyo() { return "Vaya, cómo se comparte la pantalla en Zoom? uwu"; }

    public void publicarPaper() { System.out.println("He publicado el paper: "+ paper ); }

    // public void comer() { System.out.println("Ñom Ñom, completos de gorbea") }
    // No necesito modificarla porque ya está bien en la persona al heredar.

}
