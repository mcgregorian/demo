import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static Scanner sc= new Scanner(System.in);
    public static Random rand =new Random();
    public static String words[]={"kot","nabuchodonozor","konstantynopol","deoksyryboza","anemia","debilizm","ortodonta","patologia"};
    public static int which = rand.nextInt(words.length);
    public static String word=words[which];
    public static char guessword[]=word.toCharArray();
    public static char board[]=new char[guessword.length];
public static int death=0;
public static String in=" ";






    public static void main(String args[]){

        for(int i=0;i<guessword.length;i++){
            if(i==0)
                board[0]=guessword[0];
        else
            board[i]='*';}
        System.out.println(board);

        while(checkString(in)==false){
            in=sc.next();
            play(in);
        }




    }

    public static boolean checkString(String str){
        boolean result=false;
                char cr[]=str.toCharArray();

        if(cr.length==guessword.length){

                if(str.equals(word)){
                                        result=true;}
                else{

                    result=false;
                }

        }
        else{
            char ch=str.charAt(0);
            String debil2 = new String(board);
            for(int i=1;i<guessword.length;i++){
                if(ch==guessword[i]){
                    board[i]=ch;
                    result=false;
                    continue;
                }
                if(debil2.equals(word)){
                    result=true;
                }
                else{

                    result=false;
                }

            }


        }
        return result;

    }

    public static void play(String str){
                char cr[]=str.toCharArray();
        if(cr.length==guessword.length){
                if(str.equals(word)){
                    System.out.println("Congratulations ! You won !");

                    }
                else{
                    death++;
                    System.out.println("Wrong");
                    System.out.println(board);
                    draw();

                }

        }
        else{
            char ch=str.charAt(0);

            for(int i=1;i<guessword.length;i++){
                if (guessword[i]==ch)
                {
                    board[i]=ch;

                    continue;


                }
            }
            String debil=Character.toString(ch);
            String debil2 = new String(board);
            System.out.println(board);
            String debil3=word.substring(1,word.length());
            if(!debil3.contains(debil)){
                death++;
                System.out.println("Wrong");
                draw();
                }
            if(debil2.equals(word)){
                System.out.println("Congratulations ! You won !");

            }
        }





        }

        public static void draw(){
        if(death==1){
            System.out.println("_______________");
        }
        else if(death==2){
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
        }
        else if(death==3){
            System.out.println("_________");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
        }
        else if(death==4){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");

        }
        else if(death==5){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");

        }
        else if(death==6){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
        }
        else if(death==7){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|       /");
            System.out.println("|      / ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
        }
        else if(death==8){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|");
            System.out.println("|      / |");
            System.out.println("|       /");
            System.out.println("|      / ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
        }
        else if(death==9){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|\\");
            System.out.println("|      / | \\ ");
            System.out.println("|       /");
            System.out.println("|      / ");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
        }
        else if(death==10){
            System.out.println("_________");
            System.out.println("|        |");
            System.out.println("|        |");
            System.out.println("|        O");
            System.out.println("|       /|\\");
            System.out.println("|      / | \\ ");
            System.out.println("|       / \\");
            System.out.println("|      /   \\");
            System.out.println("|");
            System.out.println("|");
            System.out.println("|_______________");
            System.out.println("\n" + "You lost!");
            System.exit(0);
        }

        }



}
