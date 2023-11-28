package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6588 {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = 1000000;
        int n;
        boolean isPrime[] = new boolean[size + 1];
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= size; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= size; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        while ((n = Integer.parseInt(br.readLine())) != 0) {
            for (int i = 2; i <= n / 2; i++) {
                if (!isPrime[i] && !isPrime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new _6588().solution();
    }
}
//8
//20
//42
//987844
//738292
//987262
//997846
//0

// 에라토스테네스의 체를 이용하여 n의 약수 판별(약수면 false)
// 가장 큰 값을 기준으로 작은 값을 더해나가기 시작하기
// 두 수의 합이 n보다 커진다면 큰 값 앞의 값 가져오기