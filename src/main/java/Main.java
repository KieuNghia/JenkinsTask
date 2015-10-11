import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Calendar;

public class Main {

    public static void main(String args[]) throws IOException {

        URL website = new URL("https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        Calendar calendar = Calendar.getInstance();
        String time = ""+  calendar.get(Calendar.HOUR) +":"+ calendar.get(Calendar.MINUTE)+"";
        FileOutputStream fos = new FileOutputStream("File" +time+".txt");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        System.out.println("File "+time+"  created");
    }
}


