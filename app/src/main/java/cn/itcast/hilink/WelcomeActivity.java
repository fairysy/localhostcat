package cn.itcast.hilink;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // 获取 "开始" 按钮并设置点击事件
        ImageButton btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 MainActivity，并传递 auto_search 参数
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                intent.putExtra("auto_search", true); // 自动开始扫描设备
                startActivity(intent);
            }
        });

        // 获取 "关于" 按钮并设置点击事件
        Button btnAbout = findViewById(R.id.aboutButton);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 AboutActivity
                Intent intent = new Intent(WelcomeActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        // 获取 "设备详情" 按钮并设置点击事件
        Button btnDeviceInfo = findViewById(R.id.btnArpAssign);
        btnDeviceInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 DeviceInfoActivity
                Intent intent = new Intent(WelcomeActivity.this, DeviceInfoActivity.class);
                startActivity(intent);
            }
        });

        // 获取“磁场探测”按钮并设置点击事件
        Button btnMagnetic = findViewById(R.id.btnArp);
        btnMagnetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 跳转到 MagneticFieldActivity
                Intent intent = new Intent(WelcomeActivity.this, MagneticFieldActivity.class);
                startActivity(intent);
            }
        });











    }
}
