package com.example.vvm.activityresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class PresentsActivity extends ActionBarActivity {

    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.present_layout);

        editName = (EditText) findViewById(R.id.editName);
    }

    public void onPresented (View view) {
        Intent intent = new Intent();
        intent.putExtra("name", editName.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
