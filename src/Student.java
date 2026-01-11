public class Student {

    private int id;
    private String name;
    private String email;
    private String course;
    private double percentage;

    public Student() {}

    public Student(String name, String email, String course, double percentage) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.percentage = percentage;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCourse() { return course; }
    public double getPercentage() { return percentage; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setCourse(String course) { this.course = course; }
    public void setPercentage(double percentage) { this.percentage = percentage; }
}
