// Tic Tac Toe
import java.util.*;

class TicTacToe 
{
  public static char playAgain()
  {
    // Create a new Scanner object to read from
    // the keyboard.
    Scanner input = new Scanner(System.in);

    System.out.println();
    System.out.print("Do you want to play again (Y,y)?  ");

    // Read in the nextLine of information.
    // Change the input to all uppercase.
    String answer = input.nextLine().toUpperCase();

    // See if answer is equal to "Y" and if
    // so, return 'Y'
    if (answer.equals("Y"))
    {
      return 'Y';
    }
    System.out.println();
    
    // return 'N'
    return 'N';
  }  // end of method


  // This checks to see if player is a winner
  public static boolean isWinner(char [][] board, char player)
  {
    // check for a winner across each row
    for (int r=0; r<3; r++)
    {
      if (board[r][0] == player && 
          board[r][1] == player && 
          board[r][2] == player)
      {
        return true;
      }
    }

    // check for a winner across each column
    for (int c=0; c<3; c++)
    {
      if (board[0][c] == player && 
          board[1][c] == player && 
          board[2][c] == player)
      {
        return true;
      }
    }

    // check for a winner on diagonal (top left to lower right)
    if (board[0][0] == player && 
        board[1][1] == player && 
        board[2][2] == player)
    {
      return true;
    }

    // check for a winner on diagonal (lower left to upper right)
    if (board[2][0] == player && 
        board[1][1] == player && 
        board[0][2] == player)
    {
      return true;
    }

    // if no winner from above checks, then return false
    return false;
  } // end of method isWinner()


  // This sets the board to contain all dashes
  public static void resetBoard(char [][] board)
  {
    // We will loop through row by row
    for (int r=0; r<3; r++)
    {
      // We will now loop through the row r
      for (int c=0; c<3; c++)
      {
        // Assign a '-' to the board rc position
        board[r][c] = '-';
      }
    }
  }

  // This prints the board
  public static void printBoard(char [][] board)
  {
    System.out.println();
    
    // We will loop through row by row
    for (int r=0; r<3; r++)
    {
      System.out.print("row " + (r+1) + " ");

      // We will now loop through the elements on row r
      for (int c=0; c<3; c++)
      {
        // print out the element at the board rc position.
        System.out.print(board[r][c]);
      } // end of for c loop

      // now we will move down to the next row
      System.out.println();
    } // end of for r loop

    System.out.println();
  } // end of method

  public static char makeMove(char [][] board, char player)
  {
    // Create a new Scanner object to read from the keyboard.
    Scanner input = new Scanner(System.in);

    while (true)
    {
      try
      {
        System.out.println(player + ", it is your turn.");
        System.out.print("Enter the row and column (Ex: 1 2 or 12 or Q to quit): ");
        // read in the next line from the keyboard and convert it to uppercase.
        String inputRC = input.nextLine().toUpperCase();

        // Check and see if inputRC is equal to "Q"
        if (inputRC.equals("Q"))
        {
          // return 'Q' to quit
          return 'Q';
        }

        int r = -1;
        int c = -1;

        // check and see if the length of inputRC is 2
        if (inputRC.length() == 2)
        {
          r = inputRC.charAt(0) - '1';
          c = inputRC.charAt(1) - '1';
        }
        else
        {
          // The user may have typed in 1 3 or 2 1
          String[] rc = inputRC.split("\\s+");
          r = Integer.parseInt(rc[0]) - 1;
          c = Integer.parseInt(rc[1]) - 1;
        }
       
        // check if the r and c values are out of bounds (less than 0 or greater than 2)
        if (r < 0 || r > 2 || c < 0 || c > 2)
        {
          System.out.println(player + ", your row or column is not correct.");
        }
        // check if the r c element is equal to '-'
        else if (board[r][c] == '-')
        {
          // Ok to play
          board[r][c] = player;
          printBoard(board);
          break;
        }
        else
        {
          System.out.println(player + ", you have to play on an empty space (-).");
        }
      }
      catch (Exception e1)
      {
        System.out.println(player + ", you have an entry problem. Off the board issue.");
      }

    } // end of while true loop for x

    return 'C';
  } // end of method makeMove()


  public static boolean checkForWinner(char [][] board, char player)
  {
      // See if player is a winner by calling isWinner method
      if (isWinner(board, player))
      {
        System.out.println(player + ", you are the winner!!!");
        System.out.println();
        System.out.println();
    
        // return true to indicate a winner has been determined.
        return true;
      }

    return false;
  }


  public static void main(String[] args) 
  {
    // Create a new Scanner object to read from the keyboard.
    Scanner input = new Scanner(System.in);

    System.out.println("Hello Java Tic Tac Toe!");
    System.out.println();
    System.out.println("Written by Helen Zhou");
    System.out.println();

    System.out.println("Valid positions are 1..3 for the row and the column");
    System.out.println();
    System.out.println();

    // Create the tic tac toe board as a 3x3 char array
    char [][] board = new char[3][3];

    // Call resetBoard to set up the initial board
    resetBoard(board);

    // Call printBoard to display the empty board
    printBoard(board);

    System.out.println();

    char player1 = 'X';
    char player2 = 'O';

    // We will begin playing the game
    while (true)
    {
      System.out.println();

      // player1 will make the move
      char ch = makeMove(board, player1);

      // See if ch is 'Q' to quit
      if (ch == 'Q')
      {
        break;
      }

      // Call checkForWinner to see if player1 has won
      if (checkForWinner(board, player1))
      {
        if (playAgain() == 'N')
        {
          break;
        }
        else
        {
          resetBoard(board);
          printBoard(board);
          continue;
        }
      }

      // player2 will now make the move
      ch = makeMove(board, player2);

      // See if ch is 'Q' to quit
      if (ch == 'Q')
      {
        break;
      }

      // Call checkForWinner to see if player2 has won
      if (checkForWinner(board, player2))
      {
        if (playAgain() == 'N')
        {
          break;
        }
        else
        {
          resetBoard(board);
          printBoard(board);
          continue;
        }
      }

    } // end of while true playing the game

    System.out.println();
    System.out.println("Thanks for playing tic tac toe!!!");
    System.out.println();

  } // end of method main()

} // end of class Main
