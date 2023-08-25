public class Soal1 {
    public static void main (String args[]){
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2); // harus di casting terlebih dahulu, karena angka1 + angka2 itu termasuk operasi integer
        System.out.println("Hasil 1 "+hasil); // hasilnya -125, karena ukuran / range dari byte: -128 to 127
        //Konsepnya mirip dengan garis bilangan,
        //Selisih dari hasil penjumlahan dan batasan akhir byte, lalu hasilnya dihitung dari -128.
    }
}
