package observerPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class NewsAgency implements News {
    private Map<String, List<Subscriber>> subscribersByCategory;
    private Map<String, String> newsByCategory;

    public NewsAgency() {
        this.subscribersByCategory = new HashMap<>();
        this.newsByCategory = new HashMap<>();
    }

    public void registerSubscriber(Subscriber s, String category) {
        this.subscribersByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(s);
    }

    public void unregisterSubscriber(Subscriber s) {
        this.subscribersByCategory.values().forEach(subscribers -> subscribers.remove(s));
    }

    public void notifySubscribers(String category) {
        String news = this.newsByCategory.get(category);
        List<Subscriber> subscribers = this.subscribersByCategory.get(category);
        if (news != null && subscribers != null) {
            for (Subscriber s : subscribers) {
                s.update(news);
            }
        }
    }

    public void publishNews(String news, String category) {
        this.newsByCategory.put(category, news);
        notifySubscribers(category);
    }
}


