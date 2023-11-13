import java.awt.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create parts
        //load robot
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        String input = scanner.nextLine();
        Robot robot = new Robot();
        robot.Build(input);

        //assign keybinds
        //calc physics
        //draw bot
        Window window = new Window();




    }
}