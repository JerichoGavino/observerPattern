package observerPattern;


// Define the News interface
interface News {
    void registerSubscriber(Subscriber s, String category);
    void unregisterSubscriber(Subscriber s);
    void notifySubscribers(String category);
}