package com.tictactoegameproblem;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static  char[] arr = {49,50,51,52,53,54,55,56,57,58};
    static int turn=2;
    public static void main(String[] args) {
        System.out.println("Welcome in tic tac toy ");
       createEmptyBoard();
       allowPlayer();

    }
    public static void createEmptyBoard(){

        System.out.println(" ____________");
        for (int i = 1; i <=9; i++){
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
        char player = 0;
        char comp = 0;
        if ( choice == 1){
            System.out.println(" player => x");
            System.out.println("Computer => O");
            player='X';
            comp='O';
        } else if (choice == 2) {
            System.out.println(" player => O");
            System.out.println("Computer => X");
            player='O';
            comp='X';
        }
        whoPlayFirst();
        while(turn!=15) {

            makeMove(player, comp);
        }
    }
    public static void showBoard(){

        System.out.println(" ____________");
        for (int i = 1; i <=9; i++){
            System.out.print("|_"+arr[i-1]+"_");
            if (i % 3 == 0) {
                System.out.println("|");
            }
        }
    }
    public static void makeMove(char player,char comp){
        Scanner sc = new Scanner(System.in);

            if ( turn%2==0){
                System.out.println(" player enter your position number in between 1 to 9 ");
                int num = sc.nextInt();
                if(arr[num-1]=='X' || arr[num-1]=='O'){
                    System.out.println("This position is not empty");

                }else {
                    arr[num-1]=player;
                    showBoard();
                    turn++;
                }


            }else {
                Random random = new Random();
                int num = random.nextInt(10) + 1;
                if(arr[num-1]=='X' || arr[num-1]=='O') {
                    System.out.println("This position is not empty");
                }else {
                    arr[num - 1] = comp;
                    showBoard();
                    turn++;
                }

            }

    }
    public static void whoPlayFirst(){
        Random num = new Random();
        int random= num.nextInt(2) +1;
        Scanner sc = new Scanner(System.in);
        System.out.println("I am doing a toss choose head or tail\n press 1 for Head & press 2 for Tail");
        int choice = sc.nextInt();
        if (random == choice){
            System.out.println("Heads");

        }else if (random ==choice){
            System.out.println("tail");
        }else {
            System.out.println("Choose correct option 1 or 2");
        }
    }

}
