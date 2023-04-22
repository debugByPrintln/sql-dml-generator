public class Response {
    int id;
    String answer;
    String send_date;
    int org_id;
    int player_id;
    int tournament_id;

    public Response(int id, String answer, String send_date, int org_id, int player_id, int tournament_id) {
        this.id = id;
        this.answer = answer;
        this.send_date = send_date;
        this.org_id = org_id;
        this.player_id = player_id;
        this.tournament_id = tournament_id;
    }

    @Override
    public String toString() {
        return "(" +
                "" + id +
                ", '" + answer + '\'' +
                ", '" + send_date + '\'' +
                ", " + org_id +
                ", " + player_id +
                ", " + tournament_id +
                "),";
    }
}
