import java.time.LocalDate;
import java.util.*;

public class Student {

    private String imie;
    private String nazwisko;
    private String emial;
    private String adres;
    private String indexNumber;
    private LocalDate dateOfBirth;
    private String status;
    private int aktualnySemestr;
    private StudyProgramme programstudiow;
    private Map<String, Integer> grades;

    private static List<String> indexNumbers = new ArrayList<>();



    public Student(String imie, String nazwisko, String email, String adres, String indexNumber, LocalDate dateOfBirth) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.emial = email;
        this.adres = adres;
        this.indexNumber = generateIndexNumber();
        this.dateOfBirth = dateOfBirth;
        this.status = "kandydat";
        this.aktualnySemestr = 1;
        this.grades = new HashMap<>();

    }

    private String generateIndexNumber() {
        String newIndexNumber;
        do {
            newIndexNumber = "s" + (new Random().nextInt(1000) + 1);
        } while (indexNumbers.contains(newIndexNumber));
        indexNumbers.add(newIndexNumber);
        return newIndexNumber;
    }


    public void enrollStudent(StudyProgramme studyProgramme) {
        this.programstudiow = studyProgramme;
        this.status = "student";
    }

    public void addGrade(int ocena, String nazwakursu) {
        grades.put(nazwakursu, ocena);
    }

    public void promoteToKolejnySemestr(){
        if (aktualnySemestr <programstudiow.getNumerSemestru() && aktualnySemestr < programstudiow.getITN()) {
            aktualnySemestr++;
        } else {
            status = "absolwent";
        }
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return emial;
    }

    public String getAdres() {
        return adres;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getStatus() {
        return status;
    }

    public StudyProgramme getProgramstudiow() {
        return programstudiow;
    }

    public int getAktualnySemestr() {
        return aktualnySemestr;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}