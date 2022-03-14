/*
* Assignment <Project 5>
* Description: <This is a TicTacToe Program that two players can play using arrays to hold each user input>
* Name: <Damien Hosea>
* ID: <921395901>
 */

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'}; //Place numbers 1-9 into the gameboard array
        char turn = 'A';   // starts with 'O'
        //Call the isGameOver method to declare a winner.
        while(true) {
            display(board);
            int userChoice = receiveUserChoice(turn, input);
            board[userChoice] = turn;
            //System.out.println(turn);
            if (turn == 'A') {
                turn = 'B';
            } else {
                turn = 'A';
            }
            if (isGameOver(board)){
                break;
            }
//            reset(board);
        }
    }

    public static void display(char[] board) {
        System.out.println(board[0] + ", " + board[1] + ", " + board[2]);
        System.out.println(board[3] + ", " + board[4] + ", " + board[5]);
        System.out.println(board[6] + ", " + board[7] + ", " + board[8]);
    }

    public static int receiveUserChoice(char turn, Scanner input) {
        System.out.print(turn + " turn:");
        turn = (char)(input.nextInt() - 1);
        return turn;
    }

//    public static void reset(char[] chars){
//        for(int i = 0; i < chars.length; ++i){
//            chars[i] = (char)(i+1);
//        }
//    }
    /*
    The Method isGameOver - In the isGameOver method, I use a series of if statements that will check to see
    if the win conditions are met by checking to see if there is a row of letter A or a row of letter B. The winner
    is declared along with the game board being displayed.
     */
    public static boolean isGameOver(char[] board) {

            if (board[0] == 'A' && board[1] == 'A' && board[2] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[3] == 'A' && board[4] == 'A' && board[5] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[6] == 'A' && board[7] == 'A' && board[8] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[0] == 'A' && board[3] == 'A' && board[6] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[1] == 'A' && board[4] == 'A' && board[7] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[2] == 'A' && board[5] == 'A' && board[8] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[0] == 'A' && board[4] == 'A' && board[8] == 'A') {
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[2] == 'A' && board[4] == 'A' && board[6] == 'A'){
                System.out.println("Player A Wins");
                display(board);
                return true;
            } else if (board[0] == 'B' && board[1] == 'B' && board[2] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else if (board[3] == 'B' && board[4] == 'B' && board[5] == 'B') {
                System.out.println("Players B Wins");
                display(board);
                return true;
            } else if (board[6] == 'B' && board[7] == 'B' && board[8] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else if (board[0] == 'B' && board[3] == 'B' && board[6] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else if (board[1] == 'B' && board[4] == 'B' && board[7] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else if (board[2] == 'B' && board[5] == 'B' && board[8] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else if (board[0] == 'B' && board[4] == 'B' && board[8] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else if (board[2] == 'B' && board[4] == 'B' && board[6] == 'B') {
                System.out.println("Player B Wins");
                display(board);
                return true;
            } else {
                return false;
            }
        }
}
