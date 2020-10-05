package loop;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int number1 = Integer.valueOf(scanner.nextLine());
		
		int i = 0;
		while (i < number1) {
		    System.out.println(i);
		    i++;
		}

	}

}
