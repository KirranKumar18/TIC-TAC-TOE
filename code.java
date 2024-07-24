import java.util.Scanner;
class board {
    public void arr() {
        System.out.println("-0-|-1-|-2-");
        System.out.println("-3-|-4-|-5-");
        System.out.println("-6-|-7-|-8-");
    }
}
class GetIp {
    public void input(char[][] arr, char p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player " + p);
        char ip = sc.next().charAt(0);
        switch (ip) {
            case '0':
            if(arr[0][0]=='-')
                arr[0][0] = p;
                else
                System.out.println("invalid");
                break;
            case '1':
            if(arr[0][1]=='-')
                arr[0][1] = p;
                else
                System.out.println("invalid");
                break;
            case '2':
            if(arr[0][2]=='-')
                arr[0][2] = p;
                else
                System.out.println("invalid");
                break;
            case '3':
            if(arr[1][0]=='-')
                arr[1][0] = p;
                else
                System.out.println("invalid");
                break;
            case '4':
            if(arr[1][1]=='-')
                arr[1][1] = p;
                else
                System.out.println("invalid");
                break;
            case '5':
            if(arr[1][2]=='-')
                arr[1][2] = p;
                else
                System.out.println("invalid");
                break;
            case '6':
            if(arr[2][0]=='-')
                arr[2][0] = p;
                else
                System.out.println("invalid");
                break;
            case '7':
            if(arr[2][1]=='-')
                arr[2][1] = p;
                else
                System.out.println("invalid");
                break;
            case '8':
            if(arr[2][2]=='-')
                arr[2][2] = p;
                else
                System.out.println("invalid");
                break;
            default:
                System.out.println(p+" Play properly ");
                return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    } }


class Checking extends GetIp {
    public boolean checkWin(char p, char[][] arr) {
        // hori
        for (int i = 0; i < 3; i++) {
            if (arr[i][0]==p && arr[i][1]==p && arr[i][2]==p) {
                return true;
            }
        }

        //veri
        for (int i = 0; i < 3; i++) {
            if (arr[0][i]==p && arr[1][i]==p && arr[2][i]==p) {
                return true;
            }
        }
        //diag
        if (arr[0][0]==p && arr[1][1]==p && arr[2][2]==p) {
            return true;
        }
        if (arr[0][2]==p && arr[1][1]==p && arr[2][0]==p) {
            return true;
        }
        return false;
    }
}

public class code {
    public static void main(String[] args) {
        boolean game = true;
        board pb = new board();
        GetIp gp = new GetIp();
        Checking chk = new Checking();
        char p1 = 'X';
        char p2 = 'O';
        char toPlay = p1;
        char[][] arr = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};

        pb.arr();
        System.out.println("start game");

        while (game) {
            gp.input(arr, toPlay);
            if (chk.checkWin(toPlay, arr)) {
                game = false;
            } else {
                toPlay = (toPlay == p1) ? p2 : p1;
                
            }
       }
        System.out.println("Player" + toPlay + " wins!!!!"+"Booyah!!!! Winner winner chiken dinner");
    }
}