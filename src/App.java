public class App {
    public static void main(String[] args) throws Exception {
        Dozierender Maier = new Dozierender("Maier", "I", "1");
        Student Theresa = new Student("theresa", Maier);
        Theresa.askQuestion("wie viel?", Theresa, Maier);
    }
}
