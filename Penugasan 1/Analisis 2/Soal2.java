public class Soal2 {
    public static void main(String[] args){
        int i = 42;
        String s = (i < 40)?"life":(i>50)?"universe":"everything"; //menggunakan operasi ternary
        System.out.println(s);
        //-	apabila i nya kurang dari 40, hasil nya life
        //-	apabila i nya lebih dari 50, hasilnya universe
        //-	apabila i nya lebih dari 40 dan kurang dari 50, maka hasilnya everything
        //-	karena variable i bernilai 42, maka hasilnya everything
    }
}
