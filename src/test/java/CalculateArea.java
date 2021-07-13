public class CalculateArea {
    //Square
    int edge;
    public static void main(String[] args) {
        int edge =3;
        int width=5, height=6;
        System.out.println(calculateArea(edge));
        System.out.println(calculateParemeter(edge));
        System.out.println(calculateAreaOfCircle(edge));
        System.out.println(calculateParemetrOfCircle(edge));
        System.out.println(calculateAreaOfRectangle(width, height));
        System.out.println(calculateParameterOfRectangle(width, height));
    }
    public static int calculateArea(int edge){

        return edge *edge;
    }
    public static int calculateParemeter(int edge){
        return edge * 4;
    }
    //Circle
    int radius;
    public CalculateArea(int radius){
        this.radius=radius;
    }
    public static double calculateAreaOfCircle(double radius){

        return (radius*radius)*Math.PI;
    }
    public static double calculateParemetrOfCircle(double radius){
        return (radius * 2)*Math.PI;
    }
    //Rectangle
    int width, height;
    public CalculateArea(int width,int height){
        this. width= width;
        this.height= height;
    }
    public static int calculateAreaOfRectangle(int width,int height){
        return width * height;
    }
    public static int calculateParameterOfRectangle( int width, int height){
        return (width+height)*2;
    }
}
