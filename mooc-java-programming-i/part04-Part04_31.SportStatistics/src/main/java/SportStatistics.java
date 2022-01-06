
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int numGames = 0;
        String winner = "";
        int wins = 0;
        int losses = 0;

        ArrayList<Game> games = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] split = row.split(",");
                games.add(new Game(split[0], split[1], split[2], split[3]));
            }
            for (Game game :
                    games) {
                if (game.getHomeTeam().equals(team) || game.getAwayTeam().equals(team)) {
                    numGames++;
                    winner = game.getWinner();

                    if (winner.equals(team))
                        wins++;
                    else
                        losses++;
                }
            }
            System.out.println("Games: " + numGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
