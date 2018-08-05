import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * Generates unique and random passwords for the user
 *
 * @author aaron
 * @date 11-21-2017
 */
public class SecretPasscodes
{
    public static void main(String args[]) throws IOException
    {
        //variables
        Random rand = new Random();
        File passwordFile = new File("Passwords.txt");
        PrintWriter writePasswordFile = new PrintWriter(passwordFile);
        Scanner readPasswordFile = new Scanner(passwordFile);
        Scanner user = new Scanner(System.in);

        boolean generateMorePasswords = true;
        boolean invalidPasswordType = true;
        boolean generateASCIICharacter = true;
        boolean invalidPasswordLength = true;

        String stringPasswordType;
        String stringPasswordLength;
        String generatedPassword = "";
        String readPassword;

        int passwordType = 5;
        int passwordLength = 0;
        int ASCIICharacter = 0;

        //Menu
        System.out.println("+================================================+");
        System.out.println("| [1] Lowercase                                  |");
        System.out.println("| [2] Lowercase and Uppercase                    |");
        System.out.println("| [3] Lowercase, Uppercase, and Numbers          |");
        System.out.println("| [4] Lowercase, Uppercase, Numbers, and Symbols |");
        System.out.println("| [5] Quit                                       |");
        System.out.println("+================================================+");
        System.out.println();

        //LOOP
        while (generateMorePasswords) {
            while (invalidPasswordType) {
                //get password type
                System.out.println("Choose password type: ");
                stringPasswordType = user.nextLine();
                passwordType = Integer.parseInt(stringPasswordType);

                //Check password type
                if (passwordType < 1 || passwordType > 5) {
                    System.out.println("Invalid password type!");
                }
                else if (passwordType == 5) {
                    passwordLength = 0;
                    generateMorePasswords = false;
                    invalidPasswordLength = false;
                    invalidPasswordType = false;
                }
                else {
                    invalidPasswordType = false;
                }
            }

            //Password length
            while (invalidPasswordLength) {
                //get length
                System.out.println("Enter length of password (At least 6): ");
                stringPasswordLength = user.nextLine();
                passwordLength = Integer.parseInt(stringPasswordLength);

                //Check password length
                if (passwordLength < 6) {
                    System.out.println("Password too short!");
                }
                else {
                    invalidPasswordLength = false;
                }
            }

            //generate password
            for (int l = 0; l < passwordLength; l++) {
                while (generateASCIICharacter) {
                    ASCIICharacter = rand.nextInt(75) + 48;

                    if (ASCIICharacter >= 58 && ASCIICharacter <= 64) {
                        generateASCIICharacter = true;
                    }
                    else if (passwordType == 1 && (ASCIICharacter >= 97 && ASCIICharacter <= 122)) //Lowercase
                    {
                        generateASCIICharacter = false;
                    }
                    else if (passwordType == 2 && ((ASCIICharacter >= 65 && ASCIICharacter <= 90) || (ASCIICharacter >= 97 && ASCIICharacter <= 122))) //Lowercase and Uppercase
                    {
                        generateASCIICharacter = false;
                    }
                    else if (passwordType == 3 && ((ASCIICharacter >= 65 && ASCIICharacter <= 90) || (ASCIICharacter >= 97 && ASCIICharacter <= 122) || (ASCIICharacter >= 48 && ASCIICharacter <= 57))) //Lowercase, Uppercase, and Numbers
                    {
                        generateASCIICharacter = false;
                    }
                    else if (passwordType == 4 && ((ASCIICharacter >= 65 && ASCIICharacter <= 122) || (ASCIICharacter >= 48 && ASCIICharacter <= 57))) //Lowercase, Uppercase, Numbers, and Symbols
                    {
                        generateASCIICharacter = false;
                    }
                    else {
                        generateASCIICharacter = true;
                    }
                }
                generatedPassword += (char) ASCIICharacter;
                generateASCIICharacter = true;
            }
            //Save password
            writePasswordFile.println(generatedPassword);
            generatedPassword = "";
            invalidPasswordType = true;
            invalidPasswordLength = true;
        }
        //Close file
        writePasswordFile.close();

        //Display password banner
        System.out.println("+=======================+");
        System.out.println("|  Generated Passwords  |");
        System.out.println("+=======================+");

        //Loop for reading and displaying passwords from file
        while (readPasswordFile.hasNextLine()) {
            //Reads password from file
            readPassword = readPasswordFile.nextLine();
            //Prints password
            System.out.println();
            System.out.println(readPassword);
        }
    }
}