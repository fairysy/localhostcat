package cn.itcast.hilink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    private Button checkForUpdateButton;
    private TextView customerService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        checkForUpdateButton = findViewById(R.id.checkForUpdateButton);
        customerService = findViewById(R.id.customerService);

        // 点击客服电话拨打电话
        customerService.setOnClickListener(view -> {
            String phoneNumber = "10086"; // 客服电话
            Intent dialIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
            startActivity(dialIntent);
        });

        // 点击“检查更新”按钮
        checkForUpdateButton.setOnClickListener(view -> {
            checkForUpdates();
        });
    }

    /**
     * 检查更新的功能
     */
    private void checkForUpdates() {
        // 此处可以通过网络请求检查是否有新版本
        // 这里只是模拟一个提示
        Toast.makeText(this, "正在检查更新...", Toast.LENGTH_SHORT).show();
        // 如果有更新，弹出提示框，进行更新
        // 如果没有更新，提示已是最新版本
        // 这里的示例只是模拟
        Toast.makeText(this, "当前已是最新版本", Toast.LENGTH_SHORT).show();
    }
}
