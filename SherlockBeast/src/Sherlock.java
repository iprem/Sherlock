import java.util.Scanner;

public class Sherlock {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int T = sc.nextInt();
		int i, flag = 0;
		StringBuilder num = new StringBuilder();
        num.append("");

		for (int k = 0; k < T; k++) {
			int N = sc.nextInt();

			for (i = 0; i <= N; i++) {
				if ((i % 5 == 0) && ((N - i) % 3 == 0)) {
					flag = 1;
					break;
				}
			}

			if (flag == 0)
				System.out.println(-1);
			else {
				for (int j = 0; j < N - i; j++)
					num.append("5");
				for (int j = 0; j < i; j++)
					num.append("3");
				System.out.println(num);
			}
			flag = 0;
			num.delete(0, N);
		}
	}
}
