package com.example.knou_prac1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*
   // Button 예제
    public void onButtonClick(View view) {
        TextView text1 = (TextView) findViewById(R.id.text1); // id가 text1인 뷰를 찾아서 바인딩함.
        TextView text2 = (TextView) findViewById(R.id.text2); // id가 text2인 뷰를 찾아서 바인딩함.

        if (view.getId() == R.id.bt1) text1.setText("안녕"); // 클릭된 뷰(버튼)의 아이디가 bt1과 같다면 text1뷰에 "안녕"이라는 글자를 출력함.
        if (view.getId() == R.id.bt2) text2.setText("세계"); // 클릭된 뷰(버튼)의 아이디가 bt2와 같다면 text2뷰에 "세계"라는 글자를 출력함.
        }
 */


/*
    // EditText 예제
    public void onButtonClick(View view) {
        EditText edit = (EditText) findViewById(R.id.edit); // id가 edit인 뷰를 찾아서 바인딩함.
        String str = edit.getText().toString(); // EditText뷰에 입력된 텍스트를 문자열로 가져옴.
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
*/


    // Switch 예제
    public void onButtonClick(View view) {
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        TextView text1 = (TextView) findViewById(R.id.textResult);

        if(view.getId() == R.id.bt1) {
                if(switch1.isChecked()) { // switch1이 체크된 경우 (-> true)
                    text1.setText("Switch On");
                } else {  // switch1이 체크되지 않은 경우 (-> false)
                    text1.setText("Switch Off");
                }
        }
    }

}
