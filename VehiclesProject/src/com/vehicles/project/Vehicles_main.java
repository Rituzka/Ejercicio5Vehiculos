package com.vehicles.project;

import java.util.*;
import java.util.regex.*;

public class Vehicles_main {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		String color, brand, plate;
		String brandWheelBackRight, brandWheelBackLeft, brandWheelFrontRight, brandWheelFrontLeft;
		double diameterWheelBackRight, diameterWheelBackLeft, diameterWheelFrontRight, diameterWheelFrontLeft;
		List<Wheel> wheelsBack = new ArrayList<Wheel>();
		List<Wheel> wheelsFront = new ArrayList<Wheel>();
		List<Wheel> wheelsBike = new ArrayList<Wheel>();
		boolean isCorrect = false;
		int selection;
		String brandWheelFront, brandWheelBack;
		double diameterWheelBack, diameterWheelFront;

		// Seleccionar opción creación coche o moto
		System.out.println("Qué vehículo quieres crear? 1 COCHE  2 MOTO: ");
		selection = input.nextInt();
		input.nextLine();

		// OPCION COCHE SELECCIONADA
		if (selection == 1) {

			// Pedimos al usuario color, marca y matricula del coche
			System.out.println("Escribe la marca del coche: ");
			brand = input.nextLine();

			System.out.println("Escribe el color del coche: ");
			color = input.nextLine();

			do {
				System.out.println("Escribe la matrícula: ");
				plate = input.nextLine();

				if (isCorrectPlate(plate) == true) {
					isCorrect = true;
				} else {
					System.out.println("La matricula debe contener 4 números y al menos 2 letras");
				}

			} while (isCorrect == false);

			// instanciamos un objeto Car con las características ingresadas
			Car car1 = new Car(plate, brand, color);

			System.out.println(car1.getBrand() + ", " + car1.getColor() + ",  " + car1.getPlate());

			// RUEDAS DELANTERAS

			// Rueda delantera derecha (marca y diametro)
			System.out.println("Escribe la marca de la rueda delantera derecha: ");
			brandWheelFrontRight = input.nextLine();

			do {
				System.out.println("Escribe el diámetro de la rueda delantera derecha: ");
				diameterWheelFrontRight = input.nextDouble();

				if (isCorrectDiameter(diameterWheelFrontRight) == true) {
					isCorrect = true;

				} else {
					System.out.println("El diámetro deber estar entre 0,4 y 4");
					isCorrect = false;
				}

			} while (isCorrect == false);

			input.nextLine();

			// Rueda delantera izquierda(marca y diámetro)

			System.out.println("Escribe la marca de la rueda delantera izquierda: ");
			brandWheelFrontLeft = input.nextLine();

			do {
				System.out.println("Escribe el diámetro de la rueda delantera izquierda: ");
				diameterWheelFrontLeft = input.nextDouble();

				if (isCorrectDiameter(diameterWheelFrontLeft) == true) {
					isCorrect = true;

				} else {
					System.out.println("El diámetro deber estar entre 0,4 y 4");
					isCorrect = false;
				}

			} while (isCorrect == false);

			input.nextLine();

			// instanciamos un objeto de la clase Wheel para guardar las dos propiedades de
			// cada rueda
			Wheel wheelCar1FrontRight = new Wheel(brandWheelFrontRight, diameterWheelFrontRight);
			Wheel wheelCar1FrontLeft = new Wheel(brandWheelFrontLeft, diameterWheelFrontLeft);

			// agregramos las dos ruedas delanteras a una lista
			wheelsFront.add(wheelCar1FrontRight);
			wheelsFront.add(wheelCar1FrontLeft);

			// validamos la información de las dos ruedas con el metodo de la clase Car
			try {
				car1.addTwoWheels(wheelsFront);
				System.out.println("Coinciden los datos sobre ruedas delanteras");
			} catch (Exception e) {
				System.out.println("Verifica los datos ingresados. No coinciden las ruedas delanteras ." + e);

			}

			// imprimimos la información de cada rueda delantera
			System.out.println("La marca de la rueda delantera derecha es " + wheelsFront.get(0).getBrand()
					+ " y el diámetro: " + wheelsFront.get(0).getDiameter());

			System.out.println("La marca de la rueda delantera izquierda es " + wheelsFront.get(1).getBrand()
					+ " y el diámetro: " + wheelsFront.get(1).getDiameter() + "\n");

			// RUEDAS TRASERAS

			// Rueda trasera derecha (marca y diametro)
			System.out.println("Escribe la marca de la rueda trasera derecha: ");
			brandWheelBackRight = input.nextLine();

			do {
				System.out.println("Escribe el diámetro de la rueda trasera derecha: ");
				diameterWheelBackRight = input.nextDouble();

				if (isCorrectDiameter(diameterWheelBackRight) == true) {
					isCorrect = true;

				} else {
					System.out.println("El diámetro deber estar entre 0,4 y 4");
					isCorrect = false;
				}

			} while (isCorrect == false);

			input.nextLine();

			// Rueda trasera izquierda (marca y diámetro)
			System.out.println("Escribe la marca de la rueda trasera izquierda: ");
			brandWheelBackLeft = input.nextLine();

			do {
				System.out.println("Escribe el diámetro de la rueda trasera izquierda: ");
				diameterWheelBackLeft = input.nextDouble();

				if (isCorrectDiameter(diameterWheelBackLeft) == true) {
					isCorrect = true;

				} else {
					System.out.println("El diámetro deber estar entre 0,4 y 4");
					isCorrect = false;
				}

			} while (isCorrect == false);

			input.nextLine();

			// instanciamos un objeto de la clase Wheel para guardar las dos propiedades de
			// cada rueda
			Wheel wheelCar1BackRight = new Wheel(brandWheelBackRight, diameterWheelBackRight);
			Wheel wheelCar1BackLeft = new Wheel(brandWheelBackLeft, diameterWheelBackLeft);

			// agregramos las dos ruedas traseras a la lista de ruedas traseras
			wheelsBack.add(wheelCar1BackRight);
			wheelsBack.add(wheelCar1BackLeft);

			try {
				car1.addTwoWheels(wheelsBack);
				System.out.println("Datos sobre ruedas traseras correctos");
			} catch (Exception e) {
				System.out.println("Verifica los datos ingresados. No coinciden las ruedas traseras ." + e);

			}

			// imprimimos la información de las ruedas traseras
			System.out.println("La marca de la rueda trasera derecha es " + wheelsBack.get(0).getBrand()
					+ " y el diámetro: " + wheelsBack.get(0).getDiameter());

			System.out.println("La marca de la rueda trasera izquierda es " + wheelsBack.get(1).getBrand()
					+ " y el diámetro: " + wheelsBack.get(1).getDiameter());

			// Agregamos las ruedas con el metodo de la clase Car
			try {
				car1.addWheels(wheelsFront, wheelsBack);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// OPCIÓN MOTO SELECCIONADA

		} else {

			// Pedimos al usuario color, marca y matricula de la moto
			System.out.println("Escribe la marca de la moto: ");
			brand = input.nextLine();

			System.out.println("Escribe el color de la moto: ");
			color = input.nextLine();

			do {
				System.out.println("Escribe la matrícula: ");
				plate = input.nextLine();

				if (isCorrectPlate(plate) == true) {
					isCorrect = true;
				} else {
					System.out.println("La matricula debe contener 4 números y al menos 2 letras");
				}

			} while (isCorrect == false);

			// instanciamos un objeto Bike con las características ingresadas
			Bike bike1 = new Bike(plate, brand, color);

			System.out.println(bike1.getBrand() + ", " + bike1.getColor() + ",  " + bike1.getPlate());

			// RUEDA DELANTERA

			// Rueda delantera moto (marca y diametro)
			System.out.println("Escribe la marca de la rueda delantera: ");
			brandWheelFront = input.nextLine();

			do {
				System.out.println("Escribe el diámetro de la rueda delantera: ");
				diameterWheelFront = input.nextDouble();

				if (isCorrectDiameter(diameterWheelFront) == true) {
					isCorrect = true;

				} else {
					System.out.println("El diámetro deber estar entre 0,4 y 4");
					isCorrect = false;
				}

			} while (isCorrect == false);

			input.nextLine();

			// instanciamos un objeto de la clase Wheel para guardar las dos propiedades del
			// objeto Bike
			Wheel wheelBike1Front = new Wheel(brandWheelFront, diameterWheelFront);

			// agregramos la rueda delantera a la lista
			wheelsBike.add(wheelBike1Front);

			// RUEDA TRASERA

			// Rueda trasera moto (marca y diametro)
			System.out.println("Escribe la marca de la rueda trasera: ");
			brandWheelBack = input.nextLine();

			do {
				System.out.println("Escribe el diámetro de la rueda trasera: ");
				diameterWheelBack = input.nextDouble();

				if (isCorrectDiameter(diameterWheelBack) == true) {
					isCorrect = true;

				} else {
					System.out.println("El diámetro deber estar entre 0,4 y 4");
					isCorrect = false;
				}

			} while (isCorrect == false);

			input.nextLine();

			// instanciamos un objeto de la clase Wheel para guardar las dos propiedades del
			// objeto Bike
			Wheel wheelBike1Back = new Wheel(brandWheelBack, diameterWheelBack);

			// agregramos la rueda delantera a la lista
			wheelsBike.add(wheelBike1Back);

			// Añadimos las dos ruedas a la lista wheelsBike con el metodo de la clase Bike
			try {
				bike1.addTwoWheelsBike(wheelsBike);
				System.out.println("Datos ingresados de las ruedas de la moto correctos");
				System.out.println("La marca de las ruedas es " + wheelsBike.get(0).getBrand() + " y el diámetro: "
						+ wheelsBike.get(0).getDiameter());
			} catch (Exception e) {
				System.out.println("Los datos de marca y diámetro de las ruedas de la moto deben coincidir");
				e.printStackTrace();
			}
		}

	}

	// METODO VALIDACIÓN MATRICULA
	public static boolean isCorrectPlate(String s) {
		Pattern p = Pattern.compile("^[a-zA-Z]{2,3}[\\d]{4}$");
		Matcher m = p.matcher(s);
		boolean isCorrect = m.matches();

		if (isCorrect) {
			return true;
		} else {
			return false;
		}
	}

	// METODO VALIDACIÓN DIAMETRO RUEDAS DELANTERAS Y TRASERAS
	public static boolean isCorrectDiameter(double num) {
		if (num >= 0.4 && num <= 4) {
			return true;
		} else {
			return false;
		}
	}

}
