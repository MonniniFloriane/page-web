public class Image implements Element {
    private String src = "https://picsum.photos/800/300";
    private String alt = "image ramdom";


    public Image() {}

    public Image(String src, String alt) {
        this.src = src;
        this.alt = alt;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String toHTML() {
        return "<img src=\"" + this.src + "\"" + " alt=\"" + this.alt + "\"/>";
    }

    public static void main(String[] args) {
        Image i = new Image();

        System.out.println(i.toHTML());
        UtilsHTML.writeHTMLToIndex(i.toHTML());
    }
}
