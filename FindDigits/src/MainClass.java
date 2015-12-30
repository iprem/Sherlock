import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc;

	public static Character[] toCharArray(String str){
		if(str == null)
			return null;
		int length = str.length();
		Character[] array = new Character[length];
		for(int i =0; i< length; i++){
			array[i] = new Character(str.charAt(i));
		}
		return array;
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i< T; i++){
			String N = sc.next();
			long num = Long.parseLong(N);
			int count = 0;
			for(int j = 0; j< N.length(); j++){
				int d = Character.getNumericValue(N.charAt(i));
				System.out.print(d);
				if(d == 0)	continue;
				if( num % d == 0 )
					count++;
			}
			System.out.println(count);
		}

	}

}
