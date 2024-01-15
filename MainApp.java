package ComponentAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        Scanner scanner =new Scanner(System.in);
        System.out.println("1. Cricket");
        System.out.println("2. Chess");
        System.out.println("3. Video-Game");
        System.out.println("Enter your choice");
         int choice =scanner.nextInt();

         Game game=null;
         switch (choice){
             case 1:
                 game=context.getBean("t20Cricket",Cricket.class);
                 break;
             case 2:
                 game=context.getBean("chess", Chess.class);
                 break;
             case 3:
                 game=context.getBean("videoGame", VideoGame.class);
                 break;
             case 4:
                 System.out.println("Invalid choice");
         }
         if(game!=null){
             game.getGameInformation();
             game.getGameType();
         }
         else {
             System.out.println("Something went wrong");
         }
    }
}
