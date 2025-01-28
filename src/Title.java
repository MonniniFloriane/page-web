public class Title implements Element {
    private int nivTitle = 1;
    private String titre = "MA PAGE WEB";

    public Title() {}

    public Title(int nivTitle, String titre) {
        this.nivTitle = nivTitle;
        this.titre = titre;
    }

    public String getText() {
        return titre;
    }

    public void setText(String titre) {
        this.titre = titre;
    }

    public int getNivTitle() {
        return nivTitle;
    }

    public void setNivTitle(int nivTitle) {
        this.nivTitle = nivTitle;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return "<h" + this.nivTitle + ">" + this.titre + "</h" + this.nivTitle + ">";
    }
}
