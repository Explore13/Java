package Topics._03_Conditionals;

public class Enhanced_SwitchCase {
    // Welcome to Explorer's JDK
    public static void main(String[] args) {
        int num=200;
        switch (num) {
            case 200 -> System.out.println("case1");
            case 100 -> System.out.println("case2");
            case 300 -> System.out.println("case3");
            default -> System.out.println("None");
        }
    }

}
