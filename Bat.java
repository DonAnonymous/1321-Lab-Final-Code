import java.util.Scanner;

public class Bat {
	private String[] materials = { "aluminum", "maple", "ash", "hickory", "bamboo" };
	private double length;
	private double diameter;
	private int num;

	Bat() {
		length = 30;
		diameter = 1.5;
		num = 0;

	}

	Bat(double len, double di, int n) {
		length = len;
		diameter = di;
		num = n;
	}

	double getLength() {
		return length;
	}

	double getDiameter() {
		return diameter;
	}

	void setLength(double len) {
		length = len;
	}

	void setDiameter(double di) {
		diameter = di;
	}

	void Break() {
		if (num != 0) {
			System.out.println("The bat was broken! Its length and diamter were changed to -1\n");
			length = -1;
			diameter = -1;
		}
	}

	public String toString() {
		return ("Bat " + num + "'s length: " + length + " inches\n\nBat " + num + "'s diamter: " + diameter
				+ " inches\n\nBat " + num + "'s material: " + materials[num] + "\n\n");
	}

	public static void main(String[] args) {
		Scanner jo = new Scanner(System.in);
		Bat jer = new Bat();
		System.out.print("Enter the lenght of a bat as an integer: ");
		double len = jo.nextShort();
		if (len > 42) {
			len = 42;
		}
		System.out.print("Enter the diameter of a bat as an integer: ");
		double di = jo.nextShort();
		if (di > 2.75) {
			di = 2.75;
		}
		int n = 1;
		Bat scar = new Bat(len, di, n);
		System.out.println(scar.toString());
		scar.Break();
		System.out.println(jer.toString());
		jer.Break();
		System.out.println(scar.toString());
		System.out.println(jer.toString());
	}
}
