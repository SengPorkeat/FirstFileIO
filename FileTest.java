package FileIO;
import java.io.*;

public class FileTest {
    public void writeObjectToFile(Student student){
        try {
            ObjectOutputStream objoutput = new ObjectOutputStream(new FileOutputStream("student.dat"));
            objoutput.writeObject(student);
            objoutput.flush();
            objoutput.close();
            System.out.println("Succesfully");
        }catch (Exception ignore){}
    }
    public void readObjectToFile(){
        try {
            ObjectInputStream objinput = new ObjectInputStream(new FileInputStream("student.dat"));
            Student student = (Student) objinput.readObject();
            System.out.println(student);
            objinput.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        Student student = new Student(12,"Hello",new String[]{"Python","Java"},new String[]{"Font_End","Back_End"});
        FileTest obj = new FileTest();
//        obj.writeObjectToFile(student);
        obj.readObjectToFile();  
    }
}
