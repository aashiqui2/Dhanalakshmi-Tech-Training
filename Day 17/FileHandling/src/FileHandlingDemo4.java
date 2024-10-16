import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo4 {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Aashiq\\Documents\\DS TECH\\Day 17\\FileHandling\\src\\Test\\1.txt");
		FileWriter write=new FileWriter(file,true); 
		write.write("🎈");
		write.write("hello");
		write.flush();

	}

}
