package zadaca04;

public class MainClass {
	public static void main(String[] args) {
Avtomobil object1 = new Avtomobil();
Avtomobil object2 = new Avtomobil("Renault", "Megane", 10000);
object1.marka= "Toyota";
object1.model = "Corolla";
object1.km = 5000;

System.out.println("Marka: " + object1.marka);
System.out.println("Model: "+ object1.model);
System.out.println("Pominati kilometri: " + object1.km);

System.out.println("Marka: " + object2.marka);
System.out.println("Model: " + object2.model);
System.out.println("Pominati kilometri: " + object2.km);

}
}
