import java.io.*;

class WriteFileDemo3 {
		
	public static void main(String[] args){
		FileWriter writer = null;
		try{
			writer = new FileWriter("C:/java work/demos/day8/fun.txt");
			writer.write("Bahubali 1 is a nice movie.\n");
			System.out.println("Done");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(writer != null){
					writer.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}		
	}
}