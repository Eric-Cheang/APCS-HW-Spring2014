import java.io.IOException;
import java.util.logging.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class WebsiteParser{

  public static void main(String[] args)  {
    try {
      String url = "https://tanmoy_mahathir.makes.org/thimble/146";
      Document doc = Jsoup.connect(url).get();
      Elements paragraphs = doc.select("p");
      for(Element p : paragraphs)
        System.out.println(p.text());
    } 
    catch (IOException ex) {
      Logger.getLogger(WebsiteParser.class.getName())
            .log(Level.SEVERE, null, ex);
    }
  }
}