package edu.akdenizeem.modules.week02.lecture01;

/*----------------------------------------------------------------------------------------------------------------------
    Neden standart metotları kullanmalıyız?
    Java'da standart olarak (JavaSE) bulunan metotların kullanılmasının avantajları:
    - Okunabilir kodlar yazılır.
    - Testleri yapılmıştır ve yeterince etkin olarak yazılmıştır
    - Taşınabilirdir.
    - Özellikle bazı metotlar (ki bunlar yeterince fazladır) başka detay konuları da bilmeyi gerektirir,
    - Programcının projede sadece kendi konusuna odaklanmasını sağlar.

   	Bu durumda bir Java programcısı ihtiyaç duyduğu bir problem JavaSE'de varsa onu kullanmalıdır. Yoksa yazma işlemine
   	girişmelidir. Ancak bu durum programcının bazı problemleri nasıl çözüldüğünü gözardı etmesi anlamına gelmez. Sadece proje
   	içerisinde başka detaylarla uğraşmaması projeyi etkin biçimde geliştirmesi için gerekli olur. Programcı programlama
   	hayatı boyunca bazı hazır olan problemlerin de çözmünü gerçekleştirebilmeyi öğrenmesi gerekir
----------------------------------------------------------------------------------------------------------------------*/

public class Main {
}


/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının abs metotları
----------------------------------------------------------------------------------------------------------------------*/
class DemoAbs {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        System.out.printf("|%d| = %d%n", a, Math.abs(a));
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının sqrt metodu
----------------------------------------------------------------------------------------------------------------------*/
class DemoSqrt {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        double a = Double.parseDouble(kb.nextLine());

        System.out.printf("sqrt(%f) = %f%n", a, Math.sqrt(a));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının sqrt metodu
	Not: sqrt metodu negatif argümanlar için NaN değerine geri döner
----------------------------------------------------------------------------------------------------------------------*/

class DemoSqrtNegative {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        double a = Double.parseDouble(kb.nextLine());

        System.out.printf("sqrt(%f) = %f%n", a, Math.sqrt(a));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının pow metodu
----------------------------------------------------------------------------------------------------------------------*/

class DemoPow {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Tabanı giriniz:");
        double a = Double.parseDouble(kb.nextLine());

        System.out.print("Üssü giriniz:");
        double b = Double.parseDouble(kb.nextLine());

        System.out.printf("pow(%f, %f) = %f%n", a, b, Math.pow(a, b));
    }
}


/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı double türden x1, y1, x2, y2 koordinat bilgilerine göre iki nokta
	arasındaki  ((x1, y1) ve (x2, y2)) uzaklığa geri dönen distance isimli metodu PointUtil isimli sınıf içerisinde
	yazınız	ve klavyeden girilen değerlerle çağırarak test ediniz
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork01 {
    public static void main(String [] args)
    {
        DistanceTest.run();
    }
    class DistanceTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("x1?:");
            double x1 = Double.parseDouble(kb.nextLine());

            System.out.print("y1?:");
            double y1 = Double.parseDouble(kb.nextLine());

            System.out.print("x2?:");
            double x2 = Double.parseDouble(kb.nextLine());

            System.out.print("y2?:");
            double y2 = Double.parseDouble(kb.nextLine());

            System.out.printf("Distance:%f%n", PointUtil.distance(x1,y1,x2,y2));
        }
    }

    class PointUtil {
        public static double distance(double x1, double y1, double x2, double y2)
        {
            return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        }
    }
}
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı double türden x1, y1, x2, y2 koordinat bilgilerine göre iki nokta
	arasındaki  ((x1, y1) ve (x2, y2)) uzaklığa geri dönen distance isimli metodu PointUtil isimli sınıf içerisinde
	yazınız	ve klavyeden girilen değerlerle çağırarak test ediniz
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork02 {
    public static void main(String [] args)
    {
        DistanceTest.run();
    }

    class DistanceTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("x1?:");
            double x1 = Double.parseDouble(kb.nextLine());

            System.out.print("y1?:");
            double y1 = Double.parseDouble(kb.nextLine());

            System.out.print("x2?:");
            double x2 = Double.parseDouble(kb.nextLine());

            System.out.print("y2?:");
            double y2 = Double.parseDouble(kb.nextLine());

            System.out.printf("Distance:%f%n", PointUtil.distance(x1, y1, x2, y2));
        }
    }

    class PointUtil {
        public static double distance(double x1, double y1, double x2, double y2)
        {
            return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        }
    }


}
/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı double türden x1, y1, x2, y2 koordinat bilgilerine göre iki nokta
	arasındaki  ((x1, y1) ve (x2, y2)) uzaklığa geri dönen distance isimli metodu PointUtil isimli sınıf içerisinde
	yazınız	ve klavyeden girilen değerlerle çağırarak test ediniz
