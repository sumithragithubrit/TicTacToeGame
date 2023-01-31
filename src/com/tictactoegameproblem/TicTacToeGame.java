package com.tictactoegameproblem;
import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
        System.out.println("Welcome in tic tac toy ");
       createEmptyBoard();
       allowPlayer();
    }
    public static void createEmptyBoard(){
        char[] sizeOfBoard = new char[10];
        System.out.println(" ____________");
        for (int i = 1; i <10; i++){
            System.out.print("|___");
            if (i % 3 == 0) {
                System.out.println("|");
            }
        }

    }
    public static void allowPlayer(){
        System.out.println("Enter your choice if wont 'X' then press 1 & if you wont 'O' then press 2");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if ( choice == 1){
            System.out.println(" player => x");
            System.out.println("Computer => O");
        } else if (choice == 2) {
            System.out.println(" player => O");
            System.out.println("Computer => X");
        }

    }

}
