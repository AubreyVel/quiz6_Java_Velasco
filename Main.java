import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);  
        
        boolean quit = false;

        System.out.println("Input name of canidate 1:");
        String can1 = newScanner.nextLine();

        System.out.println("Input name of canidate 2:");
        String can2 = newScanner.nextLine();
        
        while (quit == false) {
            System.out.println("Who do you want to vote? (1 for "+can1+" 2 for "+can2+")");
            int vote = newScanner.nextInt();
            int vote1 = 0;
            int vote2 = 0;
            double percent1 = 0;
            double percent2 = 0;
            int count = 0;
            switch (vote) {
                case 0:
                percent1 = count / vote1;
                percent2 = count / vote2;
                    System.out.println("Final result:\n"+can1+" "+percent1+"\n"+can1+" "+percent2+"\n");
                    quit = true;
                    break;
                case 1:
                System.out.println("Voted for "+can1);
                count ++;
                vote1 ++;
                System.out.println("Voting result:")
                System.out.println("Who do you want to vote? (1 for "+can1+" 2 for "+can2+")");
                vote = newScanner.nextInt();
                    break;
                case 2:
                System.out.println("Voted for "+can2);
                count ++;
                vote2 ++;
                System.out.println("Voting result:")

                System.out.println("Who do you want to vote? (1 for "+can1+" 2 for "+can2+")");
                vote = newScanner.nextInt();
                
                    break;
                default:
                System.out.println("Not a valid canidate")
                    break;
                    //shouldve just mad a method, wouldve been easier
            }
        }
    }
  }