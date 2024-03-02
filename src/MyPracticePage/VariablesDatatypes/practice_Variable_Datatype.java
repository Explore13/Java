package MyPracticePage.VariablesDatatypes;

import java.sql.SQLOutput;

public class practice_Variable_Datatype {
    public static void main(String[] args) {


        // Primitive DataTypes
        int age = 19;
        boolean student = true;
        String name = "Surya";
        double money = 100.50;
        long collegeRoll = 14800322049L;

        System.out.println(name+"\n"+age+"\n"+student+"\n"+money+"\n"+collegeRoll);

        // Typecasting

        double age_2 = age; // Implicit Typecasting
        System.out.println(age_2);

        double var = 12.56;
        int var2 = (int) var;
        System.out.println(var2);
    }
}
