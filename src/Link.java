public class Link implements Element {
    private String url  = "https://github.com/florentBourgeois";
    private String text = "Lien par défault";

    public Link() {}

    public Link(String url, String text) {
        this.url   = url;
        this.text  = text;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return "<a href=\"" + this.url + "\">" + this.text + "</a>";
    }
}
