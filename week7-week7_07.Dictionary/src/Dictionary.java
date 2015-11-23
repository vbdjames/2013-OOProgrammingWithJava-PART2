
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> words;

    public Dictionary() {
        this.words = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        return words.get(word);
    }
    
    public void add(String word, String translation) {
        words.put(word, translation);
    }

    public int amountOfWords() {
        return words.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<String>();
        for (String key : this.words.keySet()) {
            translations.add(key + " = " + this.words.get(key));
        }
        return translations;
    }
}
