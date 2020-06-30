/*어플리케이션 실행 시 첫 화면 동작 코드 */
package com.example.myapplication;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //2000동안 기다린 후 메인액티비티 실행
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