----------------------------------------------------------------------------------------------------------------------*/
class ClassWork03 {
    public static void main(String [] args)
    {
        DistanceTest.run();
    }
    class DistanceTest {
        public static void run()
        {
            java.util.Scanner kb = new java.util.Scanner(System.in);
            System.out.print("x1?:");
            double x1 = Double.parseDouble(kb.nextLine());

            System.out.print("y1?:");
            double y1 = Double.parseDouble(kb.nextLine());

            System.out.print("x2?:");
            double x2 = Double.parseDouble(kb.nextLine());

            System.out.print("y2?:");
            double y2 = Double.parseDouble(kb.nextLine());

            System.out.printf("Distance:%f%n", PointUtil.distance(x1, y1, x2, y2));
        }
    }

    class PointUtil {
        public static double distance(double x1, double y1, double x2, double y2)
        {
            double dx = x1 - x2;
            double dy = y1 - y2;

            return Math.sqrt(dx * dx + dy * dy);
        }
    }
}
/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının PI ve E sabit elemanları
----------------------------------------------------------------------------------------------------------------------*/
class DemoEandPI {
    public static void main(String [] args)
    {
        System.out.printf("PI = %.15f%n", Math.PI);
        System.out.printf("E = %.15f%n", Math.E);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının trigonometrik işlemler yapan metotları radyan ölçü birimi ile çalışırlar. Ranyan ve derece arasındaki
	dönüştürmeler için toDegrees ve toRadians isimli metotlar da Math sınıfında vardır
----------------------------------------------------------------------------------------------------------------------*/

class DemoToRadian {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Derece değerini giriniz:");
        double a = Double.parseDouble(kb.nextLine());

        System.out.printf("sin(%f) = %f%n", a, Math.sin(Math.toRadians(a)));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının min ve max metotları
----------------------------------------------------------------------------------------------------------------------*/

class DemoManMix {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        System.out.print("İkinci sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());

        System.out.printf("min(%d, %d) = %d%n", a, b, Math.min(a, b));
        System.out.printf("max(%d, %d) = %d%n", a, b, Math.max(a, b));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının min ve max metotları ile 3 tane sayının en büyüğünün ve en küçüğünün bulunması
----------------------------------------------------------------------------------------------------------------------*/
class AppManMix {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        System.out.print("İkinci sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());

        System.out.print("Üçüncü sayıyı giriniz:");
        int c = Integer.parseInt(kb.nextLine());

        System.out.printf("min(%d, %d, %d) = %d%n", a, b, c, Math.min(Math.min(a, b), c));
        System.out.printf("max(%d, %d, %d) = %d%n", a, b, c, Math.max(Math.max(a, b), c));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının logXXX metotları
----------------------------------------------------------------------------------------------------------------------*/
class DemoLog {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        double a = Double.parseDouble(kb.nextLine());

        System.out.printf("log(%f) = %f%n", a, Math.log(a));
        System.out.printf("log10(%f) = %f%n", a, Math.log10(a));
        System.out.printf("log1p(%f) = %f%n", a, Math.log1p(a));
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	MathUtil sınıfının log metodu
----------------------------------------------------------------------------------------------------------------------*/

class DemoMathUtilLog {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Tabanı giriniz:");
        double a = Double.parseDouble(kb.nextLine());

        System.out.print("Argümanı giriniz:");
        double b = Double.parseDouble(kb.nextLine());


        System.out.printf("log(%f, %f) = %f%n", a, b, MathUtil.log(a, b));
    }
}

class MathUtil {
    public static double log(double a, double b)
    {
        return Math.log(b) / Math.log(a);
    }
}

/*----------------------------------------------------------------------------------------------------------------------
	Math sınıfının yuvarlama işlemi yapan temel metotları
----------------------------------------------------------------------------------------------------------------------*/

class DemoRounding {
    public static void main(String [] args)
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        double val = Double.parseDouble(kb.nextLine());

        System.out.printf("round(%f) = %d%n", val, Math.round(val));
        System.out.printf("ceil(%f) = %f%n", val, Math.ceil(val));
        System.out.printf("floor(%f) = %f%n", val, Math.floor(val));
    }
}
