package ejerciciosabstraccionesmoure;

public class AbstractionExercises {

	public static void main(String[] args) {

		// 1
		Shape circulo = new Circle();
		circulo.calculateArea();
		Shape rectangulo = new Rectangle();
		rectangulo.calculateArea();

		// 2
		Guitar guitarra = new Guitar();
		guitarra.play();
		Piano piano = new Piano();
		piano.play();

		// 3
		Animal[] arrayAnimales = { new Dog(), new Cat() };
		for (Animal animal : arrayAnimales) {
			animal.makeSound();
		}

		//
		// Supongamos que estamos en el Main instanciando un objeto
		FullTimeEmployee empleado1 = new FullTimeEmployee(200, 0.10);

		// El Main no hace matemáticas. Solo le da la orden al objeto.
		double sueldo = empleado1.calculateSalary();
		System.out.println("Sueldo del empleado1: " + sueldo);
	}

	// 1. Crea una clase abstracta Shape con el mÃ©todo calculateArea(). Luego
	// implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su
	// propia Ã¡rea.
	public static abstract class Shape {
		public abstract void calculateArea();
	}

	public static class Circle extends Shape {
		public void calculateArea() {
			System.out.println("Calculando área del círculo");
		}
	}

	public static class Rectangle extends Shape {
		public void calculateArea() {
			System.out.println("Calculando área del rectángulo");
		}
	}

	// 2. Crea una interfaz Playable con el mÃ©todo play(). Luego implementa esa
	// interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje
	// diferente al ejecutarse.
	public interface Playable {
		void play();
	}

	public static class Guitar implements Playable {
		public void play() {
			System.out.println("Suena la guitarra, ¡Wow!");
		}
	}

	public static class Piano implements Playable {
		public void play() {
			System.out.println("Suena el piano, ¡Ninoni!");
		}
	}

	// 3. Define una clase abstracta Animal con el mÃ©todo makeSound(). Implementa
	// Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para
	// mostrar polimorfismo.
	public static abstract class Animal {
		public abstract void makeSound();
	}

	public static class Dog extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Woooooooooof!");
		}
	}

	public static class Cat extends Animal {
		@Override
		public void makeSound() {
			System.out.println("Meooooow!");
		}
	}

	// 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y
	// Triangle que muestren cÃ³mo se dibuja cada figura usando draw().
	public interface Drawable {
		public void draw();
	}

	public static class Circle2 implements Drawable {
		@Override
		public void draw() {
			System.out.println("Dibuja en circulo");
		}
	}

	public static class Square implements Drawable {
		@Override
		public void draw() {
			System.out.println("Dibuja cuatro lados iguales");
		}
	}

	public static class Triangle implements Drawable {
		@Override
		public void draw() {
			System.out.println("Dibuja 3 lados");
		}
	}

	// 5. Crea una clase abstracta Employee con un mÃ©todo calculateSalary().
	// Implementa FullTimeEmployee y PartTimeEmployee con lÃ³gica diferente para
	// calcular el salario.
	public static abstract class Employee {
		private int horasMensuales;
		double pctBonificacion;

		public abstract double calculateSalary();

		public Employee(int horasMensuales, double pctBonificacion) {
			this.horasMensuales = horasMensuales;
			this.pctBonificacion = pctBonificacion;
		}
	}

	public static class FullTimeEmployee extends Employee {

		public FullTimeEmployee(int horasMensuales, double pctBonificacion) {
			super(horasMensuales, pctBonificacion);
			// TODO Auto-generated constructor stub
		}

		public double calculateSalary() {
			double salarioBase;
			double salarioTotal = 0;
			salarioBase = (12 * super.horasMensuales);
			salarioTotal = salarioBase + (salarioBase * this.pctBonificacion);
			return salarioTotal;
		}

	}

	public static class PartTimeEmployee extends Employee {
		public PartTimeEmployee(int horasMensuales, double pctBonificacion) {
			super(horasMensuales, pctBonificacion);
			// TODO Auto-generated constructor stub
		}

		public double calculateSalary() {
			double salario;
			salario = (12 * super.horasMensuales);
			return salario;
		}

	}

	// 6. Crea una interfaz Movable con el mÃ©todo move(). Haz que las clases Car y
	// Robot implementen ese mÃ©todo con comportamientos diferentes.
	interface Movable {
		void move();
	}

	public static class Car implements Movable {
		@Override
		public void move() {
			System.out.println("El coche se mueve con las ruedas");
		}
	}

	public static class Robot implements Movable {
		@Override
		public void move() {
			System.out.println("El robot se mueve de forma automática");
		}
	}

	// 7. Crea una clase abstracta Appliance con mÃ©todo turnOn() y turnOff().
	// Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
	public static abstract class Appliance {
		public abstract void turnOn();

		public abstract void turnOff();
	}

	public static class TV extends Appliance {
		@Override
		public void turnOn() {
			System.out.println("Beep! Televisión encendida");
		}

		@Override
		public void turnOff() {
			System.out.println("Beep! Televisión apagada");
		}
	}

	public static class WashingMachine extends Appliance {
		@Override
		public void turnOn() {
			System.out.println("Cling! Lavadora encendida y lista");
		}

		@Override
		public void turnOff() {
			System.out.println("Clonk! Lavadora apagada");
		}
	}

	// 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que
	// implemente ambas interfaces y muestre cÃ³mo puede volar y nadar.
	interface Flyable {
		void fly();
	}
	
	interface Swimmable{
		void swim();
	}
	public static class Duck extends Animal implements Flyable, Swimmable{

		@Override
		public void swim() {
			System.out.println("El pato se zambulló en el agua");
			
		}

		@Override
		public void fly() {
			System.out.println("*Agitando las alas y volando lejos*");
			
		}

		@Override
		public void makeSound() {
			System.out.println("CUACK!!!");
			
		}
		
	}

	// 9. Crea una clase abstracta Document con el mÃ©todo print(). Luego crea
	// PDFDocument y WordDocument, cada una con su forma de imprimir.
	public static abstract class Document{
		public abstract void print();
	}
	
	public static class PDFDocument extends Document{
		public void print() {
			System.out.println("PDF imprimiéndose...");
		}
	}
	
	public static class WordDocument extends Document{
		public void print() {
			System.out.println("Documento de Word imprimiendose...");
		}
	}
	
	
	// 10. Crea una interfaz Payable con el mÃ©todo pay(). Luego implementa las
	// clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago
	// diferente.
	
	interface Payable{
		void pay();
	}
	
	public static class Invoice implements Payable{
		public void pay() {
			System.out.println("Pagando factura...");
		}
	}
	
	public static class EmployeePayment implements Payable{
		public void pay() {
			System.out.println("Pagando al empleado...");
		}
	}

}
