import java.sql.Array;
import java.util.Scanner;

public class Soal3 {

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static boolean isOverLimit(int[] arr){
        return (arr[0] < 1 || arr[1] < 1) || (arr[0] > 1000 || arr[1] > 1000);
    }

    public static void main(String[] args) {
        int[] arrInput;
        int c=0;
        int i=0;
        arrInput = new int[50];
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] stringSlpit = s.split(" ");

        if(s.indexOf('+')>-1){
            for (String a : stringSlpit){
                if(isNumeric(a)){
                    c = Integer.parseInt(a);
                    arrInput[i]=c;
                    i++;
                }
            }
            if(isOverLimit(arrInput)){
                System.out.println("Angka yang anda inputkan melebihi batas!");
                System.exit(-1);
            }
            System.out.println(arrInput[0] + arrInput[1]);
        }else if(s.indexOf('-')>-1){
            for (String a : stringSlpit){
                if(isNumeric(a)){
                    c = Integer.parseInt(a);
                    arrInput[i]=c;
                    i++;
                }
            }
            if(isOverLimit(arrInput)){
                System.out.println("Angka yang anda inputkan melebihi batas!");
                System.exit(-1);
            }
            System.out.println(arrInput[0] - arrInput[1]);
        }else if(s.indexOf('*')>-1){
            for (String a : stringSlpit){
                if(isNumeric(a)){
                    c = Integer.parseInt(a);
                    arrInput[i]=c;
                    i++;
                }
            }
            if(isOverLimit(arrInput)){
                System.out.println("Angka yang anda inputkan melebihi batas!");
                System.exit(-1);
            }
            System.out.println(arrInput[0] * arrInput[1]);
        }else if(s.indexOf('/')>-1){
            for (String a : stringSlpit){
                if(isNumeric(a)){
                    c = Integer.parseInt(a);
                    arrInput[i]=c;
                    i++;
                }
            }
            if(isOverLimit(arrInput)){
                System.out.println("Angka yang anda inputkan melebihi batas!");
                System.exit(-1);
            }
            System.out.println(arrInput[0] / arrInput[1]);
        }else if(s.indexOf('%')>-1){
            for (String a : stringSlpit){
                if(isNumeric(a)){
                    c = Integer.parseInt(a);
                    arrInput[i]=c;
                    i++;
                }
            }
            if(isOverLimit(arrInput)){
                System.out.println("Angka yang anda inputkan melebihi batas!");
                System.exit(-1);
            }
            System.out.println(arrInput[0] % arrInput[1]);
        }
    }
}
