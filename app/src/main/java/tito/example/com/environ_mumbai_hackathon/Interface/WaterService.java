package tito.example.com.environ_mumbai_hackathon.Interface;

import retrofit.Call;
import retrofit.http.GET;
import tito.example.com.environ_mumbai_hackathon.Model.Data;

/**
 * Created by tito on 10/3/18.
 */

public interface WaterService {

    @GET("resource/4d4250cb-e7dd-4f50-a3f7-c564a0533844?format=json&api-key=579b464db66ec23bdd000001a7acbad520184374518be6f67ffe8515")
    Call<Data> getData();
}
