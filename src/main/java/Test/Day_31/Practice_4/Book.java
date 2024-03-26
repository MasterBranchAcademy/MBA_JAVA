package Test.Day_31.Practice_4;

public class Book {

    String kitapIsmi;
    int yayinTarihi;
    String yazar;
    double fiyat;
    int sayfaSayisi;
    String QR;

    public Book(String kitapIsmi, int yayinTarihi, String yazar, double fiyat, int sayfaSayisi, String QR) {
        this.kitapIsmi = kitapIsmi;
        this.yayinTarihi = yayinTarihi;
        this.yazar = yazar;
        this.fiyat = fiyat;
        this.sayfaSayisi = sayfaSayisi;
        this.QR = QR;
    }


    @Override
    public String toString() {
        return "Book{" +
                "kitapIsmi='" + kitapIsmi + '\'' +
                ", yayinTarihi=" + yayinTarihi +
                ", yazar='" + yazar + '\'' +
                ", fiyat=" + fiyat +
                ", sayfaSayisi=" + sayfaSayisi +
                ", QR='" + QR + '\'' +
                '}';
    }
}
