import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeCollection {
    private ArrayList<Recipe> recipes = new ArrayList<Recipe>();

    public RecipeCollection(String filePath) {
        try (Scanner fileReader = new Scanner(new File(filePath))) {
            while (fileReader.hasNextLine()) {
                String recipeName = fileReader.nextLine();
                int cookingTime = Integer.parseInt(fileReader.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (fileReader.hasNextLine()) {
                    String ingredientRow = fileReader.nextLine();
                    if (ingredientRow.isEmpty())
                        break;
                    ingredients.add(ingredientRow);
                }
                recipes.add(new Recipe(recipeName, cookingTime, ingredients));
            }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void list() {
        System.out.println("Recipes:");
        for (Recipe recipe :
                recipes) {
            System.out.println(recipe.toString());
        }
    }

    public void findRecipesContainingName(String input) {
        System.out.println("Recipes:");
        for (Recipe recipe :
                this.recipes) {
            if (recipe.getName().contains(input))
                System.out.println(recipe.toString());
        }
    }

    public void findRecipesByLessThanTime(int input) {
        System.out.println("Recipes:");
        for (Recipe recipe :
                recipes) {
            if (recipe.getCookingTime() <= input)
                System.out.println(recipe.toString());
        }
    }

    public void findRecipesByIngredient(String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe :
                recipes) {
            if (recipe.getIngredients().contains(ingredient))
                System.out.println(recipe.toString());
        }
    }
}

