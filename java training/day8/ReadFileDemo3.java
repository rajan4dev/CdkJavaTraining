import java.io.*;

class ReadFileDemo3 {
		
	public static void main(String[] args){
		InputStream fis = null;
		InputStreamReader isr = null; 
		try{
			fis = new FileInputStream("C:/java work/demos/day8/holidays.txt");
			isr = new InputStreamReader(fis);
			char[] arr = new char[10];
			isr.read(arr,0,9);
			System.out.println(arr);
			//int code = isr.read();
			//System.out.println((char)code);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(isr != null){
					isr.close();
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