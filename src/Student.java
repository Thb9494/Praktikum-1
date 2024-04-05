public class Student {
  
  private String name;
  private int matNr;
  private String course;
  private Dozent professor;

  

  public Student (String name, Dozent professor) {
    this.name = name;
    this.professor = professor;
  }

  public void askQuestion (String question, String name, Dozent professor) {
    System.out.println(name + " stellt eine Frage an " + professor.getName());
    System.out.println("Frage: " + question);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMatNr() {
    return matNr;
  }

  public void setMatNr(int matNr) {
    this.matNr = matNr;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public Dozent getProfessor() {
    return professor;
  }

  public void setProfessor(Dozent professor) {
    this.professor = professor;
  }
  
}
