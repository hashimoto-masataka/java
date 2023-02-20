class Student{
    String name ="sato";
    
    public void calculateAvg(int math,int english) {
    System.out.println((math + english)/ 2);
    }
}

public class Lesson13{
    public static void main(String[] args){
        Student a001 = new Student();
        a001.name = "sato";
        
        System.out.println(a001.name);
        a001.calculateAvg(90,80);
        
        Student a002 = new Student();
        a002.name = "suzuki";
        System.out.println(a002.name);
    }
}