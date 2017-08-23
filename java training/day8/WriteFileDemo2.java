import java.io.*;

class WriteFileDemo2 {
		
	public static void main(String[] args){
		OutputStream fos = null;
		OutputStreamWriter osw = null;
		try{
			fos = new FileOutputStream("C:/java work/demos/day8/movies.txt");
			osw = new OutputStreamWriter(fos);
			osw.write("Bahubali 2 is a good movie.\n");
			osw.write("Bahubali 2 is a good movie.\n");
			osw.write("Bahubali 2 is a good movie.\n");
			System.out.println("Done");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(osw != null){
					osw.close();
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