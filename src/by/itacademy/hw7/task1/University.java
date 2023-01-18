package by.itacademy.hw7.task1;

import by.itacademy.hw7.task1.studentsAndGraduateStudents.GraduateStudent;
import by.itacademy.hw7.task1.studentsAndGraduateStudents.Student;

public class University {

    private Student[] studentsAndGraduateStudents;

    public University() {
        fillArray();
    }

    public void fillArray () {
        studentsAndGraduateStudents = new Student[6];
        studentsAndGraduateStudents[0] = new Student("Иван", "Иванов", 1, "2Б", 5, false);
        studentsAndGraduateStudents[1] = new Student("Сергей", "Сергеев", 2, "1В", 4, false);
        studentsAndGraduateStudents[2] = new Student("Петр", "Петров", 3, "4А", 3, false);
        studentsAndGraduateStudents[3] = new GraduateStudent("Алексей", "Алексеев", 3, "1А", 4, true);
        studentsAndGraduateStudents[4] = new GraduateStudent("Сергей", "Петров", 1, "2В", 5, true);
        studentsAndGraduateStudents[5] = new GraduateStudent("Иван", "Сергеев", 2, "1Б", 4, true);
    }
    public void getInfoAboutStudent() {
        for (Student s : studentsAndGraduateStudents) {
            if (!s.isScientificWork()) {
                System.out.printf("Студент %s %s, %s курс, %s группа, средняя оценка: %s, размер стипендии: %s%n",
                                s.getName(), s.getSurname(), s.getCourseNumber(), s.getGroupName(), s.getAverageRating(),
                                s.calculateStipend());
            }
        }
    }
    public void getInfoAboutGraduateStudent() {
        for (Student s : studentsAndGraduateStudents) {
            if (s.isScientificWork()) {
                System.out.printf("Аспирант %s %s, %s курс, %s группа, средняя оценка: %s, размер стипендии: %s%n",
                                s.getName(), s.getSurname(), s.getCourseNumber(), s.getGroupName(), s.getAverageRating(),
                                s.calculateStipend());
            }
        }
    }
    public static void main(String[] args) {

        University university = new University();
        university.getInfoAboutStudent();
        university.getInfoAboutGraduateStudent();

    }
}
