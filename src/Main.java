import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void unosStudenta(List<Student> listaStudenata, List<Student> listaStudenataPolozili){
        String unos;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            System.out.println("Unesite prezime studenta: ");
            String prezime = scanner.next();
            System.out.println("Unesite ocjenu studenta: ");
            int ocjena = scanner.nextInt();
            System.out.println("Unos novog studenta? Y za unos, quit za izlaz iz unosa");
            unos=scanner.next();
            Student studenti= new Student(ime, prezime, ocjena);
            listaStudenata.add(studenti);
            if(ocjena>5) listaStudenataPolozili.add(studenti);
        } while (!unos.equals("quit"));
    }
    public static void main(String[] args) {

        List<Student> listaStudenata = new ArrayList<>();
        List<Student> listaStudenataPolozili=new ArrayList<>();
        unosStudenta(listaStudenata, listaStudenataPolozili);
        System.out.println("Svi uneseni studenti:");
        for (Student s:listaStudenata)
        {
            System.out.println(s);
        }
        System.out.println("Studenti koji su polozili: ");
        for (Student s:listaStudenataPolozili)
        {
            System.out.println(s);
        }
    }
}