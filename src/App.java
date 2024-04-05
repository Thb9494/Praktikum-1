public class App {
    public static void main(String[] args) throws Exception {

        Dozierender dozierender = new Dozierender();
        
        dozierender.setName("Beispieldozent");
        dozierender.setFakultaet("Beispielfakultaet");
        dozierender.setBueronummer("A01");

        Student student = new Student();

        student.setName("Beispielstudent");
        


        askQuestion("Sieht man das?", student.getName(), dozierender.getName());
        frageBeantworten("Ich hoffe schon.", student.getName(), dozierender.getName());
    }
}
