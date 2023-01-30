package by.itacademy.hw7.task1.students;

public class Student {

    protected String name;
    protected String surname;
    protected int courseNumber;
    protected String groupName;
    protected int averageRating;

    protected boolean scientificWork;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public boolean isScientificWork() {
        return scientificWork;
    }

    public Student(String name, String surname, int courseNumber, String groupName, int averageRating, boolean scientificWork) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.groupName = groupName;
        this.averageRating = averageRating;
        this.scientificWork = scientificWork;
    }

    public int calculateStipend (){
        int stipend = 100;
        if (this.averageRating != 5) {
            stipend = 80;
        }
        return stipend;
    }
}
