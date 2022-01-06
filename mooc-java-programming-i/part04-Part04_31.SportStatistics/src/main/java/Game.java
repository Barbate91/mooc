public class Game {
    private String homeTeam;
    private String awayTeam;
    private String homePts;
    private String awayPts;

    public Game(String homeTeam, String awayTeam, String homePts, String awayPts) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePts = homePts;
        this.awayPts = awayPts;
    }

    public String getWinner() {
        if (Integer.parseInt(this.homePts) > Integer.parseInt(this.awayPts))
            return this.homeTeam;
        else
            return this.awayTeam;
    }

    public String getHomePts() {
        return this.homePts;
    }

    public String getAwayPts() {
        return this.awayPts;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getAwayTeam() {
        return this.awayTeam;
    }
}

