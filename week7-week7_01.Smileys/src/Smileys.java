
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString) {
        String content = buildContent(characterString);
        int smileyCount = content.length() / 2;
        
        printSmileys(smileyCount);
        System.out.println(content);
        printSmileys(smileyCount);
        
    }

    private static String buildContent(String characterString) {
        String content = ":) " + characterString;
        if (characterString.length() % 2 == 1) {
            content += " ";
        }
        content += " :)";
        return content;
    }
    
    private static void printSmileys(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
    

}
