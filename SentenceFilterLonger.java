public class SentenceFilterLonger implements SentenceFilter {
    private static SentenceFilterLonger instance;
    private int threshold;
    private String[] sentences;

    private SentenceFilterLonger() {
        // приватный конструктор
    }

    // получения единственного экземпляра класса
    public static SentenceFilterLonger getInstance() {
        if (instance == null) {
            instance = new SentenceFilterLonger();
        }
        return instance;
    }

    // установка порога
    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    // получение порога
    public int getThreshold() {
        return this.threshold;
    }

    @Override
    public void filterByLength(String text) {
        sentences = text.split("\\.");
        System.out.println("\nПредложения длиной больше " + threshold + " символов:");
        for (String sentence : sentences) {
            if (sentence.length() > threshold) {
                System.out.println(sentence.trim() + ".");
            }
        }
    }
}