package tito.example.com.environ_mumbai_hackathon.Remote;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by tito on 10/3/18.
 */

public class RetrofitClient {
    private static Retrofit retrofit=null;
    public static Retrofit getclient(String baseUrl)
    {
        //Base URLs should always end in /.

        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
