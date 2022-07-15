import java.util.Scanner;
/*
n1 = ilk sayı
n2 = ikinci sayı
k1 = küçük sayı
b1 = büyük sayı
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, k1, b1;
        int Ebob, Ekok;

        System.out.print("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        if (n1 < n2) {
            k1 = n1;
            b1 = n2;

        } else {
            k1 = n2;
            b1 = n1;
        }
        int i = k1;
        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0){
                Ebob = i;
                System.out.println("Ebob : " + Ebob);
                break;
            }
            i--;

        }
        int z = 1;
        while (z <= n1 * n2) {
            if ( z % n1 == 0 && z % n2 ==0){
                Ekok = z;
                System.out.println("Ekok :" + Ekok);
                break;
            }
            z++;
        }
    }
}
