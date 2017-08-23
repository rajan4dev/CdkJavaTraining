import java.io.*;

class ReadFileDemo2 {
		
	public static void main(String[] args){
		InputStream fis = null;
		try{
			fis = new FileInputStream("C:/java work/demos/day8/holidays.txt");
			long startTime = System.currentTimeMillis();
			int b = fis.read();
			while(b != -1){	
				//System.out.print((char)b);
				b = fis.read();
			}
			long endTime = System.currentTimeMillis();
			System.out.printf("%nTotal Time : %s ms",(endTime-startTime));

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