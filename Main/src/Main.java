/**
 * @author Thabang Mamoloko
 */

import java.util.Scanner;

/**
 * Class contains the main method
 */
public class Main {

	/**
	 * The main method
	 * @param args - command line arguments (Empty)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionalList<Integer> list = new PositionalList<>();
		Scanner scanner = new Scanner(System.in);
		
		boolean running = true;
		while(running) {
			System.out.println(" **** Menu **** ");
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. top");
			System.out.println("4. Exit");
			
			System.out.print("Enter: ");
			int input = scanner.nextInt();
			
			switch(input) {
			case 1:
				System.out.println(" ***** ***** *****");
				System.out.print("Enter Element(Integer): ");
				int element = scanner.nextInt();
				list.push(element);
				list.printVoid();
				System.out.println(" ***** ***** *****");
				break;
			case 2:
				System.out.println(" ***** ***** *****");
				System.out.println("Removing the top element : " + list.pop().getElement() + "...\n");
				list.printVoid();
				System.out.println(" ***** ***** *****");
				break;
			case 3:
				System.out.println(" ***** ***** *****");
				System.out.println("Getting the top element : " + list.top().getElement() + "...\n");
				System.out.println(" ***** ***** *****");
				break;
			case 4:
				System.out.println("Exiting...");
				running = false;
				break;
			default:
				System.out.println("Invalid Input!!");
			}
		}
		scanner.close();
	}

}
