package testone;
import java.util.Scanner;
public class three_twentyTwo {

	public static void main(String[] args) {
		System.out.println("���������꣺");
		Scanner input = new Scanner(System.in);
		int[] num = new int[2];
		for(int i=0; i < num.length; i++){
			num[i] = input.nextInt();
		}
		if(Math.abs(num[0]) < 5 && Math.abs(num[1]) < 5) System.out.println("Point (" + num[0] + "," + num[1] + ") is in the circle");
		else System.out.println("Point (" + num[0] + "," + num[1] + ")  is not in the circle");
	}

}
