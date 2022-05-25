
public class StudentInformationSystem {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "HTR", "05454333333");
        Teacher t2 = new Teacher("Tangut Hoca", "FZH", "05432233332");
        Teacher t3 = new Teacher("Kül Yutmaz", "BIYO", "05435553332");
        Course history  = new Course("History", "H101", "HTR");
        Course fizik  = new Course("Fizik", "F101", "FZK");
        Course biyoloji  = new Course("Biyoloji", "B101", "BYlJ");

        Student s1 = new Student("Düdük Nejmi", "12344444", "4", history, fizik, biyoloji);
        Student s2 = new Student("Inek Saban", "12344455", "4", history, fizik, biyoloji);

        s1.addBulkExamNote(100,70,36,45,60,45);
        s1.isPass();
        s2.addBulkExamNote(13,45,67,34,12,25);
        s1.isPass();

    }
}
