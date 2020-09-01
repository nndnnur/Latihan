package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button satu;
    Button dua;
    Button tiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        satu = (Button)findViewById(R.id.satu);
        satu.setOnClickListener((View.OnClickListener) this);
        dua = (Button)findViewById(R.id.dua);
        dua.setOnClickListener((View.OnClickListener) this);
        tiga = (Button)findViewById(R.id.tiga);
        tiga.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.satu:
                Intent satu = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(satu);
                break;
            case R.id.dua:
                Intent dua = new Intent(Intent.ACTION_VIEW, Uri.parse("https://careerfoundry.com/en/blog/ui-design/what-does-a-ui-designer-actually-do/?utm_campaign=UID_SC_1_intro&utm_medium=email&utm_content=68687494&utm_source=hs_automation"));
                startActivity(dua);
                break;
            default:
                break;
        }
    }
}