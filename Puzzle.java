/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

/**
 *
 * @author danielschroeder
 */
public class Puzzle {
    private int length, index;
    private char[][] puzzleArray;
    Puzzle (int size){
        length = size;
        index = 0;
    }  
    public void AddLine(String newLine) {
        
        for (int i = 0; i < length;i++){
            puzzleArray[index][i] = newLine.charAt(i);
        }
        index++;
    }
    public void SearchFor(String word){
        
    }
    public void PrintPuzzle(){
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
            System.out.print(puzzleArray[i][j]);
        }
            System.out.println();
        }
    }
}
