package observerPattern;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        User user1 = new User("Juan");
        User user2 = new User("Berta");

        agency.registerSubscriber(user1, "politics");
        agency.registerSubscriber(user2, "social");

        agency.publishNews("Marcos won the presidency", "politics");
        agency.publishNews("Kathniel confirms break-up", "social");

        agency.unregisterSubscriber(user1);

        agency.publishNews("Duterte not planning to run as President", "politics");
        agency.publishNews("Andrea is the third party???", "social");
    }
}