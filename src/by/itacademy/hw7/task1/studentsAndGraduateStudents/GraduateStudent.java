package by.itacademy.hw7.task1.studentsAndGraduateStudents;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, String surname, int courseNumber, String groupName, int averageRating, boolean scientificWork) {
        super(name, surname, courseNumber, groupName, averageRating, scientificWork);
    }
    @Override
    public int calculateStipend() {
        int stipend = 200;
        if (super.averageRating != 5) {
            stipend = 180;
        }
        return stipend;
    }
}
