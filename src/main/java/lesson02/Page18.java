package lesson02;

public class Page18
{
    public static void main(String[] args)
    {
        char status = 'N';
        //char status = 'S';
        //char status = 'D';
        //char status = 'E';
        //char status = 'X';

        double cost = 10;
        double price = switch (status) {
            case 'S', 'N' -> cost += 1;
            case 'D' -> {
                double discount = cost*0.2;
                cost -= discount;
                yield cost;
            }
            case 'E' -> 0;
            default -> 3;
        };
        System.out.println("Price is " + price);
    }
}
