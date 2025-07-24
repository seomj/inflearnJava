package generic.test.ex2;

public class Test {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int num = 1;
        int row = 5;

        for (int i=0; i < row; i++){
            for (int j=0; j < row; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println("\n");
        }

    }
}
