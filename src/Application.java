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

    public static void test1(){
        try{
            System.err.print(" 0");
            if(true){throw new RuntimeException();}
            System.err.print(" 1");
        }catch(Exception e){
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }

    public static void test2(){
        try{
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }
    public static void test3(){
        try{
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
}
