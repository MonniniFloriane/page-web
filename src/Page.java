import java.util.ArrayList;
import java.util.List;

public class Page {
    private List<Element> element = new ArrayList<>();

    public Page() {}

    public Page(Element element) {
        this.element.add(element);
    }

    public Page(List<Element> element) {
        this.element = element;
    }

    public void add(Element element) {
        this.element.add(element);
    }

    public String toHTML() {
        StringBuilder html = new StringBuilder();

        for (Element element : element) {
            html.append("\n\t").append(element.toHTML());
        }

        String header = "<body>";
        String footer = "</body>";
        return header + html.toString() + footer;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        List<Element> elements = new ArrayList<>();
        //TITRE
        elements.add(new Title(1, "MA PAGE WEB"));
        //PARAGRAPHE
        elements.add(new Paragraf("Mise en pratique des concepts objets et des outils de conception avancés offert par le framework Java + Java Spring pour la création d'un paint distribué"));
        //IMAGE
        elements.add(new Image("https://picsum.photos/800/300", "image ramdom"));
        //PARAGRAPHE 2
        elements.add(new Paragraf("Mise en pratique des concepts objets et des outils de conception avancés offert par le framework Java + Java Spring pour la création d'un paint distribué"));
        //TITRE 2
        elements.add(new Title(2, "EN SAVOIR PLUS"));
        //LINK
        elements.add(new Link("https://github.com/florentBourgeois", "Lien par défault"));

        Page page = new Page(elements);
    }
}
