package observerPattern;

public class User implements Subscriber {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String news) {
        System.out.println(this.name + " received breaking news: " + news);
    }
}
