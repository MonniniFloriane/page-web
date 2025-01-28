public class Paragraf implements Element {
    private String text = "Mise en pratique des concepts objets et des outils de conception avancés offert par le framework Java + Java Spring pour la création d'un paint distribué ";

    public Paragraf() {}

    public Paragraf(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return "<p>" + this.text + "</p>";
    }
}
