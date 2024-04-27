class StudyProgramme {

    private String nazwaprogramu;
    private String opisProgramu;
    private int numerSemestru;
    private int ITN;

    public StudyProgramme(String nazwaprogramu, String opisProgramu, int numerSemsetru, int ITN) {
        this.nazwaprogramu = nazwaprogramu;
        this.numerSemestru = numerSemsetru;
        this.opisProgramu = opisProgramu;
        this.ITN = ITN;
    }

    public String getNazwaprogramu() {
        return nazwaprogramu;
    }

    public int getITN() {
        return ITN;
    }

    public String getOpisProgramu() {
        return opisProgramu;
    }

    public int getNumerSemestru() {
        return numerSemestru;
    }
}