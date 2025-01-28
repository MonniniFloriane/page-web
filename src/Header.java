public class Header implements Element {
    private String header = "<header>\n";

    public Header() {}

    public Header(String header) {
        this.header = header;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return this.header;
    }
}
