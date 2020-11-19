
package pkgdouble.pkgfloat;


public class DoubleFloat {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*
        Double veri tipi bellekte 64 bitlik 8 byte yer kaplıyor
        Float ise bellekte 32 bitlik 4 byte yer kaplıyor
        Double veri tipinde daha büyük kesinlikle ondalıklı sayılarımızı saklayabiliyoruz.
        
        
        */
        
        
        
        double a = 5.25;
        double b = 4.0;
        double c = 4d;
        double d = 4.23d;
        
        
        //float e = 5.0 hatalı bir gösterim burada JAVA otomatik dönüştürme işlemini kendisi yapamıyor.
        float e = 5.0f;
        float f = (float)5.5;//bu şekilde dönüştürme işlemini biz kendimiz yapıyoruz.
        float jas = 5.2f;
        /*
        float ile dönüştüme ek işlemler gerektirdiği içn genellikle yüksek kesnlik gerektiren durumlar için Double tercih edilir.
        
        */
        int ax = 22/7;
        float bx = 22f/7f;
        double cx = 22d/7d;
        System.out.println("ax(integer) değerimiz = "+ax);
        System.out.println("bx(float) değerimiz = " +bx);
        System.out.println("cx(double) değerimiz = "+cx);
        //bu yapılar arasındaki en net fark hassasiyet(kesinlik)
        /*
        OTOMATİK DÖNÜŞTÜME İÇİN JAVANIN İZLEDİĞİ YOL = 
        int -->float --> double
        int bir değer ile float bir değeri topladığınızda sonuç float olarak görünür.
        
        */
        int i = 5;
        float j = i;
        //burada sıkıntı çıkmadı çünkü java dönüşümü kendisi gerçekleştirebiliyor.
        double ix = 5.25;
        //float jx = ix; burada java dönüştürmeyi gerçekleştiremiyor çünkü kendi algoritmasına aykırı burada işlemi bizim yapmamız gerekiyor.
        
        float jx = (float)ix;
        //hata bu şekilde çözüldü(bu bir hata değil bir algoritma tercihidir.Sebebi alt satırda bulunmaktadır.)
        //Double verileri float yada int değerlere dönüştürürken veri kayıpları yaşandığı içni java bu verileri kaybetme tercihini programcıya bırakıyor.
        
        
        double sayi1 = 70.58;
        double sayi2 = 60d;
        double sayi3 = 80.855;
        System.out.println("sayi1 sayi2 ve sayi3 değerlerimizin ortalaması = " +(sayi1+sayi2+sayi3)/3);
        //sonuc yine double olarak geldi...
        float sayi_bir = 70.58f;
        float sayi_iki = 60f;
        float sayi_uc = 80.855f; 
        System.out.println("float ifalederimizin ortalaması = " +(sayi_bir+sayi_iki+sayi_uc)/3);
        //sonuç float olarak karşımıza çıktı
        
        






    }
    
}
