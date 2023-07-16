package MyPracticePage.Encapsulation.Product;
/*
Create a class called `Product` with private instance variables `name`, `price`, and `quantity`.
Implement a constructor for `name`, `price`, and `quantity`. Include a method called `calculateTotalPrice()` that
 calculates and returns the total price of the product(s) based on the quantity and price.
 */
class Product{
    private String name;
    private double price;
    private double quantity;

    public Product(String name,double price,double quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getQuantity() {
        return quantity;
    }



    public  double calcTotalPrice(){
        return quantity*price;
    }
}
public class priceChecking {
    public static void main(String[] args) {
        Product pdt=new Product("Coffee",50,0.1);
        System.out.println("Product Details : "+pdt.getName()+" "+pdt.getPrice()+" "+pdt.getQuantity()+" "+pdt.calcTotalPrice());
    }
}
