package Seed;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1008_AB3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());

        System.out.println(A / B);
    }
}
