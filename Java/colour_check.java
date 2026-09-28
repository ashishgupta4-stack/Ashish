import java.util.Scanner;
class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}
class Colour {
    public String character;
    public Colour(String character) throws InvalidCharacterException {
        if (!character.equalsIgnoreCase("V") &&
            !character.equalsIgnoreCase("I") &&
            !character.equalsIgnoreCase("B") &&
            !character.equalsIgnoreCase("G") &&
            !character.equalsIgnoreCase("Y") &&
            !character.equalsIgnoreCase("O") &&
            !character.equalsIgnoreCase("R")) {
            throw new InvalidCharacterException("Character not in Rainbow");
        }
        this.character = character;
    }
    public void displayColour() {
        switch (character.toUpperCase()) {
            case "V" -> System.out.println("Violet");
            case "I" -> System.out.println("Indigo");
            case "B" -> System.out.println("Blue");
            case "G" -> System.out.println("Green");
            case "Y" -> System.out.println("Yellow");
            case "O" -> System.out.println("Orange");
            case "R" -> System.out.println("Red");
        }
    }
}

class myMain6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a character to check - ");
            String character = sc.nextLine();
            Colour colour = new Colour(character);
            colour.displayColour();
        }
        catch (InvalidCharacterException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e){
            System.err.println("Exception e.");
        }
    }
}