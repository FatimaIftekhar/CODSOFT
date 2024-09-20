//guess the number game
import java.util.*;
class numbergame
{
    Scanner sc=new Scanner(System.in);
    void game(int n,int score)
    {
        int i=0,guess;
        while(i<5)
        {
            System.out.println("Enter your guess:");
            guess=sc.nextInt();
            if(guess==n)
            {
                System.out.println("Congratulations!! You've guessed the correct number");
                System.out.println("Your score is "+score);
                break;
            }
            else if(guess<n)
            {
                System.out.println("The number is greater than guess");
                score++;
            }
            else if(guess>n)
            {
                System.out.println("The number is lesser than guess");
                score++;
            }
            i++;
        }
        if(i==5)
        {
            System.out.println("Oops! You've exhausted all the tries");
            System.out.println("Do you want to play another round? Press 1 for yes and 0 for no");
            int maybe=sc.nextInt();
            if(maybe==1)
            game(n,score);
            else
            System.out.println("The number was "+n);
        }
    }
    public static void main(String atgs[])
    {
        numbergame ob=new numbergame();
        int n;
        n=1+(int)(100*Math.random());
        System.out.println("Welcome to Number Guessing game!!");
        System.out.println("A number has been chosen between 1 to 100.");
        System.out.println("Be careful while guessing! You only have 5 chances): ");
        ob.game(n,0);
    }
}
