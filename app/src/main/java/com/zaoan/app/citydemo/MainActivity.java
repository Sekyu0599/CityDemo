package com.zaoan.app.citydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     * 初始化控件
     */
    private void initView(){
        btnLocation=(Button)findViewById(R.id.main_btnLocation);
        btnLocation.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btnLocation:
                //定位信息
                Intent intent=new Intent(MainActivity.this,LocationInfoActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
