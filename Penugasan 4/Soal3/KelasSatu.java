public class KelasSatu {
    { // setiap instance baru, dibuat sebelum constructor KelasSatu dipanggil (IIB)
        System.out.println(11);
    }
    static //static itu selalu muncul setiap class itu di run, hanya sekali saja, walau dipanggil objek berkali kali, agar efisiensi saja (Static init)
    {
        System.out.println(2);
    }
    public KelasSatu(int i) // karena ada parameter, yg dipanggil ini
    {
        System.out.println(3);
    }
    public KelasSatu() //krn gk ada parameter, yg dipanggil ini
    {
        System.out.println(4);
    }
}
