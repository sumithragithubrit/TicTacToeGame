package com.tictactoegameproblem;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static  char[] arr = {49,50,51,52,53,54,55,56,57,58};
    static int turn=2;
    static String loop = "start";
    static  int num;
    static int count = 0 ;
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
        char player = 'A';
        char comp = 'A';
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
                    winnerOrTieOrChangeTurn();
                }


            }else {
                Random random = new Random();
                 num = random.nextInt(9) + 1;
                if(arr[num-1]=='X' || arr[num-1]=='O') {
                   // System.out.println("This position is not empty");
                }else {
                    arr[num - 1] = comp;
                    showBoard();
                    turn++;
                    winnerOrTieOrChangeTurn();
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

     public static void winnerOrTieOrChangeTurn() {
         if (arr[0] == 'X' && arr[1] == 'X' && arr[2] == 'X' || arr[0] == 'X' && arr[3] == 'X' && arr[6] == 'X'
                 || arr[1] == 'X' && arr[4] == 'X' && arr[7] == 'X'|| arr[2] == 'X' && arr[5] == 'X' && arr[8] == 'X'
                 || arr[3] == 'X' && arr[4] == 'X' && arr[5] == 'X' || arr[6] == 'X' && arr[7] == 'X' && arr[8] == 'X'
                 || arr[0] == 'X' && arr[4] == 'X' && arr[8] == 'X' || arr[6] == 'X' && arr[4] == 'X' && arr[2] == 'X')
         {

             System.out.println("Player is winner");
             turn = 15 ;

         } else if (arr[0] == 'O' && arr[1] == 'O' && arr[2] == 'O' || arr[0] == 'O' && arr[3] == 'O' && arr[6] == 'O'
                 || arr[1] == 'O' && arr[4] == 'O' && arr[7] == 'O'|| arr[2] == 'O' && arr[5] == 'O' && arr[8] == 'O'
                 || arr[3] == 'O' && arr[4] == 'O' && arr[5] == 'O' || arr[6] == 'O' && arr[7] == 'O' && arr[8] == 'O'
                 || arr[0] == 'O' && arr[4] == 'O' && arr[8] == 'O' || arr[6] == 'O' && arr[4] == 'O' && arr[2] == 'O')
         {
             System.out.println("computer is winner is winner");
             turn = 15 ;

         }

         else if ( turn == 11 ) {

             System.out.println("Tie the game ");
             turn = 15 ;
         }
     }
}
