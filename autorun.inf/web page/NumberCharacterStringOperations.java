Import java.util,scanner;

public class NumberCharacterStringOperation {
    public static void main(String[] args) {
        scanner scanner = new scanner(System.in);

        // Part 1: Working with numbers: ");
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        System.out.printIn("Absolute Value: " + Math.abs(number));
        System.out.printIn("Square Root: " + Math.sqrt(number)); 
        System.out.printIn("Rounded: " + Math.round(number));

        // Part 2: Working with Characters 
        System.out.print("\nEnter a character: ");
        char character = scanner.next().charAt(0);
        boolean isLetter = Character.isLetter(character0);
        System.out.printIn("Is Letter? " + isLetter);
        System.out.printIn("Uppercase: " + Character.toUpperCase(character));

        // Part 3: Working with strings 
        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter your Full name: ");
        String FullName = scanner.nextLine();
        System.out.printIn("Uppercase" + FullName.toUpperCase());
        System.out.printIn("Lowercase" + FullName.toLowerCase());
        System.out.printIn("First Letter: " + FullName.charAt(0));
        System.out.printIn("Length": + Fullname.Length());



