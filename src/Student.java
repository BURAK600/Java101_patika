import java.nio.charset.CoderResult;

public class Student {
    String name, stuNo, classes;
    Course c1,c2,c3;
    double average;
    boolean isPass;
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3){
        if (note1 >= 0 && note1<=100){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2<=100){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3<=100){
            this.c3.note = note3;
        }
        if (verbalNote1>=0 && verbalNote1<= 100){
            this.c1.verbalNote = verbalNote1;
        }
        if (verbalNote2>=0 && verbalNote2<= 100){
            this.c1.verbalNote = verbalNote2;
        }
        if (verbalNote3>=0 && verbalNote3<= 100){
            this.c1.verbalNote = verbalNote3;
        }

    }

    void isPass(){
        this.average = (((this.c1.note*0.8 +this.c1.verbalNote*0.2) + (this.c2.note*0.8 +this.c2.verbalNote*0.2) + (this.c3.note*0.8+this.c3.verbalNote*0.2) )/3.0);
        if (this.average >55){
            System.out.println("Hababam Sinifi Uyaniyor");
            this.isPass = true;
        }
        else{
            System.out.println("Hababam Sinifi sinifta kaldi");
            this.isPass = false;
        }
        printNote();
        System.out.println("Note Average: " + this.average);
        System.out.println("===========================================================");
    }
    void printNote(){
        System.out.println(c1.name + " Note: " + c1.note);
        System.out.println(c2.name + " Note: " + c2.note);
        System.out.println(c3.name + " Note: " + c3.note);
    }


}
