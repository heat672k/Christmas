import java.util.Scanner;
public class ChristmasMain {

	public static void main(String[] args) {
		Christmas connection = Christmas.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("For Dolls enter 1, for Bycicles enter 2 ");

		int num = scan.nextInt();
		if (num == 1) {

			connection.postMessage("I want Dolls");

		}

		if (num == 2) {

			connection.postMessage("I want Bycicles");

		}
		
		scan.close();

	}

}