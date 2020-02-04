public class Student extends Person{

    public String name;
    public String gender;
    public int age;
    String specialty;

    protected int point1;
    protected int point2;
    protected int point3;

    private String adress = "Minsk, Сosmonauts str, 100";

    public Student(String name, String lastname, String gender, int age, String specialty) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.specialty = specialty;
    }

    public String profile() {
        return (String) ("Name: " + name + '\n' + "Lastname: " + lastname + '\n' +"Gender: " + gender + '\n' + "Age: " + age + '\n' + "Specialty: " + specialty);
    }

    protected void setRating(int point1, int point2, int point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    protected int rating() {
        return (int)((point1 + point2 + point3)/3);
    }
    private String Adress() {
        return adress;
    }
}
