package HomeWork;

import java.util.Iterator;

public class ArraysDemo {
     public static void main(String[] args) {
		int[] numbers = new int[] {9,11,15,10,20,4,30,40,50,3};
		int a = 0;
		
		for (int i = 0; i < numbers.length; i++) {   // riyazi meseleler vermiyin artiq
			a = a+numbers[i];    // toplami
			int b = numbers[i] / 2;   // ededi ortasi
			
			
			
			System.out.println( "ededi ortasina bol :" +b);
			
			
		}
		System.out.println("toplami :" +a);
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {     // tek ededlerin cixarilmasi
				System.out.println(numbers[i]);
			}
			
		}
		
		        

		int min = numbers[0];// Dizinin ilk elemanını en küçük olarak kabul ediyoruz

		
		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] < min) {
		                min = numbers[i];
		            }
		        }

		        System.out.println("Dizinin en küçük elemanı: " + min);
		    }
		

		
		
		
		

	}
