public class Menu {
    final private double priceFriedRice = 9999.99;
    final private double priceChicken = 12345.67;
    final private double priceSteak = 21108.40;
    final private double priceKwetiaw = 13579.13;
    final private double priceGoat = 98765.43;

    public void show() {
        System.out.println("\nMenu Spesial hari ini");
        System.out.println("=====================\n");
        System.out.printf("\t%-30s @ Rp. %8.2f%n", "1. Nasi Goreng Spesial", this.priceFriedRice);
        System.out.printf("\t%-30s @ Rp. %8.2f%n", "2. Ayam Bakar Spesial", this.priceChicken);
        System.out.printf("\t%-30s @ Rp. %8.2f%n", "3. Steak Sirloin Spesial", this.priceSteak);
        System.out.printf("\t%-30s @ Rp. %8.2f%n", "4. Kwetiaw Siram Spesial", this.priceKwetiaw);
        System.out.printf("\t%-30s @ Rp. %8.2f%n", "5. Kambing Guling Spesial", this.priceGoat);
    }

    public double getPriceFriedRice() {
        return priceFriedRice;
    }

    public double getPriceChicken() {
        return priceChicken;
    }

    public double getPriceSteak() {
        return priceSteak;
    }

    public double getPriceKwetiaw() {
        return priceKwetiaw;
    }

    public double getPriceGoat() {
        return priceGoat;
    }
}
