package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        for (int i = 1; i <=5 ; i++) {
            File file = new File(args[1]+i);
            FileWriter fw = new FileWriter(args[2]+i+".csv");
            Scanner buff = new Scanner(new FileReader(file));
            while (buff.hasNextLine()){
                String line = buff.nextLine();
                if (line.indexOf("\t")!=-1)
                fw.write(line.substring(0,line.indexOf("\t")).replace(" ",args[0])+line.substring(line.indexOf("\t"),line.length()).replace("\t",args[0])+"\n");
            }
        }
    }
}
