package main;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        FileWriter fw =null;
        File file = new File("SNV_c1.txt");
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader("SNV_c.txt"));
            fw = new FileWriter(file);
            String tmp = "";
            while ((tmp = br.readLine())!=null){
                String s[] = tmp.split("\\s+");
                double sum = 0;
                for (int i = 1; i < s.length; i ++) {
                    char number[]=s[i].toCharArray();
                    for(char n : number) {
                        int k=2;
                        int j=9;
                        if (Integer.parseInt(String.valueOf(n)) == k || Integer.parseInt(String.valueOf(n)) == j) {
                            fw.write(s[0].toUpperCase() + " \n");
                        }
                    }
                }

            }
            System.out.println("Смотри SNV_c1.txt");

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(fw!=null){
                try{
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

