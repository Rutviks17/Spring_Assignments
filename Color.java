package Classes;

public class Color {
    private String base_color;
    private String texture_color;

    public String getBase_color() {
        return base_color;
    }

    public void setBase_color(String base_color) {
        this.base_color = base_color;
    }

    public String getTexture_color() {
        return texture_color;
    }

    public void setTexture_color(String texture_color) {
        this.texture_color = texture_color;
    }

    @Override
    public String toString() { return "BaseColor : " + getBase_color() + "\nTextureColor : " + getTexture_color();}
}
