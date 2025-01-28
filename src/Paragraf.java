public class Paragraf implements Element {
    private String text = "";

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
