import java.io.*;

class ExceptionDemo2 {
		
	public static void main(String[] args){
		
		try{
			FileInputStream fis = new FileInputStream("C://hello.txt");
			System.out.println("");
		}catch(FileNotFoundException e){
			System.out.println("Hola");
		}
	}
}