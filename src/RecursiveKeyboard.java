import java.util.Scanner;

public class RecursiveKeyboard {
	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 : ");

		i = scan.nextInt();
		recursive(i);

		scan.close();
	}

	static int recursive(int n) {
		int i;

		if (n < 1)
			return 2;
		else {
			i = (2 * recursive(n - 1)) + 1;
			System.out.println(i);

			return i;
		}
	}
}
