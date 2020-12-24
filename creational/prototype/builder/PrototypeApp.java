package prototype.builder;

public class PrototypeApp {
    public static void main(String[] args) {
        Volkswagen volkswagen = new Volkswagen("100");
        Volkswagen volkswagen1 = (Volkswagen) volkswagen.copy();

    }
}
