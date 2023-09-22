
import java.util.Scanner;
public class BodyIndexCalc {
    public static void main(String[] args){
        //kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //Kilo (kg) / Boy(m) * Boy(m)

        int weight;
        double height, index;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz : ");
        weight = inp.nextInt();
        System.out.println("Boyunuzu giriniz (metre cinsinden) : ");
        height = inp.nextDouble();

        index = weight / (height * height);
        System.out.println("Vucut kutle indexiniz : " + index);

    }
}
