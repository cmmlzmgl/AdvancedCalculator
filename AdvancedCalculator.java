
import java.util.Scanner;

public class AdvancedCalculator {

    public static double dortIslemSecim()
    {
        int num2, in1, in2;
        Scanner input = new Scanner(System.in);
        System.out.print("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n");
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
        num2 = input.nextInt();


        System.out.print("Lütfen İlk Sayıyı Giriniz: ");
        in1 = input.nextInt();

        System.out.print("Lütfen İkinci Sayıyı Giriniz: ");
        in2 = input.nextInt();

        double result = dortIslem(num2, in1, in2);

        return result;
    }

    public static double dortIslem(int num2, double in1, double in2)
    {
        double result = 0;
        switch(num2)
        {
            case 1:
                result = in1 + in2;
                break;
            case 2:
                result = in1- in2;
                break;
            case 3:
                result = in1 * in2;
                break;
            case 4:
                result = in1 / in2;
                break;
        }
        return result;
    }

    public static int usluSayi()
    {
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen İşlem Yapmak İstediğiniz Sayıyı Giriniz: ");
        int num1 = input.nextInt();

        System.out.print("Lütfen Üs Olacak Sayıyı Giriniz: ");
        int num2 = input.nextInt();

        for (int i = 1; i <= num2; i++)
        {
            result *= num1;
        }

        return result;
    }

    public static int faktoriyel()
    {
        int result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen İşlem Yapmak İstediğiniz Sayıyı Girim: ");
        int num1 = input.nextInt();
        int num2 = num1;

        for (int i = 1; i <= num2; i++)
        {
            result *= num1;
            num1--;
        }

        return result;

    }

    public static int modAlma()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Mod Almak İstediğiniz Sayıyı Giriniz: ");
        int num1 = input.nextInt();

        System.out.print("Lütfen Modd Sayıyı Giriniz: ");
        int num2 = input.nextInt();

        int result = num1 % num2;

        return result;
    }

    public static void cevreAlan()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Uzun Kenarı Giriniz: ");
        int num1 = input.nextInt();

        System.out.print("Lütfen Kısa Kenarı Giriniz: ");
        int num2 = input.nextInt();

        int cevre = 2 * (num1 + num2);
        int alan = num1 * num2;

        System.out.print("Girmiş Olduğunuz Ölçülere Göre Dikdörtgenin Çevresi: " + cevre + " cm, alanı: " + alan + " cm kare'dir.");
    }
    public static void main(String[] args) {

        System.out.print("1- Dört İşlem\n2- Üslü Sayı Hesaplama\n3- Faktoriyel Hesaplama\n4- Mod Alma\n5- Dikdörtgen Alan ve Çevre Hesabı\n");
        System.out.print("Lütfen Bir İşlem Seçiniz: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        switch (num1)
        {
            case 1:
                System.out.print("İşleminizin Sonucu: "+ dortIslemSecim());
                break;
            case 2:
                System.out.print("İşleminizin Sonucu: "+ usluSayi());
                break;
            case 3:
                System.out.print("İşleminizin Sonucu: "+ faktoriyel());
                break;
            case 4:
                System.out.print("İşleminizin Sonucu: "+ modAlma());
                break;
            case 5:
                cevreAlan();
                break;
        }
    }
}
