public class Rectangle {

    int length;
    int width;

    public void surfaceAreaCalc (int width,int  length) {
        int surfaceArea = width * length;
        System.out.println("Surface area is " + surfaceArea);
    }

    public Rectangle () {
        length = 0;
        width = 0;
    }

    public Rectangle (int l, int w) {
        length = l;
        width = w;
    }

    public Rectangle (int side) {
        length = side;
        width = side;
    }

    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5, 10);
        Rectangle rectangle3 = new Rectangle(4);

        rectangle1.surfaceAreaCalc(rectangle1.width, rectangle1.length);
        rectangle2.surfaceAreaCalc(rectangle2.width, rectangle2.length);
        rectangle3.surfaceAreaCalc(rectangle3.width, rectangle3.length);


    }
}
