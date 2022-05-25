public class Course {
    Teacher teacher;
    String name, code, prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbalNote = 0;
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }
        else{
            System.out.println("Courses do not match");
        }

    }
    void printTeacherInfo(){
        this.teacher.print();

    }

}
