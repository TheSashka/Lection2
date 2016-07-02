package com.gribkov.spb.projects.LaunchTestPrograms;

import com.epam.spb.lection2.*;

import java.util.Scanner;

/**
 * Created by alexandrgribkov on 01.07.16.
 */
public class LaunchTestPrograms
{
    private static void information()
    {
        System.out.println("Нажмите заданную клавишу, чтобы запустить нужную программу\n" +
                "1. - ArgumentsExample\n" +
                "2. - AutoPack\n" +
                "3. - BitExample\n" +
                "4. - BitOperations\n" +
                "5. - CharsTest\n" +
                "6. - ClassExample\n" +
                "7. - CoverClasses\n" +
                "8. - DataTypes\n" +
                "9. - Import\n" +
                "10. - InstanceOf\n" +
                "11. - LogicOperations\n" +
                "12. - Operators\n" +
                "13. - StringTransformation\n" +
                "14. - UnaryOperators\n");
    }

    public static void main(String []args)
    {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        String []temp = {"one", "two", "three"};
        information();
        while (isRunning)
        {
            String text = scanner.nextLine();

            switch (text)
            {
                case "1":
                    ArgumentsExample.main(temp);
                    continueProgram();
                    break;
                case "2":
                    AutoPack.main(null);
                    continueProgram();
                    break;
                case "3":
                    BigExample.main(null);
                    continueProgram();
                    break;
                case "4":
                    BitOperations.main(null);
                    continueProgram();
                    break;
                case "5":
                    CharsTest.main(null);
                    continueProgram();
                    break;
                case "6":
                    ClassExample.main(null);
                    continueProgram();
                    break;
                case "7":
                    CoverClasses.main(null);
                    continueProgram();
                    break;
                case "8":
                    DataTypes.main(null);
                    continueProgram();
                    break;
                case "9":
                    Import.main(null);
                    continueProgram();
                    break;
                case "10":
                    InstanceOf.main(null);
                    continueProgram();
                    break;
                case "11":
                    LogicOperations.main(null);
                    continueProgram();
                    break;
                case "12":
                    Operators.main(null);
                    continueProgram();
                    break;
                case "13":
                    StringTransformation.main(null);
                    continueProgram();
                    break;
                case "14":
                    UnaryOperators.main(null);
                    continueProgram();
                    break;
                case "help":
                    information();
                    break;
                case "quit":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Ошибочное значение. Попробуйте снова.");
                    break;
            }
        }
    }

    private static void continueProgram()
    {
        System.out.println();
        System.out.println("Для продолжения нажмите нужную клавиу и запустится новая программа.\n" +
                "Для подсказки используйте \"help\"");
    }
}
