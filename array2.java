class Student{
    int roll;
    String name;
    int marks;
}
public class array2 {

    public static void main(String[] args) {
    Student s1 = new Student();
    s1.roll = 1;
    s1.name="Navin";
    s1.marks=50;

    Student s2 = new Student();
    s2.roll = 2;
    s2.name="lokesh";
    s2.marks=80;

    Student s3 = new Student();
    s3.roll = 3;
    s3.name="rahul";
    s3.marks=66;

    //Array of object;

    Student stud[] = new Student[3];
    stud[0]=s1;
    stud[1]=s2;
    stud[2]=s3;

    // for(int i=0; i<stud.length; i++){

    //     System.out.println(stud[i].name + " : " + stud[i].marks);
    // }

    // Enhanced loop or for each loop
    for(Student n : stud){
        System.out.println(n.name + " : " + n.marks);
    }

    
// n is a variable of student type and is itrating stud[] array
    }
    


}
