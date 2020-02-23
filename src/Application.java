public class Application {
    public static double sqr(double arg){
        throw new RuntimeException();
    }

    public static int area(int width, int height){
        if (width<0 || height<0){
            throw new IllegalArgumentException("Negative sizes: w = "+width+" h = "+height);
        }
        return width*height;
    }
}
