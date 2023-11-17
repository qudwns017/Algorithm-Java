package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			int[] arr = new int[101];
			String testNumber = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for (int j = 0; st.hasMoreTokens(); j++) {
				arr[Integer.parseInt(st.nextToken())] += 1;
			}
			
			int max = Arrays.stream(arr).max().getAsInt();
			int result = 0;
			for (int k = 100; k >= 0; k--) {
				if (arr[k] == max) {
					result = k;
					break;
				}
			}
			
			System.out.println("#" + testNumber + " " + result);
		}
	}
}

// 수들을 배열에 담고
// arr[i]의 값을 ++함
// 최댓값의 인덱스를 가져와야함
// 최대값을 구하고
// 100부터 역순으로 최대값과 똑같은 값을 가진 값의 index 반환