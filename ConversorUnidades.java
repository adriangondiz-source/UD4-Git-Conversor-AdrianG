package com.ejercicio;

public class ConversorUnidades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Ejemplos de uso
        double temperatura1 = 0.0;   // Punto de congelación del agua
        double temperatura2 = 100.0; // Punto de ebullición del agua
        double temperatura3 = 37.0;  // Temperatura corporal
        
        System.out.println("=== Conversor Celsius a Fahrenheit ===");
        System.out.println(temperatura1 + "°C = " + celsiusAFahrenheit(temperatura1) + "°F");
        System.out.println(temperatura2 + "°C = " + celsiusAFahrenheit(temperatura2) + "°F");
        System.out.println(temperatura3 + "°C = " + celsiusAFahrenheit(temperatura3) + "°F");
        
        // También puedes probar con input del usuario
        if (args.length > 0) {
            try {
                double input = Double.parseDouble(args[0]);
                System.out.println("\nConversión del argumento:");
                System.out.println(input + "°C = " + celsiusAFahrenheit(input) + "°F");
            } catch (NumberFormatException e) {
                System.out.println("Argumento inválido. Usa un número.");
            }
        }
	}
	    
	    // Método estático para convertir Celsius a Fahrenheit
	    public static double celsiusAFahrenheit(double celsius) {
	        // Fórmula: (C × 9/5) + 32
	        return (celsius * 9.0 / 5.0) + 32.0;
	    }
	    
	    // Método main para probar la función

	    
	}

