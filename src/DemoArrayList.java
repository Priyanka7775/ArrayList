import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DemoArrayList {
    public static void main(String[] args) {
        //create a array list
        List arrayList=new ArrayList();
        System.out.println("arrayList.size() = " + arrayList.size());

        arrayList.add("Priyanka");
        arrayList.add("Ramesh");
        arrayList.add("Suresh");
        arrayList.add("Ravi");
        System.out.println("arrayList.size() = " + arrayList.size());
        arrayList.add("Suresh");
        arrayList.add("Suresh");
        System.out.println("arrayList.indexOf(\\\"Ravi\\\") = " + arrayList.indexOf("Ravi"));
        System.out.println("arrayList.get(1) = " + arrayList.get(1));
        System.out.println("arrayList.contains(\"Abhishek\") = " + arrayList.contains("Abhishek"));
        System.out.println("arrayList = " + arrayList);
        Student student=new Student();
        student.setRollNo(15);
        student.setName("Amar");
        arrayList.add(student);
        arrayList.add(12);
        System.out.println("arrayList = " + arrayList);
        System.out.println( student);


        //for each loop
        //enhanced for loop
        //for(type variable:array or collection){
        // statemnts
        //}

        Integer [] arr={10,20,30};
        Student[] students=new Student[5];
        for (Integer elementOfArray: arr) {
            System.out.println("elementOfArray = " + elementOfArray);
        }
        for (Student elementOfStudentArray:students){
            System.out.println("elementOfArray = " + elementOfStudentArray);
        }
        for (Object ele:arrayList){
            System.out.println("ele = " + ele);
        }

    }
}
