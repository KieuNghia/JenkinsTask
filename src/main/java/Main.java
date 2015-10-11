import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

    public static void main(String args[]) throws IOException {

        URL website = new URL("https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt");
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("File.txt");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }
}
