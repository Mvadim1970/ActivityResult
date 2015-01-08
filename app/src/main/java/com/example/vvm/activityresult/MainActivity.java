package com.example.vvm.activityresult;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import util.RequestCode;

public class MainActivity extends ActionBarActivity {

    private TextView txtName;
    private TextView txtLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        txtName = (TextView) findViewById(R.id.txtName);
        txtLanguage = (TextView) findViewById(R.id.txtLanguage);
    }

    public void onShow(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btn_name:
                intent = new Intent(this, PresentsActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
                break;

            case R.id.btn_language:
                intent = new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_LANGUAGE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            switch (requestCode) {
                case RequestCode.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    txtName.setText("Рад знакомству, " + name);
                    break;
                case RequestCode.REQUEST_CODE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    txtLanguage.setText("Ваш язык: " + language);
                    break;
            }
        } else {
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
