import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[];
        int x[];
        s1 = new String[50];
        x = new int[50];

        for(int i=0;i<3;i++){
            s1[i]=sc.next();
            x[i]=sc.nextInt();
        }

        System.out.println("================================");
        for(int i=0;i<3;i++){
            System.out.printf("%-15s%03d\n", s1[i], x[i]);
        }
        System.out.println("================================");

    }
}
