package tito.example.com.environ_mumbai_hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import tito.example.com.environ_mumbai_hackathon.Interface.WaterService;

public class River_Details extends AppCompatActivity {
private TextView temperature,phlevel,dissolved_oxygen,nitrigen,fecal;
Button forum,pil,ngo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_river__details);
        temperature=findViewById(R.id.temperature);
        phlevel=findViewById(R.id.phlevel);
        dissolved_oxygen=findViewById(R.id.oxygenamt);
        nitrigen=findViewById(R.id.nitrate_content);
        fecal=findViewById(R.id.fecal);
        if(getIntent()!=null)
        {
         temperature.setText(getIntent().getStringExtra("temp"));
         phlevel.setText(getIntent().getStringExtra("phlevel"));
         dissolved_oxygen.setText(getIntent().getStringExtra("oxygen"));
         nitrigen.setText(getIntent().getStringExtra("nitrate"));
         fecal.setText(getIntent().getStringExtra("fecal"));
        }


    }
}
