 import java.io.*;

class WriteFileDemo4 {
		
	public static void main(String[] args){
	
		Person p1 = new Person(1000,"Jaggu",25,"9800000000");	
	
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
	
		try{
			fos = new FileOutputStream("C:/java work/demos/day8/persons.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p1);
			System.out.println("Done");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(oos != null){
					oos.close();
				}
				if(fos != null){
					fos.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
}