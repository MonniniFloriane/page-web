public class Link implements Element {
    private String url  = "";
    private String text = "";

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
