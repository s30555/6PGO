import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Students {

    private static List<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);

    }

    public static void promoteAllStudents() {
        for (Student student : students) {
                student.promoteToKolejnySemestr();
            }
    }


    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getImie() + " " + student.getNazwisko());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Adres: " + student.getAdres());
            System.out.println("Numer indexu: " + student.getIndexNumber());
            System.out.println("Data urodzenia: " + student.getDateOfBirth());
            System.out.println("Status: " + student.getStatus());
            System.out.println("Aktualny semestr: " + student.getAktualnySemestr());
            System.out.println("Program studiów: " + student.getProgramstudiow().getNazwaprogramu());
            System.out.println( "Opis programu studiów: " + student.getProgramstudiow().getOpisProgramu());
            System.out.println( "Oceny: ");
            for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}
