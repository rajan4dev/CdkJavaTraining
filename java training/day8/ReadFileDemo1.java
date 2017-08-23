import java.io.*;

class ReadFileDemo1 {
		
	public static void main(String[] args){
		InputStream fis = null;
		try{
			fis = new FileInputStream("C:/java work/demos/day8/holidays.txt");
			int b = fis.read();
			System.out.println(b);
			System.out.println((char)b);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(fis != null){
					fis.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
}