package method;

public class MethodEx1 {
    public static void main(String[] args) {
/*        int a = 1;
        int b = 2;
        int c = 3;*/
        System.out.println("평균값: " + average(1, 2, 3));

/*        int x = 15;
        int y = 25;
        int z = 35;*/
        System.out.println("평균값: " + average(15, 25, 35));
    }
    public static double average(int a, int b, int c){
        return (double) (a+b+c)/3;
    }
}
