import java.util.Random;
import java.util.Scanner;                   // Jason Calle

public class Skee_Ball {

    private final static int MAX_PLAYS=8; // final allows it to not be changed
                                            // static allows it to be initialized
    int getMax_PLAYS()                      // private causes it the member to be accessed only through function
    {
        return MAX_PLAYS;
    }

    public static void main( String[] args)
    {
        Skee_Ball trial = new Skee_Ball(); // creating the object
        int input = trial.check(); // check to see if were in bounds, if yes proceed (if not then your stuck in while loop);
                                    // also number is used for the amount of plays

        int [] input_2 = trial.play(input); // will always return an array of size 8 with its score values
                                            // play function uses hall value
                                            // depending on input it will do the iteration to get hall value

        trial.showStats(input,input_2); // depending on input it will output from the array

    }

        public int hall_Value(int ball_roll)
        {
            int score=0;

            if(ball_roll>94) // 99 ... 94 = 5
                score=80;
            else if(ball_roll<=94 && ball_roll>84) // 94 ... 85 = 10
                score=60;
            else if(ball_roll<=84 && ball_roll>69)  // 84 ... 70 = 15
                score = 15;
            else if(ball_roll<=69 && ball_roll>54) // 69 .. 54 = 15
                score = 15;
            else if(ball_roll<=54 && ball_roll>34) // 54 ... 34 = 20
                score =  20;
            else                // 34 ... 0 = 35
                score = 0;
            return score;
        }

        public int check()
        {
            int num;
            Scanner sc =  new Scanner(System.in);
            System.out.printf(" %n %s", "Enter the number of plays ");
            num = sc.nextInt(); // we insert 3

            while (num > getMax_PLAYS() )
            {
                System.out.printf("%n %s", "Invalid input. PLease enter a number between 1 and 8. \n");
                num = sc.nextInt();
            }

            sc.close();
            return num;
        }
        /*
        takes in the input - from check() to decide how many times to execute
        takes in a random value and then give its score value
         */
        public int [] play(int num) // arr carries 8 different values, and play will output score points d
        {                                               // DEPENDING ON USERS INPUT
            Random rand = new Random();
            int [] temp= new int[8]; // max size temporary

            for(int i=0;i<num;i++)      // will find a scoring value depending on the USER'SINPUT
            {
                temp[i] =rand.nextInt(100); // gets a random number and puts it inside the array
//                System.out.printf("%n %d", temp[i]);
                temp[i] = hall_Value(temp[i]); // we get the random value
            }


            return temp; // we need to return play array to show stats
        }

        public void showStats(int num_1, int [] num_2) // num is gather from user's input in the main menu
        {

            for(int i=0;i<num_1;i++)
            {
//                System.out.printf("%s %d %s %d %n ", "Rolling ball #", i+1,". Landed in ", num_2[i] );
                System.out.printf("Rolling ball # %d. Landed in %d %n", i+1, num_2[i]);
            }

            System.out.printf("%s %n", "+-------+-------+");
            System.out.printf("%s %n", "  play #    score");
            System.out.printf("%s %n", "+-------+-------+");

            int sum =0;
            for(int i=0;i<num_1;i++)
            {
                System.out.printf(" %s %d %s %d %n ", "\t", i+1 ,"\t", num_2[i]);
                sum=sum+num_2[i];
            }

            System.out.printf(" %n %s %d %n","Total: ",sum );

        }

}
