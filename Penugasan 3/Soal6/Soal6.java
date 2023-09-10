import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.signum;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String angka1 = sc.nextLine();
        String angka2 = sc.nextLine();

        if((angka1.length() > 200) || angka2.length() > 200){
            System.out.println("too many characters!");
            System.exit(-1);
        }

        BigInteger angka1b = new BigInteger(angka1);
        BigInteger angka2b = new BigInteger(angka2);

        int result = angka1b.signum();
        int result2 = angka2b.signum();

        if((result == -1) || (result2 == -1)){
            System.out.println("Cannot operate negative!");
        }else{
            System.out.println(angka1b.add(angka2b));
            System.out.println(angka1b.multiply(angka2b));
        }
    }
}
