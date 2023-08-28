package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17427 {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
//        int result = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    cnt += j;
                }
            }
            cnt += i;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) throws IOException {
        new _17427().solution();
    }
}

// f(A) : A의 모든 약수의 합
// N=3이면 f(1) + f(2) + f(3)
// 반복문으로 약수를 구해야됨
// 약수 구하는 법
// for (int i = 1; i <= N; i++)
//      for (

// for (int j = 1; i <= j / 2; i++) {
//      if (j % i == 0) {
//          cnt += i
//      }
// } cnt += i;