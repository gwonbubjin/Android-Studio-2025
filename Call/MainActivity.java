package com.example.call;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 찾기
        Button callButton = findViewById(R.id.button);

        // 클릭 이벤트 리스너 설정
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClicked(v);
            }
        });
    }

    // 전화 걸기 메서드
    public void onClicked(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:010-1234-5678"));
        startActivity(intent);
    }
}

