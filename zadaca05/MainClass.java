package zadaca05;

public class MainClass {
public static void main(String[] args) {
	Predmet object1 = new Predmet();
	Predmet object2 = new Predmet("Objektno Orientirano Programiranje");
	Predmet object3 = new Predmet("Matematika", "Marko Markoski", 6);
	
	object1.imeNaPredmet = "Angliski jazik";
	object1.profesor = "Petre Petrovski";
	object1.krediti = 6;
	object1.semestar = 1;
	
	// se pecatat vrednostite na defaultniot konstruktor so object1
	System.out.println("Ime na predmet: " + object1.imeNaPredmet);
	System.out.println("Profesor koj go predava predmetot: " + object1.profesor);
	System.out.println("Krediti: " + object1.krediti);
	System.out.println("Semestar vo koj se izucuva predmetot: " + object1.semestar);
	
	// se pecatat vrednostite na dinamickiot konstruktor so object2
	System.out.println("Ime na predmet: " + object2.imeNaPredmet);
	
	// se pecatat vrednostite na dinamickiot konstruktor so object3
	System.out.println("Ime na predmet: " + object3.imeNaPredmet);
	System.out.println("Profesor koj go predava predmetot: " + object3.profesor);
	System.out.println("Krediti: " + object3.krediti);
	
	}
}
