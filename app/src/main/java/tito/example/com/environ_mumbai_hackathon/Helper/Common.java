package tito.example.com.environ_mumbai_hackathon.Helper;

import tito.example.com.environ_mumbai_hackathon.Interface.AirService;
import tito.example.com.environ_mumbai_hackathon.Interface.WaterService;
import tito.example.com.environ_mumbai_hackathon.Remote.RetrofitClient;

/**
 * Created by tito on 10/3/18.
 */

public class Common {
    private static String Base_Url="https://api.data.gov.in/";

    private static String Air_Base_Url="https://api.breezometer.com/";

    public static String API_KEY_AIR = "3c7fdf7e1c8940e7872d571b906af0f1";

    public static WaterService getWaterService()
    {
        return RetrofitClient.getclient(Base_Url).create(WaterService.class);
    }

    public static AirService getAirService()
    {
        return RetrofitClient.getclient(Air_Base_Url).create(AirService.class);
    }


    public static String getApiUrl(String lat,String lon,String key)
    {
        StringBuilder stringBuilder=new StringBuilder("https://api.breezometer.com/baqi/?");
        stringBuilder.append("lat=").append(lat).append("&lon=").append(lon).append("&key=").append(key);
        return stringBuilder.toString();
    }

}
