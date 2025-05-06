package Basic_java.pratice_promblems_java;

class student{
    String name;
    int id;

    student(String name,int id){
        this.name = name;
        this.id = id;
    }

}
class Main {
    public static void main(String[] args) {
      student[] std = new student[3];
      std[0] = new student("saikiran",1);
      std[1] = new student("abhishik",2);
      std[2] = new student("charan",3);
    

for(student s : std){
    System.out.println("Name:"+s.name +" Id: "+s.id);
}
}
}