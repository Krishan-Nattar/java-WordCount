package wordcount;

public class Words {
    private int count = 0;
    private String word;

    public Words(String word) {
        this.word = word;
        this.count += 1;
    }

    public int getCount() {
        return this.count;
    }

    public void addCount() {
        this.count += 1;
    }

    public String getWord() {
        return this.word;
    }

}