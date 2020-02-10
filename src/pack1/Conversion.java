package pack1;

import java.util.Scanner;

public class Conversion {

	public double inches, centimeters, celsius, fahrenheit;

	public double InchesToCentimeter() {

		centimeters = (inches / 0.39370);
		return centimeters;

	}

	public double CentimeterToInches() {

		inches = centimeters * 0.39370;
		return inches;

	}

	public double CelsiusToFahrenheit() {

		fahrenheit = celsius * 9 / 5 + 32;
		return fahrenheit;

	}

	public double FahrenheitToCelsius() {

		celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;

	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		Conversion c = new Conversion();

		System.out.println("Conversions\n1.Inches To Centimeters\n2.Centimeters To Inches\n3.Celsius To Fahrenheit\n4.Fahrenheit To Celsius\n5.Exit");
		while (true) {
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Inches Value:");
				c.inches = sc.nextDouble();
				System.out.println(c.InchesToCentimeter());
				break;
			case 2:
				System.out.println("Enter Centimeter Value:");
				c.centimeters = sc.nextDouble();
				System.out.println(c.CentimeterToInches());
				break;
			case 3:
				System.out.println("Enter Celsius Value:");
				c.celsius = sc.nextDouble();
				System.out.println(c.CelsiusToFahrenheit() + "°F");
				break;
			case 4:
				System.out.println("Enter Fahrenheit Value:");
				c.fahrenheit = sc.nextDouble();
				System.out.println(c.FahrenheitToCelsius() + "°C");
				break;
			case 5:
				sc.close();
				System.exit(0);
			}
		}
	}
}
