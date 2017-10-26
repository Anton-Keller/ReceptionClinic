package view;

import logic.*;
import java.util.Scanner;

public class StartProgram {

    public static void main(String[] args) {

      Controller controller = new Controller();
      Scanner read = new Scanner(System.in);
      boolean flagExit = false;


        do {

            controller.showMenu();
            int index = read.nextInt();
            flagExit = controller.commandFunction(index);

        } while (flagExit == false);

    }

}
