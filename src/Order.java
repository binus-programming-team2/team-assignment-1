import java.util.Scanner;

public class Order {
    String name;
    int person;

    private int friedRice, chicken, steak, kwetiaw, goat;

    public Order(String name, int person) {
        this.name = name;
        this.person = person;
    }

    public void writeOrder(Scanner input) {
        System.out.println("\nPesanan Anda [Batas 0-10 point]");
        do {
            System.out.printf("%-30s = ", "1. Nasi Goreng Spesial");
            this.friedRice = input.nextInt();
        } while (this.friedRice < 0 || this.friedRice > 10);

        do {
            System.out.printf("%-30s = ", "2. Ayam Bakar Spesial");
            this.chicken = input.nextInt();
        } while (this.chicken < 1 || this.chicken > 10);

        do {
            System.out.printf("%-30s = ", "3. Steak Sirloin Spesial");
            this.steak = input.nextInt();
        } while (this.steak < 1 || this.steak > 10);

        do {
            System.out.printf("%-30s = ", "4. Kwetiaw Siram Spesial");
            this.kwetiaw = input.nextInt();
        } while (this.kwetiaw < 1 || this.kwetiaw > 10);

        do {
            System.out.printf("%-30s = ", "5. Kambing Guling Spesial");
            this.goat = input.nextInt();
        } while (this.goat < 1 || this.goat > 10);

        System.out.println("\nSelamat menikmati makanan anda...");

        summary();
    }

    private void summary() {
        Menu m = new Menu();

        System.out.println("\nPembelian :");
        System.out.printf("%-25s %5d porsi * Rp. %8.2f = Rp. %12.2f  %n", "1. Nasi Goreng Spesial", friedRice, m.getPriceFriedRice(), friedRice * m.getPriceFriedRice());
        System.out.printf("%-25s %5d porsi * Rp. %8.2f = Rp. %12.2f  %n", "2. Ayam Bakar Spesial", chicken, m.getPriceChicken(), chicken * m.getPriceChicken());
        System.out.printf("%-25s %5d porsi * Rp. %8.2f = Rp. %12.2f  %n", "3. Steak Sirloin Spesial", steak, m.getPriceSteak(), steak * m.getPriceSteak());
        System.out.printf("%-25s %5d porsi * Rp. %8.2f = Rp. %12.2f  %n", "4. Kwetiaw Siram Spesial", kwetiaw, m.getPriceKwetiaw(), kwetiaw * m.getPriceKwetiaw());
        System.out.printf("%-25s %5d porsi * Rp. %8.2f = Rp. %12.2f +%n", "5. Kambing Guling Spesial", goat, m.getPriceGoat(), goat * m.getPriceGoat());
        System.out.println("=========================================================================");
        System.out.printf("%-52s = Rp. %12.2f  %n", "Total Pembelian", calculateTotalOrder());
        System.out.printf("%-52s = Rp. %12.2f -%n", String.format("Disc. 10 %1s (Masa Promosi)", "%"), calculateDiscount());
        System.out.println("=========================================================================");
        double totalOrderr = calculateTotalOrder() - calculateDiscount();
        System.out.printf("%-52s = Rp. %12.2f  %n", String.format("Total Pembelian Setelah Disc 10 %1s", "%"), totalOrderr);
        System.out.printf("%-52s = Rp. %12.2f  %n", String.format("Pembelian per orang (untuk %d orang)", person), totalOrderr / person);

        System.out.printf("%n%s%n", Utils.center("Terima kasih atas kunjungan anda...", 73));
        System.out.printf("%s", Utils.center("...tekan ENTER untuk keluar...", 73));

        Scanner input = new Scanner(System.in);
        input.nextLine();
    }

    private double calculateTotalOrder() {
        Menu m = new Menu();

        double totalFriedRice = friedRice * m.getPriceFriedRice();
        double totalChicken = chicken * m.getPriceChicken();
        double totalSteak = steak * m.getPriceSteak();
        double totalKwetiaw = kwetiaw * m.getPriceKwetiaw();
        double totalGoat = goat * m.getPriceGoat();

        return totalFriedRice + totalChicken + totalSteak + totalKwetiaw + totalGoat;
    }

    private double calculateDiscount() {
        return calculateTotalOrder() * 0.1;
    }
}
