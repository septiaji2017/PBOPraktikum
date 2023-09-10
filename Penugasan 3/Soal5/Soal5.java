import java.math.BigInteger;
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        long hasil,penampung;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String stringDel = s.replace(" ", "");
        penampung = Long.parseLong(stringDel);
        hasil = penampung - 999999;
        if (hasil % 5 == 0){
            System.out.println("Berhenti");
        }else {
            System.out.println("Jalan");
        }
    }
}
