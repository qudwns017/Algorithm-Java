package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978 {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 1000;
        int cnt = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        boolean[] prime = new boolean[1001];
        prime[0] = prime[1] = true;

        for (int i = 2; i*i<=N; i++) {
            if (!prime[i]) {
                for (int j = i*i; j<=N; j+=i) {
                    prime[j]=true;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < cnt; i++) {
            if (!prime[Integer.parseInt(st.nextToken())]) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException {
        new _1978().solution();
    }
}

// 0과 1은 소수가 아니므로 true, 소수는 false.