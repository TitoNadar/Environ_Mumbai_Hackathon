package tito.example.com.environ_mumbai_hackathon.Interface;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Url;
import tito.example.com.environ_mumbai_hackathon.Model.Data_air;

/**
 * Created by tito on 10/3/18.
 */

public interface AirService {
    @GET("")
    Call<Data_air> getAirData(@Url String url);
}
