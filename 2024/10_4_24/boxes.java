public class boxes implements Comparable {
    private int width;
    private int height;
    private int length;
    private String name;
    public boxes(int h, int w, int l, String n) {
        width = w;
        height = h;
        length = l;
        name = n;
    }

    public String toString() { return "A box called "+name+" with the dimensions "+height+" x "+width+" x "+length; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getLength() { return length; }
    public int getArea() { return width*height*length; }
    public String getName() {return name; }
    public int compareTo(Object o) {
        boxes other = (boxes)o;
        return this.getArea()-other.getArea();
    }
}
