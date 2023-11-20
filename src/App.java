import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int poäng = 0;

        System.out.println("Hur många hästraser finns det i hela världen? \n 1. ca 100 \n 2. ca 300 \n 3. ca 450");
        int x1 = tangentbord.nextInt();

        while(x1>3 || x1<1){
            System.out.println("Du skrev in ett ogiltigt tal \nFörsök igen: ");
            System.out.println("Hur många hästraser finns det i hela världen? \n 1. ca 100 \n 2. ca 300 \n 3. ca 450");
            int x = tangentbord.nextInt();
            x1 = x;
        }

        if(x1==2){
            poäng++;
        }

        System.out.println("");

        System.out.println("Hur många fågelarter finns det i hela världen? \n 1. ca 6'000 \n 2. ca 9'000 \n ca 3. 11'000");
        int x2 = tangentbord.nextInt();

        while(x2>3 || x2<1){
            System.out.println("Du skrev in ett ogiltigt tal \nFörsök igen: ");
            System.out.println("Hur många hästraser finns det i hela världen? \n 1. ca 6'000 \n 2. ca 9'000 \n 3. ca 11'000");
            int x = tangentbord.nextInt();
            x2 = x;
        }

        if(x2==3){
            poäng++;
        }

        System.out.println("");

        System.out.println("Du fick "+poäng+"/2 rätt");


    }
}
