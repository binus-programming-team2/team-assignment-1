import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat siang...");
        System.out.printf("%-25s : ", "Pesan untuk berapa orang");
        int person = input.nextInt();
        input.nextLine();
        System.out.printf("%-25s : ", "Pesan atas nama");
        String name = input.nextLine();

        Menu m = new Menu();
        m.show();

        Order o = new Order(name, person);
        o.writeOrder(input);
    }
}