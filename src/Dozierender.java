public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;

    public Dozierender(String name, String fakultaet, String bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;
    }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFakultaet() {
        return fakultaet;
    }
    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }
    public String getBueronummer() {
        return bueronummer;
    }
    public void setBueronummer(String bueronummer) {
        this.bueronummer = bueronummer;
    }
    public void frageBeantworten(String antwort, Student student, String name) {

        System.out.println(name + " beantwortet die Frage von " + student.getName() + ": " + antwort);
    }    
}
