package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17427_drainage {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            cnt = N/i;
            sum += cnt * i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        new _17427_drainage().solution();
    }
}

// N 이하 자연수의 약수의 합을 구하는 것이 목표.
// 시간 복잡도를 최적화 시키려면 약수가 아닌 배수로 접근해야함.
// N/i로 각 자연수가 해당하는 약수의 개수를 구하면 됨
// for문으로 1부터 N까지 반복
// N/1=10000 이고 이걸 cnt에 더함
// 즉 a = N/i, cnt = cnt + a*i