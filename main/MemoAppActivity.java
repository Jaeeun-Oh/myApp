package com.example.myapplication;

import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;

public class MemoAppActivity extends AppCompatActivity {
    EditText mMemoEdit = null;
    MemoActivity mMemoActivity = new MemoActivity(this);

    public MemoAppActivity() throws FileNotFoundException {
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        mMemoEdit = (EditText)findViewById(R.id.memo_edit);
    }

    public void onClick(View v){
        switch(v.getId()){
            case  R.id.load_btn:{
                String memoData = mMemoActivity.load();
                mMemoEdit.setText(memoData);

                Toast.makeText(this,"불러오기 완료",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.save_button:{
                String memoData = mMemoEdit.getText().toString();
                mMemoActivity.save(memoData);
                mMemoEdit.setText("");

                Toast.makeText(this,"저장완료",Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.delete_btn:{
                mMemoActivity.delete();
                mMemoEdit.setText("");
                Toast.makeText(this,"삭제완료",Toast.LENGTH_LONG).show();
            }
        }
    }
}
