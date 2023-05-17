package Com.Scaler;

import http.client;

public class Main
{
    public static void main(String[] args) {

        client c = new client();
        String response = c.get("https://square.github.io/okhttp/");
        System.out.println(response);

    }

}