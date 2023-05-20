import java.util.Scanner;

public class tic_tac_toe {
    public static void board(String[] bor) {
        System.out.println("|-----------|");
        System.out.println("|-" + bor[0] + "-|-" + bor[1] + "-|-" + bor[2] + "-|");
        System.out.println("|-----------|");
        System.out.println("|-" + bor[3] + "-|-" + bor[4] + "-|-" + bor[5] + "-|");
        System.out.println("|-----------|");
        System.out.println("|-" + bor[6] + "-|-" + bor[7] + "-|-" + bor[8] + "-|");
        System.out.println("|-----------|");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0,slot1,slot2;
        String[] value = new String[9];
        int[] check = new int[10];
            for (int b = 0; b < 9; b++) {
                int d = b + 1;
                String e = Integer.toString(d);
                value[b] = e;
        }
            board(value);
        int end=0, number_check=0;
        while(end==0){
            if(i%2==0){
                System.out.print("X's turn \nEnter a slot no : ");
                slot1=in.nextInt();
                if(check[0]==slot1 || check[1]==slot1 || check[2]==slot1 || check[3]==slot1 ||check[4]==slot1 ||check[5]==slot1 ||check[6]==slot1 ||check[7]==slot1 ||check[8]==slot1 ||check[9]==slot1)
                {
                    System.out.println("Invalid input \n"+slot1+" is already given");
                }
                else {
                    value[slot1 - 1] = "X";
                    board(value);
                    i++;
                    check[number_check] = slot1;
                    number_check++; // 8+1=9
                }
            }
            else{
                System.out.print("O's turn \nEnter a slot no : ");
                slot2 = in.nextInt();
                if(check[0]==slot2 || check[1]==slot2 || check[2]==slot2 || check[3]==slot2 ||check[4]==slot2 ||check[5]==slot2 ||check[6]==slot2 ||check[7]==slot2 ||check[8]==slot2 ||check[9]==slot2)
                {
                    System.out.println("Invalid input \n"+slot2+" is already given");
                }
                else {
                    value[slot2 - 1] = "O";
                    board(value);
                    i++;
                    check[number_check] = slot2;
                    number_check++;
                }
            }
            if ( value[0].equals("X") && value[1].equals("X") && value[2].equals("X") ||value[3].equals("X") && value[4].equals("X") && value[5].equals("X") || value[6].equals("X") && value[7].equals("X") && value[8].equals("X") || value[0].equals("X") && value[3].equals("X") && value[6].equals("X") || value[1].equals("X") && value[4].equals("X") && value[7].equals("X") || value[2].equals("X") && value[5].equals("X") && value[8].equals("X") || value[0].equals("X") && value[4].equals("X") && value[8].equals("X") || value[2].equals("X") && value[4].equals("X") && value[6].equals("X"))
            {
                System.out.println("Congratulations....! \nPlayer X wins the game");
                end++;
                number_check--;
            }
            if ( value[0].equals("O") && value[1].equals("O") && value[2].equals("O") ||value[3].equals("O") && value[4].equals("O") && value[5].equals("O") || value[6].equals("O") && value[7].equals("O") && value[8].equals("O") || value[0].equals("O") && value[3].equals("O") && value[6].equals("O") || value[1].equals("O") && value[4].equals("O") && value[7].equals("O") || value[2].equals("O") && value[5].equals("O") && value[8].equals("O") || value[0].equals("O") && value[4].equals("O") && value[8].equals("O") || value[2].equals("O") && value[4].equals("O") && value[6].equals("O"))
            {
                System.out.println("Congratulations....! \nPlayer O wins the game");
                end++;
                number_check--;
            }
            if(number_check>8){
                System.out.println("It's a draw.....!");
                end++;
            }
        }
    }
}