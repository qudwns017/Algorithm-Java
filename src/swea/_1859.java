package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1859 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine());
			
			int num = 0; // 구매 수량
			long price = 0L; // 구매 가격 
			long result = 0L; // 결과값
			long max = 0L; // 최대값
			int arr[] = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; st.hasMoreTokens(); i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			for (int j = arr.length - 1; j >= 0; j--) {
				if (arr[j] > max) {
					result += num * max - price;
					max = arr[j];
					num = 0;
					price = 0L;
				} else {
					num++;
					price += arr[j];
				}
			}
			result += num * max - price;
			System.out.println("#" + test_case + " " + result);
		}
	}
}
//3
//3
//10 7 6
//3
//3 5 9
//5
//1 1 3 1 2


