public class Main {
    public static void main(String[] args) {

        FormaManager fm = new FormaManager();

        fm.addForma("Vermelho", "0.2", 10);
        fm.addForma("Azul", "0.2", 10);
        fm.addForma("Verde", "0.2", 10);
        fm.addForma("Amarelo", "0.2", 10);

        fm.apresentar();

    }
}
