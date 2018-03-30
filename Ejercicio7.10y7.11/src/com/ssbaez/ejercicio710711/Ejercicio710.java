package com.ssbaez.ejercicio710711;

import java.util.Scanner;

public class Ejercicio710 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que determina cuantos vendedores recibieron salarios respecto a rangos");
		
		System.out.printf("%nIngrese cuantos vendedores va a registrar: ");
		int qtySellers = input.nextInt();
		
		int[] registroVtas = new int[qtySellers];
		
		for(int i = 0; i < registroVtas.length; i++) {
			
			System.out.printf("Ingrese ventas totales de la semana del vendedor %d de %d: ", i + 1, registroVtas.length);
			registroVtas[i] = (int) (200 + 0.09*(input.nextInt()));
			
		}
		
		int[] rangos = new int[11];
		
		for(int i = 0; i < registroVtas.length; i++) {
			
			if(registroVtas[i]/100 >= 10)
				++rangos[10];
			
			else
				++rangos[registroVtas[i]/100];
			
		}
		
		System.out.println();
		
		for(int i = 2; i < rangos.length; i++) {
			
			if(i == 10)
				System.out.printf("$1,000 en adelante: %d", rangos[i]);
			
			else
				System.out.printf("$%d-%d: %d%n", i*100, i*100 + 99, rangos[i]);
				
		}
		
	}

}
