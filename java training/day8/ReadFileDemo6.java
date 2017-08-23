import java.io.*;

class ReadFileDemo6 {
		
	public static void main(String[] args){
		InputStream fis = null;
		InputStreamReader isr = null; 
		BufferedReader br = null; 
		try{
			File file = new File("C:/java work/demos/day8/holidays.txt");
			//byte stream
			fis = new FileInputStream(file);
			//char stream
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			long startTime = System.currentTimeMillis();
			String line = br.readLine();
			while(line != null){
				//System.out.println(line);
				line = br.readLine();
			}
			long endTime = System.currentTimeMillis();
			System.out.printf("Total Time : %s ms",(endTime-startTime));

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br != null){
					br.close();
				}
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