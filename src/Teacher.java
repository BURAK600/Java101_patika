public class Teacher {

    String name, mpno,branch;
    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }
    void print(){
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
        System.out.println("Phone Number : " + this.mpno);
    }

}