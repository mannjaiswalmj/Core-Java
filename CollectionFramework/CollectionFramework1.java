package CollectionFramework;

class Student{}

class Teacher{}

public class CollectionFramework1 {

    public static void main(String[] args) {

        int a = 10;
        int b=20;

        int arr[] = new int[40];
        //Limitation of array
        // 1. Arrays are fixed in size
        // 2. Arrays can hold only homogenus type of elements
        //3. Readymade APIs support is not avaiable in arrays

        Student stud[] = new Student[20];
        stud[0] = new Student();
        // stud[1] = new Teacher();         // coz array contains only similar type of data

        Object stud2[] = new Student[10];   // Object Class is parent of all the classes(every classs in java extends Object class)
        stud2[0] = new Student();
        stud2[1] = new Teacher();           // thus both of can be hold in array of Object Class


        
    }
    
}
