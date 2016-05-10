package ElliottGroup;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter some text (no spaces please): ");
		
		String username = scanner.next();
		
		String result;
		result = username.toUpperCase();
		
		System.out.println(result);
	}
}
