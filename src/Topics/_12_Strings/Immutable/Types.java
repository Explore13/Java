package Topics._12_Strings.Immutable;

public class Types {
    // Welcome to Explorer's JDK
        public static void main(String[] args) {
            /* String is Immutable and StringBuilder or StringBuffer are Mutable */
            String brand="PwSkills";
            System.out.println(brand);
            brand.concat("Bengaluru");
            System.out.println(brand);

            StringBuilder brand1= new StringBuilder("PWSkills");
            System.out.println(brand1);
            brand1.append("Bengaluru");
            System.out.println(brand1);

        }

}
