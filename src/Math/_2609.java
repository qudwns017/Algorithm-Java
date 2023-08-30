package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2609 {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }
    public static void main(String[] args) throws IOException{
        new _2609().solution();
    }
}
