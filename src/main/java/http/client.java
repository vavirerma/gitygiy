package http;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.sql.SQLOutput;

public class client
{
    OkHttpClient okclient;
    public client(){
        okclient=new OkHttpClient();
    }
    public String get(String url)
    {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            return okclient.newCall(request).execute().body().string();
        }
        catch (IOException e)
        {
            System.out.println("Error message"+e.getMessage());
            return null;
        }
    }

}
