import java.util.Scanner;

public class Soal4 {

    public static double hitungBonusPenjualan(double perc, double totalPenjualan){
        return (perc/100.0)*totalPenjualan;
    }

    public static double hitungTotalPenjumlahan(double hi, double bi){
        return hi*bi;
    }

    public static void main(String[] args) {
        double bonusPenjualan, totalPenjualan, gajiTotal, denda=0, banyakItem;
        final double hargaItem = 50000.0;
        final double gajiPokok = 500000.0;
        Scanner sc = new Scanner(System.in);
        banyakItem = sc.nextDouble();
        totalPenjualan = hitungTotalPenjumlahan(hargaItem, banyakItem);

        if(banyakItem > 80){
            bonusPenjualan = hitungBonusPenjualan(35.0,totalPenjualan);
            gajiTotal = gajiPokok + bonusPenjualan;
            System.out.println(gajiTotal);
        } else if (banyakItem >= 40) {
            bonusPenjualan = hitungBonusPenjualan(25.0,totalPenjualan);
            gajiTotal = gajiPokok + bonusPenjualan;
            System.out.println(gajiTotal);
        } else if (banyakItem < 15) {
            denda = hitungBonusPenjualan(15.0,hargaItem);
            double kaliDenda = 15-banyakItem;
            gajiTotal = gajiPokok - (denda*kaliDenda);
            System.out.println(gajiTotal);
        }else{
            bonusPenjualan = hitungBonusPenjualan(10.0,totalPenjualan);
            gajiTotal = gajiPokok + bonusPenjualan;
            System.out.println(gajiTotal);
        }
    }




}
