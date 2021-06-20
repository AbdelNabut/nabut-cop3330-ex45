/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex45;

import java.io.*;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {
        // ask for name of new file
        // read file
        // make change
        // save changes to new file

        String modifiedFileName;
        String wordToReplace = "utilize";
        String replacementWord = "use";
        File originalFile = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner input = new Scanner(System.in);
        System.out.print("What would you like to name the modified file: ");
        modifiedFileName = input.nextLine();
        File newFile = new File("src/main/java/ex45/" + modifiedFileName + ".txt");
        FileHandler fileHandler = new FileHandler(originalFile);
        fileHandler.replaceWords(wordToReplace, replacementWord, newFile);


    }
}
