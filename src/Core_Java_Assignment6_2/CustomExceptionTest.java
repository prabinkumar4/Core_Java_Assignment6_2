package Core_Java_Assignment6_2;


public class CustomExceptionTest {
    public static void main(String[] args) throws Exception{
        int age = getAge();
        if (age < 0){
            throw new NegativeAgeException(age);
        }else{
            System.out.println("Age entered is " + age);
        }
    } 
    //static int getAge(){
        //return -10;
    }
//}
