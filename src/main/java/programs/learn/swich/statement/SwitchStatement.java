package programs.learn.swich.statement;

public class SwitchStatement {

	public static void main(String[] args) {

		char grade = 'c';
		switch (grade) {
		case 'a':
			System.out.println("merit");
			break;
		case 'b':
			System.out.println("ist devision");
			break;
		case 'c':
			System.out.println("second devision");
			break;
		case 'd':
			System.out.println("third devision");
			break;
		default:
			System.out.println("no result");
		}

	}

}
