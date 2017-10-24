package Core_Java_Assignment6_2;



	public class NegativeAgeException extends Exception {
		 
	    private int age;
	 
	    public NegativeAgeException(int age){
	        this.age = age;
	    }
	 
	    public String toString(){
	        return "Age cannot be negative" + " " +age ;
	    }
	}






	