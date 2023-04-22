public class GenerateInvite {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5000) {
            //1 tournament
            if (counter <= 1000) {
                Invite invite = new Invite(counter, "2020-07-01", "2020-08-01", 5001, counter, 1);
                System.out.println(invite);
            }
            //2 tournament
            else if (counter <= 2000) {
                Invite invite = new Invite(counter, "2021-07-01", "2021-08-01", 5006, counter, 2);
                System.out.println(invite);
            }
            //3 tournament
            else if (counter <= 3000) {
                Invite invite = new Invite(counter, "2022-07-01", "2022-08-01", 5011, counter, 3);
                System.out.println(invite);
            }
            //4 tournament
            else if (counter <= 4000) {
                Invite invite = new Invite(counter, "2023-07-01", "2023-08-01", 5016, counter, 4);
                System.out.println(invite);
            }
            //5 tournament
            else {
                Invite invite = new Invite(counter, "2024-07-01", "2024-08-01", 5021, counter, 5);
                System.out.println(invite);
            }

            counter++;
        }


    }

}
