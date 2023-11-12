package baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1037 {
    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Total = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[st.countTokens()];
        int i = 0;
        int Min, Max;

        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Min = Arrays.stream(arr).min().getAsInt();
        Max = Arrays.stream(arr).max().getAsInt();

        System.out.println(Min*Max);
    }

    public static void main(String[] args) throws IOException{
        new _1037().solution();
    }
}
