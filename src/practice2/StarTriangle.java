package practice2;

public class StarTriangle {
    private int width;

    public StarTriangle() {
    }

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < width; i++) {
            String block = "[" + "*" + "]";
            result += block.repeat(i + 1);
            result += "\n";
        }
        return result;
    }
}
