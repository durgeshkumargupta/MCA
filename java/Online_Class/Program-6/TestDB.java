import java.util.Scanner;

public class TestDB {
	public static void main(String[] args) throws MyException {
		Scanner sc = new Scanner(System.in);
		ConnectionDB obj = new ConnectionDB();
		obj.createConnection();
		while (true) {
			System.out.println("1.Insert Value");
			System.out.println("2.Update Value");
			System.out.println("3.Search value based on USN");
			System.out.println("4.Delete Value based on USN");
			System.out.println("5.Exit");

			System.out.println("Enter your choice=");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:

				obj.insertData();
				obj.displayData();
				break;
			case 2:
				obj.displayData();
				obj.updateByUsn();
				obj.displayData();
				break;
			case 3:
					obj.searchByUsn();
				break;
			case 4:
				obj.deleteByUsn();
				obj.displayData();
				break;
			case 5:
				obj.closeConnection();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid input Please valid input !!");

			}
		}

	}
}
