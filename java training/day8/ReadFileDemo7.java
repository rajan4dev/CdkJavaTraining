import java.io.*;

class ReadFileDemo7{
		
	public static void main(String[] args){
	
	
		FileInputStream fis = null;
		ObjectInputStream ois = null;
	
		try{
			fis = new FileInputStream("C:/java work/demos/day8/persons.txt");
			ois = new ObjectInputStream(fis);
			Person p = (Person)ois.readObject();
			System.out.println(p.uid);
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println(p.phone);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(ois != null){
					ois.close();
				}
				if(fis != null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
}