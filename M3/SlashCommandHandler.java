package M3;

import java.util.Random;

/*
Challenge 2: Simple Slash Command Handler
-----------------------------------------
- Accept user input as slash commands
  - "/greet <name>" → Prints "Hello, <name>!"
  - "/roll <num>d<sides>" → Roll <num> dice with <sides> and returns a single outcome as "Rolled <num>d<sides> and got <result>!"
  - "/echo <message>" → Prints the message back
  - "/quit" → Exits the program
- Commands are case-insensitive
- Print an error for unrecognized commands
- Print errors for invalid command formats (when applicable)
- Capture 3 variations of each command except "/quit"
*/

import java.util.Scanner;

public class SlashCommandHandler extends BaseClass {
    private static String ucid = "mt85"; // <-- change to your UCID

    public static void main(String[] args) {
        printHeader(ucid, 2, "Objective: Implement a simple slash command parser.");

        Scanner scanner = new Scanner(System.in);

        // Can define any variables needed here

        Random random = new Random();

        while (true) {
            System.out.print("Enter command: ");
            //bam22 6-23-26

            //Step 1: Import Random for the Dice rolls
            //Step 2: Create scanner and random objects for the input and number generation
            //Step 3: Make an infinite loop 
            //Step 4: ask the user to enter a command
            //Step 5: depending on what the input is then the program will display different outputs

            // get entered text

            // check if greet
            //// process greet

            // check if roll
            //// process roll
            //// handle invalid formats

            // check if echo
            //// process echo

            // check if quit
            //// process quit

            // handle invalid commnads

            // delete this condition/block, it's just here so the sample runs without edits
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("/quit")) {
                System.out.println("Exiting program...");
                break;
            }

          
            else if (input.toLowerCase().startsWith("/greet")) {
                String[] parts = input.split("\\s+", 2);
                if (parts.length < 2 || parts[1].trim().isEmpty()) {
                    System.out.println("Error: Missing name. Usage: /greet <name>");
                } else {
                    String name = parts[1].trim();
                    System.out.println("Hello, " + name + "!");
                }
            }

            
            else if (input.toLowerCase().startsWith("/echo")) {
                String[] parts = input.split("\\s+", 2);
                if (parts.length < 2 || parts[1].trim().isEmpty()) {
                    System.out.println("Error: Missing message. Usage: /echo <message>");
                } else {
                    System.out.println(parts[1]);
                }
            }

      
            else if (input.toLowerCase().startsWith("/roll")) {
                String[] parts = input.split("\\s+", 2);
                if (parts.length < 2 || parts[1].trim().isEmpty()) {
                    System.out.println("Error: Missing dice format. Usage: /roll <num>d<sides>");
                } else {
                    String dice = parts[1].trim().toLowerCase();
                    if (dice.matches("\\d+d\\d+")) {
                        String[] nums = dice.split("d");
                        int num = Integer.parseInt(nums[0]);
                        int sides = Integer.parseInt(nums[1]);
                        if (num <= 0 || sides <= 0) {
                            System.out.println("Error: Numbers must be greater than 0.");
                        } else {
                            int total = 0;
                            for (int i = 0; i < num; i++) {
                                total += random.nextInt(sides) + 1;
                            }
                            System.out.println("Rolled " + num + "d" + sides + " and got " + total + "!");
                        }
                    } else {
                        System.out.println("Error: Invalid format. Usage: /roll <num>d<sides>");
                    }
                }
            }

            
            else {
                System.out.println("Error: Unrecognized command.");
            }
        }

        printFooter(ucid, 2);
        scanner.close();
    }
}
