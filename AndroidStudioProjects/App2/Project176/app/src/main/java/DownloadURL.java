import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Mothupii_ on 2017-10-07.
 */

public class DownloadURL
{
    public String readUrl(String theUrl)
        //throwing exceptions her for inputStreamReader.close method
            throws IOException
    {
        String data = "";
        InputStream inputStream = null;
        HttpURLConnection urlConnection = null;

        //Instantiating the url
        //Exceptional handling for the URL instantiation
        try
        {
            URL url = new URL(theUrl);
            urlConnection =(HttpURLConnection) url.openConnection();
            urlConnection.connect();

            inputStream = urlConnection.getInputStream();
            //Instantiation of the buffer reader
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            //instantiation of the "string buffered reader"
            StringBuffer sb = new StringBuffer();

            String line ="";
            //while loop for the buffered reader
            while
                    ((line = br.readLine()) != null);
            {
                sb.append(line);
            }
            data = sb.toString();
            br.close();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        //catch clause for opening URL connection
        catch (IOException e)
        {
            e.printStackTrace();
        }

        finally
        {
            //closing statements
            inputStream.close();
            urlConnection.disconnect();
        }
        return data;
    }
}
