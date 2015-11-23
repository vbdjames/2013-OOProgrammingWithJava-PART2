public class Main {
    public static void main(String[] args) {
        String a = "Architect";
        Changer foo = new Changer();
        foo.addChange(new Change('A', 'I'));
        System.out.println(foo.change(a));
        System.out.println(a);
        
    }
}
