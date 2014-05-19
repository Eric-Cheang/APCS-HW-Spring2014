import java.io.*;
import java.util.*;


public class AMSCOParser{

	String content = "";
	int chapterTracker = 1;

	public void readFile() throws IOException{
		File file = new File("test.txt");
		Scanner scanner = new Scanner(file);
		String retVar = "";

		while (scanner.hasNextLine()){
			System.out.println("adding");
			retVar = retVar + scanner.nextLine();
		}
		content = retVar;
	}

	public String getContent(){
		return content;
	}

	public void createChapterFile(int startPage, int endPage){
		int startPageInt = content.indexOf("\n" + startPage);
		int endPageInt = content.indexOf("\n" + endPage);

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("" + chapterTracker), "utf-8"))) {
   			 writer.write(content.substring(startPageInt,endPageInt + 10));
   			 chapterTracker++;
		} catch (IOException ex){
    	System.out.println("phuck my ass");
	}  

	content = content.substring(endPageInt);

}

	public static void main(String[] args) {
		AMSCOParser parser = new AMSCOParser();
		try{
			System.out.println("running");
			parser.readFile();
		}
		catch(Exception e){
			System.out.println("penis");
		}

		//int[] chapters = {1,14,23,37,42,55,60,70,77,89,96,114,121,134,140,157,166,178,184,195,202,213,221,233,240,256,265,282,287,303,310,326,333,348,358,372,380,393,400,417,424,441,447,462,470,484,492,512,518,537,545,562,570,585,593,612,619,634,642,673};

		//int[] chapters = {1,2,3,4}
//
		//for(int x = 0; x < chapters.length-2; x++){
		//	parser.createChapterFile(chapters[x],chapters[x+1]);
		//}
//
		
		System.out.println(parser.getContent().indexOf(""+1+" "));
		System.out.println(parser.getContent());


		}
	}
