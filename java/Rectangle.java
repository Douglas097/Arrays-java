public class Rectangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width ;
        this.height = height;
    }
    public int calculateArea() {
return width * height;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        int area = rectangle.calculateArea();
        System.out.println("Area do retangulo: " + area);
    }
}