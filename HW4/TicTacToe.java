import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    void game() {
        initMap();
        random = new Random();
        scanner = new Scanner(System.in);
        while (true) {
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        printMap();
        System.out.println("GAME OVER");
    }

    void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                map[i][j] = DOT_EMPTY;
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++)
                System.out.print(map[i][j] + " ");
            System.out.println();
        }
    }
    
    void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }
    
    boolean checkWin(char dt) {
        // check horizontal
        if (map[0][0] == dt && map[1][0] == dt && map[2][0] == dt) return true;
        if (map[0][1] == dt && map[1][1] == dt && map[2][1] == dt) return true;
        if (map[0][2] == dt && map[1][2] == dt && map[2][2] == dt) return true;
        // check vertical
        if (map[0][0] == dt && map[0][1] == dt && map[0][2] == dt) return true;
        if (map[1][0] == dt && map[1][1] == dt && map[1][2] == dt) return true;
        if (map[2][0] == dt && map[2][1] == dt && map[2][2] == dt) return true;
        // check diagonal
        if (map[0][0] == dt && map[1][1] == dt && map[2][2] == dt) return true;
        if (map[2][0] == dt && map[1][1] == dt && map[0][2] == dt) return true;
        return false;
    }
    /* new method
    public static boolean checkLine(int start_x, int start_y, int dx, int dy, String sign)
{
  for (int i = 0; i < DIMENSION; i++)
  {
    if (field[start_x + i * dx][start_y + i * dy] != sign)
      return false;
  }
  return true;
}
 
public static boolean checkWin(String sign)
{
  for (int i = 0; i < DIMENSION; i++)
  {
    // проверяем строки
    if (checkLine(i, 0, 0, 1, sign)) return true;
    // проверяем столбцы
    if (checkLine(0, i, 1, 0, sign)) return true;
  }
  // проверяем диагонали
  if (checkLine(0, 0, 1, 1, sign)) return true;
  if (checkLine(0, DIMENSION - 1, 1, -1, sign)) return true;
  return false;
}*/
    
    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                if (map[i][j] == DOT_EMPTY)
                    return false;
        return true;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE)
            return false;
        return map[y][x] == DOT_EMPTY; // by DSerov
    }
}