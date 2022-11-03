package zadaca07;

public class Triagolnik {
public int a;
public int b;
public int c;

public double Plostina(int a,int b) {
	this.a = a;
	this.b = b;
	return (a*b)/2;

}
public int Perimetar(int a,int b,int c) {
	this.a = a;
	this.b = b;
	this.c = c;
	return a+b+c;
}
}
