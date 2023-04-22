import java.util.Random;

public class Invite {
    int id;
    String competition_info;
    String send_date;
    String date_to_response;
    int org_id;
    int player_id;
    int tournament_id;

    public Invite(int id, String send_date, String date_to_response, int org_id, int player_id, int tournament_id){
        this.id = id;
        this.competition_info = getRandomString(tournament_id);
        this.send_date = send_date;
        this.date_to_response = date_to_response;
        this.org_id = org_id;
        this.player_id = player_id;
        this.tournament_id = tournament_id;
    }

    @Override
    public String toString() {
        return "(" +
                "" + id +
                ", '" + competition_info + '\'' +
                ", '" + send_date + '\'' +
                ", '" + date_to_response + '\'' +
                ", " + org_id +
                ", " + player_id +
                ", " + tournament_id +
                "),";
    }

    private String getRandomString(int a){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = getRandomInt(50+a*2, 50+a*2);
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    private int getRandomInt(int min, int max){
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
