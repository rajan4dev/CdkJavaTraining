import java.io.*;

class WriteFileDemo1 {
		
	public static void main(String[] args){
		OutputStream fos = null;
		try{
			fos = new FileOutputStream("C:/java work/demos/day8/movies.txt");
			fos.write(122);
			System.out.println("Done");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(fos != null){
					fos.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
}