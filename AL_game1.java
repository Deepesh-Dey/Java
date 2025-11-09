// Rock , Paper , and Scissors ----GAME----
import java.util.Scanner;
import java.util.Random;
public class AL_game1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = 1, w = 0, l = 0, d = 0,f = 0;
        String ch ="Y";
        while (true){
            int a = random.nextInt(3)+1;
            System.out.println("Enter:\n1:Rock\n2:Paper\n3:Scissor");
            int x = sc.nextInt();
            if (x==1 || x==2 || x==3){
                if (a==x){
                    d++;
                    switch(a){
                        case 1:
                            System.out.println("PC Chooses Rock");
                            break;
                        case 2:
                            System.out.println("PC Chooses Paper");
                            break;
                        case 3:
                            System.out.println("PC Chooses Scissor");
                            break;
                        default:
                            continue;
                    }
                    System.out.println("Draw");
                    System.out.printf("Current Score:\nWin=%d And Loss=%d",w,l);
                }
                else if ((a==1 && x==2) || (a==2 && x==3) || (a==3 && x==1)){
                    w++;
                    switch(a){
                        case 1:
                            System.out.println("PC Chooses Rock");
                            break;
                        case 2:
                            System.out.println("PC Chooses Paper");
                            break;
                        case 3:
                            System.out.println("PC Chooses Scissor");
                            break;
                        default:
                            continue;
                    }
                    System.out.println("You Win");
                    System.out.printf("Current Score:\nWin=%d And Loss=%d",w,l);
                }
            else{
                l++;
                switch(a){
                        case 1:
                            System.out.println("PC Chooses Rock");
                            break;
                        case 2:
                            System.out.println("PC Chooses Paper");
                            break;
                        case 3:
                            System.out.println("PC Chooses Scissor");
                            break;
                        default:
                            continue;
                    }
                    System.out.println("You Loss");
                    System.out.printf("Current Score:\nWin=%d And Loss=%d",w,l);
            }


            }
            else{
                System.out.println("Foul\nlosses one point");
                l++;
                f++;
            }
            i++;
            System.out.printf("\nDo you want to play round %d:(y/n)\n",i);
            ch = sc.next();
            if (ch.equalsIgnoreCase("y")){
                continue;
            }
            break;
        } 
        System.out.printf("\nThat was a nice game\nTotal Rounds:%d\nFinal Score:\nWin=%d | Loss=%d | Draws=%d\n",i-1,w,l,d);
        System.out.printf("contains %d fouls\n",f);
        if (w>l){
            System.out.println("\nYou won the Tournament\n");
        }
        else if (w==l){
            System.out.println("\nDraw\n");
        }
        else{
            System.out.println("\nYou Lost the Tournament\n");
        }

    }
}