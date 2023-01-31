package com.tictactoegameproblem;

public class TicTacToeGame {

	 public static void main(String[] args) {
	        System.out.println("Welcome in tic tac toy ");
	       createEmptyBoard();
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

}
