import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void unosStudenta(List<Student> listaStudenata, List<Student> listaStudenataPolozili) {

        String ime;
        String prezime;
        String ocjena;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Unesite ime studenta: ");
            ime = scanner.next();
            if (ime.equals("quit")) break;
            System.out.println("Unesite prezime studenta: ");
            prezime = scanner.next();
            if (prezime.equals("quit")) break;
            System.out.println("Unesite ocjenu studenta: ");
            ocjena = scanner.next();
            if (ocjena.equals("quit")) break;
            Student studenti = new Student(ime, prezime, Integer.parseInt(ocjena));
            listaStudenata.add(studenti);
            if (Integer.parseInt(ocjena) > 5) listaStudenataPolozili.add(studenti);
        }
    }

    public static void main(String[] args) {

        List<Student> listaStudenata = new ArrayList<>();
        List<Student> listaStudenataPolozili = new ArrayList<>();
        unosStudenta(listaStudenata, listaStudenataPolozili);
        System.out.println("Svi uneseni studenti:");
        if (listaStudenata.isEmpty()) {
            System.out.println("Lista je prazna");
        } else {
            for (Student s : listaStudenata) {
                System.out.println(s);
            }
            System.out.println("Studenti koji su polozili: ");
            for (Student s : listaStudenataPolozili) {
                System.out.println(s);
            }
        }
    }
}