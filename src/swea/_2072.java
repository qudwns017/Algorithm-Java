package swea;

import java.util.Scanner;
import java.util.Arrays;

public class _2072 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        String input = sc.nextLine();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            System.out.print("#"+test_case+" ");
            
            input = sc.nextLine();
            int result = 0;
            String[] arr = input.split(" ");
            int[] oddArr = Arrays.stream(arr).mapToInt(Integer::parseInt).filter(x -> x % 2 == 1).toArray();
            for (Integer num : oddArr) {
            	result += num;
            }
            System.out.println(result);
		}
	}
}
