import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		/*Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

		Meyveler ve KG Fiyatları

		Armut : 2,14 TL
		Elma : 3,67 TL
		Domates : 1,11 TL
		Muz: 0,95 TL
		Patlıcan : 5,00 TL
		örnek çıktı
		Armut Kaç Kilo ? :0
		Elma Kaç Kilo ? :1
		Domates Kaç Kilo ? :1
		Muz Kaç Kilo ? :2
		Patlıcan Kaç Kilo ? :3
		Toplam Tutar : 21.68 TL*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kaç Kilo Armut Aldınız? : ");
		double armut = scanner.nextDouble();
		
		System.out.print("Kaç Kilo Elma Aldınız? : ");
		double elma = scanner.nextDouble();
		
		System.out.print("Kaç Kilo Domates Aldınız? :");
		double domates = scanner.nextDouble();
		
		System.out.print("Kaç Kilo Muz Aldınız? :");
		double muz = scanner.nextDouble();
		
		System.out.print("Kaç Kilo Patlıcan Aldınız? :");
		double patlican = scanner.nextDouble();
		
		double toplam = (armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.00);
		System.out.print("Toplam Tutar : " + toplam + " TL");
	
	}
}
