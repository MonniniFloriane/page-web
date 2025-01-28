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

        String head =
                "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <title>Bootstrap demo</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n" +
                "  </head>\n" +
                "<body>\n";

        String fermeture =
                    "</footer>\n" +
                        "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\n" +
                    "</body>\n" +
                "</html>";
        return head + html.toString() + fermeture;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

        List<Element> elements = new ArrayList<>();

        //TITRE
        elements.add(new Header("<header>\n"));
        elements.add(new Title(1, "MA PAGE WEB"));
        //PARAGRAPHE
        elements.add(new Paragraf("Mise en pratique des concepts objets et des outils de conception avancés offert par le framework Java + Java Spring pour la création d'un paint distribué"));
        //IMAGE
        elements.add(new Corp("</header>\n", "<main>\n"));
        elements.add(new Image("https://picsum.photos/800/300", "image ramdom"));
        //PARAGRAPHE 2
        elements.add(new Paragraf("Mise en pratique des concepts objets et des outils de conception avancés offert par le framework Java + Java Spring pour la création d'un paint distribué"));
        //TITRE 2
        elements.add(new Footer("</main>\n", "<footer>\n"));
        elements.add(new Title(5, "EN SAVOIR PLUS"));
        //LINK
        elements.add(new Link("https://github.com/florentBourgeois", "Lien par défault"));

        Page page = new Page(elements);
        System.out.println(page.toHTML());
        UtilsHTML.writeHTMLToIndex(page.toHTML());
    }
}
