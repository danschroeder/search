/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.io.*;
import java.util.*;

/**
 *
 * @author danielschroeder
 */


public class Search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        Scanner fin = null;
        try {
            fin = new Scanner(new File(args[1]));
        } catch (FileNotFoundException x) {
            System.out.println("File open failed.");
            x.printStackTrace();
            System.exit(0);
        }
        String newLine = fin.nextLine(), word;
        Puzzle myPuzzle = new Puzzle(newLine.length());
        while (newLine != "") {
            myPuzzle.AddLine(newLine);
            newLine = fin.nextLine();
        }
        myPuzzle.PrintPuzzle();
        while (fin.hasNextLine()){
            word = fin.nextLine();
            myPuzzle.SearchFor(word);
        }
       

    }

}
