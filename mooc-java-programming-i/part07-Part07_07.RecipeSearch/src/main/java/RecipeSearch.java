import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String recipeInput = scanner.nextLine();
        RecipeCollection recipes = new RecipeCollection(recipeInput);

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (true) {
            System.out.println("Enter command:");
            String commandInput = scanner.nextLine();
            if (commandInput.equals("stop"))
                break;
            else if (commandInput.equals("list")) {
                recipes.list();
            } else if (commandInput.equals("find name")) {
                System.out.println("Searched word:");
                String input = scanner.nextLine();
                recipes.findRecipesContainingName(input);
            } else if (commandInput.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                String input = scanner.nextLine();
                recipes.findRecipesByLessThanTime(Integer.parseInt(input));
            } else if (commandInput.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String input = scanner.nextLine();
                recipes.findRecipesByIngredient(input);
            }
        }
    }
}
