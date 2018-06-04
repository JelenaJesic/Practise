package person;

public class Teacher extends Person {

    private String mainSubject;
    private int yearsOfExpiriance;
    private String gender;

    public String getMainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public int getYearsOfExpiriance() {
        return this.yearsOfExpiriance;
    }

    public void setYearsOfExpiriance(int yearsOfExpiriance) {
        this.yearsOfExpiriance = yearsOfExpiriance;
    }

    public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
    }

    public Teacher(String name, String surname, String jmbg, String mainSubject, int yearsOfExpiriance) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearsOfExpiriance = yearsOfExpiriance;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Main Subject is: " + getMainSubject());
        System.out.println(" Years of expiriance: " + getYearsOfExpiriance());

    }

}
