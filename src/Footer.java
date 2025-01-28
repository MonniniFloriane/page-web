import java.io.Serializable;

public class Footer implements Element{
    private String main   = "</main>\n";
    private String footer = "<footer>\n";

    public Footer() {}

    public Footer(String main, String footer) {
        this.main   = main;
        this.footer = footer;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return this.main + this.footer;
    }
}
