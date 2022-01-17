
package com.caiomed03.aceptaelreto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class p214 {
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
        boolean hasNext() {
            if (st != null && st.hasMoreTokens()) {
                return true;
            }
            String tmp;
            try {
                br.mark(1000);
                tmp = br.readLine();
                if (tmp == null) {
                    return false;
                }
                br.reset();
            } catch (IOException e) {
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args){
        FastReader sc = new FastReader();
        int nReyes = sc.nextInt();
        
        while (!(nReyes == 0)) {
            ArrayList<String> reyes = new ArrayList<>();
            ArrayList<String> futuros = new ArrayList<>();
            
            for(int i=0; i<nReyes; i++) reyes.add(sc.next());
            int nFuturos = sc.nextInt();
            for(int i=0; i<nFuturos; i++) futuros.add(sc.next());
            
            for(int i=0; i<nFuturos; i++){
                System.out.println(Collections.frequency(reyes, futuros.get(i))+1);
                reyes.add(futuros.get(i));
            }
            System.out.println("");
            nReyes = sc.nextInt();
        }
    }
}
