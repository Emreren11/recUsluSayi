import java.util.Scanner;

public class Main {
    public static int power(int b,int e)//b=>base, e=> exponent
    {
        if(e>0)// taban 0 olana kadar kendisiyle çarpma
        {
            return b*power(b,e-1); // e parametresi üslü sayı kısmı.Bunu azaltarak üs değeri kadar sayıyı kendisiyle çarpar

        }else
            return 1;//üs değeri 0 olduğunda değeri 1 döndürür. Sebebi çarpma işleminde 1 değeri etkisiz eleman olması.
        //ayrıca üs değer 0 girilirse sonuç 1 olacağı içinde gerekli
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int base,exponent,result=1;
        System.out.println("Çıkış yapmak için Üs değeri negatif giriniz.!");
        while(true)
        {
            System.out.print("Taban değeri giriniz: ");
            base=inp.nextInt();
            System.out.print("Üs değeri giriniz: ");
            exponent=inp.nextInt();
            if (exponent<0)
                break;

            result=power(base,exponent); // result değişkenine yazdırıyoruz.
            System.out.println("Sonuç: "+result);
        }
        System.out.println("\nÇıkış yapılıyor...");

    }
}