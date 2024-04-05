public class App {
    public static void main(String[] args) throws Exception {
        
        Dozierender dozierender = new Dozierender("Beispieldozierender","Beispielfakultaet","A01");

        Student student = new Student("Beispielstudent",dozierender);

        student.askQuestion("Sieht man das?","Test",dozierender);

        dozierender.frageBeantworten("Ja.",student,"Test2");   
    }
}
