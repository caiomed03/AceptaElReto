
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p261 {
    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int casosPrueba = sc.nextInt();
        
        for (int i = 0; i < casosPrueba; i++) {
            int n = sc.nextInt(), caraVisible = sc.nextInt();
            
            if(n<1000-6){
                System.out.println("GANA");
            }
            else{
                if(n==999){
                    System.out.println("PIERDE");
                }
                else if(n<999 && caraVisible != 6){
                    System.out.println("");
                }
            }
        }
    }
}
