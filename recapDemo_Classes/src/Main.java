public class Main {

    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int sonuc1 = dortIslem.topla(4, 2);
        int sonuc2 = dortIslem.carp(6, 5);
        int sonuc3 = dortIslem.cikar(9, 5);
        int sonuc4 = dortIslem.bol(12, 2);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
    }
}
