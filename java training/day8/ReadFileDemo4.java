import java.io.*;

class ReadFileDemo4 {
		
	public static void main(String[] args){
		InputStream fis = null;
		InputStreamReader isr = null; 
		try{
			File file = new File("C:/java work/demos/day8/holidays.txt");
			//File file = new File("C:/java work/demos/day8");
			/*System.out.println(file.exists());
			System.out.println(file.length());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			*/
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			char[] arr = new char[(int)file.length()];
			isr.read(arr,0,arr.length);
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