package Util;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {

    public Reader(){

    }

    public ArrayList readCsv(String arquivo, String delimitador){
        ArrayList<String[]> matriz = new ArrayList();
        try{
            Scanner scanner = new Scanner(new File(arquivo));
            scanner.useDelimiter("\n");

            while (scanner.hasNext()){
                String[] line = scanner.next().split(delimitador);
                matriz.add(line);
            }
            scanner.close();

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return matriz;
    }

}
