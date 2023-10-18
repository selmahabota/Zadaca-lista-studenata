public class Student {
    public String ime;
    public String prezime;
    public int ocjena;

    public Student(String ime, String prezime, int ocjena) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocjena = ocjena;
    }

    @Override
    public String toString() {
        return "Student {" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", ocjena=" + ocjena +
                '}';
    }
}
