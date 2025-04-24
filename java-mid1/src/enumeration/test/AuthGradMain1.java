package enumeration.test;


public class AuthGradMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();

        for (AuthGrade value : values) {
            printAuthGrade(value);
        }
    }

    private static void printAuthGrade(AuthGrade grade){
        System.out.println("grade= " + grade.name() + ", level= " + grade.getLevel() + ", 설명= " + grade.getDescription());
    }
}
