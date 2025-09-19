public class Belajar { 
    public static void main(String[] args) {
        int total;
        double diskon;

        total = 25000;
        if (total>10000 && total<=20000) {
            diskon = 0.05 * total;
            System.out.println("diskonnya "+diskon);
        }
        else if (total>20000) {
            diskon = 0.10 * total;
            System.out.println("diskonnya "+diskon);
        }
    }
}
