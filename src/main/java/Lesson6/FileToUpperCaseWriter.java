package Lesson6;

import java.io.*;

        public class FileToUpperCaseWriter {
            public static void main (String[] args)  {
                try{
                String fileIn = "..\\data.txt\\data.txt";
                File fileOut = new File("output.txt");
                if (!fileOut.exists()) {
                    fileOut.createNewFile();}
                char CharCounter = 0;
                BufferedReader in = (new BufferedReader(new FileReader(fileIn)));
                PrintWriter out = (new PrintWriter(new FileWriter(fileOut)));
                int ch;
                while ((ch = in.read()) != -1){

                    if (Character.isLowerCase(ch)){
                        ch= Character.toUpperCase(ch);

                    }
                    out.write(ch);


                }
                in.close();
                out.close();
            } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }}






