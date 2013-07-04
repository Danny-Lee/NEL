import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CmdTest {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process p;
		try {
			p = rt.exec("ls ../../raw");
			InputStream in  = p.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
