import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] board = {'1','2','3','4','5','6','7','8','9'};
        char player = 'X';

        for(int turn=0; turn<9; turn++) {

            System.out.println();
            System.out.println(board[0]+" | "+board[1]+" | "+board[2]);
            System.out.println("--+---+--");
            System.out.println(board[3]+" | "+board[4]+" | "+board[5]);
            System.out.println("--+---+--");
            System.out.println(board[6]+" | "+board[7]+" | "+board[8]);

            System.out.print("Player " + player + " enter position: ");
            int pos = sc.nextInt();

            if(pos < 1 || pos > 9) {
                System.out.println("Invalid Position!");
                turn--;
                continue;
            }

            if(board[pos-1]=='X' || board[pos-1]=='O') {
                System.out.println("Already Filled!");
                turn--;
                continue;
            }

            board[pos-1] = player;

            if(
                (board[0]==player && board[1]==player && board[2]==player) ||
                (board[3]==player && board[4]==player && board[5]==player) ||
                (board[6]==player && board[7]==player && board[8]==player) ||
                (board[0]==player && board[3]==player && board[6]==player) ||
                (board[1]==player && board[4]==player && board[7]==player) ||
                (board[2]==player && board[5]==player && board[8]==player) ||
                (board[0]==player && board[4]==player && board[8]==player) ||
                (board[2]==player && board[4]==player && board[6]==player)
            ) {
                System.out.println("Player " + player + " Wins!");
                break;
            }

            player = (player=='X') ? 'O' : 'X';
        }

        sc.close();
    }
}
