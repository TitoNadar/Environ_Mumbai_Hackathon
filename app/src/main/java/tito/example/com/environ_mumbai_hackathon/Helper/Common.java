package tito.example.com.environ_mumbai_hackathon.Helper;

import tito.example.com.environ_mumbai_hackathon.Interface.WaterService;
import tito.example.com.environ_mumbai_hackathon.Remote.RetrofitClient;

/**
 * Created by tito on 10/3/18.
 */

public class Common {
    private static String Base_Url="https://api.data.gov.in/";

    public static WaterService getWaterService()
    {
        return RetrofitClient.getclient(Base_Url).create(WaterService.class);
    }
}
