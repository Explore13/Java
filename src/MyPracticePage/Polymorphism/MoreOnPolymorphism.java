package MyPracticePage.Polymorphism;

class Airport
{
    public void display(Parent ref)
    {
        ref.display();
    }
}
public class MoreOnPolymorphism {
    public static void main(String[] args) {

        Child_1 ch1 = new Child_1();
        Child_2 ch2 = new Child_2();

        Airport airport = new Airport();
        airport.display(ch1);
        airport.display(ch2);

    }
}
