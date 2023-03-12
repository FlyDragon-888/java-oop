package seminar6.hw1_restructurized.models;

public class UserReporter implements Reporter<User>{
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
