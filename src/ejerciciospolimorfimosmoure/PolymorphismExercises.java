package ejerciciospolimorfimosmoure;

import java.util.ArrayList;

public class PolymorphismExercises {

	public static void main(String[] args) {
		// 1

		ArrayList<Animal> listaAnimales = new ArrayList<>();
		listaAnimales.add(new Dog());
		listaAnimales.add(new Cat());
		listaAnimales.add(new Cow());
		for (Animal animal : listaAnimales) {
			animal.makeSound();
		}

		// 2
		ArrayList<Shape> listaPoligonos = new ArrayList<>();
		listaPoligonos.add(new Circle());
		listaPoligonos.add(new Rectangle());
		for (Shape shape : listaPoligonos) {
			shape.calculateArea();
		}
		// 3
		Printer printer = new Printer();
		printer.print("Hola pixa esto es una cadena");
		printer.print(15);
		printer.print(19.8);

		// 4
		Greeter greeter = new Greeter();
		greeter.greet();
		greeter.greet("Manolito");

		// 6
		sendNotification(new EmailNotification());
		sendNotification(new SMSNotification());

		// 7
		AnimalType animalillo1 = new DogType();
		showAnimalType(animalillo1);
		AnimalType animalillo2 = new CatType();
		showAnimalType(animalillo2);
		AnimalType animalillo3 = new HorseType();
		showAnimalType(animalillo3);

		// 10
		Character[] arrayPersonajes = new Character[3];

		arrayPersonajes[0] = new Warrior();
		arrayPersonajes[1] = new Archer();
		arrayPersonajes[2] = new Mage();

		for (Character personaje : arrayPersonajes) {
			personaje.attack();
		}

	}

	// 1. Crea una clase Animal con el mÃ©todo makeSound(). Luego crea subclases
	// Dog,
	// Cat y Cow que sobrescriban ese mÃ©todo con sonidos diferentes. Llama al
	// mÃ©todo
	// desde una lista de Animal.
	public static class Animal {
		public void makeSound() {
			System.out.println("Animal sound");
		}
	}

	public static class Dog extends Animal {
		public void makeSound() {
			System.out.println("Woofff");
		}
	}

	public static class Cat extends Animal {
		public void makeSound() {
			System.out.println("Meowww");
		}
	}

	public static class Cow extends Animal {
		public void makeSound() {
			System.out.println("Muuuu");
		}
	}

	// 2. Crea una clase Shape con el mÃ©todo calculateArea(). Luego implementa
	// subclases Circle y Rectangle con sus propias fÃ³rmulas. Usa una lista de
	// Shape para recorrer e imprimir el Ã¡rea de varias figuras.
	public static abstract class Shape {
		public abstract void calculateArea();

	}

	public static class Circle extends Shape {
		public void calculateArea() {
			System.out.println("Calculando el area del círculo");
		}
	}

	public static class Rectangle extends Shape {
		public void calculateArea() {
			System.out.println("Calculando el area del rectángulo");
		}
	}

	// 3. Crea una clase Printer con varios mÃ©todos print() sobrecargados que
	// acepten diferentes tipos de parÃ¡metros (String, int, double). Llama a cada
	// uno desde main.
	public static class Printer {
		public void print(String cadena) {
			System.out.println(cadena);
		}

		public void print(int numeroEntero) {
			System.out.println(numeroEntero);
		}

		public void print(double numeroDecimal) {
			System.out.println(numeroDecimal);
		}
	}

	// 4. Crea una clase Greeter con dos mÃ©todos greet(): uno que salude con
	// â€œHelloâ€, y otro que reciba un nombre y salude con â€œHello, [nombre]â€.
	public static class Greeter {
		public void greet() {
			System.out.println("Hello!");
		}

		public void greet(String nombre) {
			System.out.println("Hello! " + nombre + " how are u?");
		}
	}

	// 5. Crea una clase Vehicle con un mÃ©todo start(). Luego crea Car, Bike y
	// Truck
	// que sobrescriban ese mÃ©todo. Recorre una lista ArrayList<Vehicle> para
	// llamar
	// a start() en cada uno.

	// 6. Crea una clase Notification con mÃ©todo send(), y subclases
	// EmailNotification, SMSNotification. Luego crea una funciÃ³n
	// sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
	public static class Notification {
		public void send() {
			System.out.println("Enviando notificación");
		}

	}

	public static class EmailNotification extends Notification {
		@Override
		public void send() {
			System.out.println("Enviando notificación por email");
		}
	}

	public static class SMSNotification extends Notification {
		@Override
		public void send() {
			System.out.println("Enviando notificación por SMS");
		}
	}

	// Método ejercicio 6
	public static void sendNotification(Notification n) {
		n.send();
	}

	// 7. Crea una funciÃ³n showAnimalType(Animal animal) que imprima el tipo de
	// animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
	// su tipo con su propio getType() sobrescrito.
	public abstract static class AnimalType {
		public abstract String getType();
	}

	public static class DogType extends AnimalType {
		@Override
		public String getType() {
			return "Yo soy un perro";
		}
	}

	public static class CatType extends AnimalType {
		@Override
		public String getType() {
			return "Yo soy un gato";
		}
	}

	public static class HorseType extends AnimalType {
		@Override
		public String getType() {
			return "Yo soy un caballo";
		}
	}

	public static void showAnimalType(AnimalType animal) {
		System.out.println("Tipo de animal: " + animal.getType());
	}

	// 8. Crea una clase Converter con mÃ©todos convert(int), convert(double), y
	// convert(String) que devuelvan diferentes formatos de texto.

	// 9. Crea una clase Product con el mÃ©todo getPrice(). Luego, Book y Electronic
	// deben sobrescribirlo con su propia lÃ³gica de descuento. Recorre una lista de
	// Product e imprime el precio final de cada uno.

	// 10. Crea una clase Character con mÃ©todo attack(). Luego crea subclases
	// Warrior, Archer, Mage con ataques diferentes. En main, crea un array de
	// Character y llama a attack() para cada uno.
	public abstract static class Character {
		public abstract void attack();
	}

	public static class Warrior extends Character {
		@Override
		public void attack() {
			System.out.println("El guerrero está atacando con el mandoble");
		}
	}

	public static class Archer extends Character {
		@Override
		public void attack() {
			System.out.println("El arquero está atacando con flechas electrizantes");
		}
	}

	public static class Mage extends Character {
		@Override
		public void attack() {
			System.out.println("El mago está atacando con Piro++");
		}
	}

}