public class Dozierender {

    private String name;
    private String fakultaet;
    private String bueronummer;
   
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
    public String frageBeantworten(String antwort, Student student, String name) {


        System.out.println("Frage an " + dozent + ": " + frage);

        antwort = Input.readString();

        return antwort;
    }

    

}
