package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17425 {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int fn = 0;
        int num = 0;
        long gn;

        for (int i = 0; i < N; i++) {
            gn = 0;
            fn = Integer.parseInt(br.readLine());

            for (int j = 1; j <= fn; j++) {
                num = fn/j;
                gn += num * j;
            }

            System.out.println(gn);
        }

    }

    public static void main(String[] args) throws IOException {
        new _17425().solution();
    }
}

// If n이 10이면 10 이하의 수들의 각 약수의 합을 구하면 됨
// 10/1 * 1, 10/2 * 2 10/3 10/4...
//