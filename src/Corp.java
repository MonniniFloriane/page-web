public class Corp implements Element {
    private String header = "</header>\n";
    private String main   = "<main>\n";

    public Corp() {}

    public Corp(String header, String main) {
        this.header = header;
        this.main   = main;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return this.header + this.main;
    }
}
