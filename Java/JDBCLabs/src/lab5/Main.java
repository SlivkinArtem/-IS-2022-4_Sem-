package lab5;

public class Main {
    public static void main(String[] args) {

        var arr = ProductDB.findAll();
        for (Product p: arr) {
            System.out.println(p.getId() + ". " + p.getName() + " " + p.getPrice());
        }
    }
}
