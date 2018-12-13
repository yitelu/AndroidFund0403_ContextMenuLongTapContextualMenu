package com.ytl.contextmenuoption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView article_text = findViewById(R.id.tv_world);
        registerForContextMenu(article_text);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_contact_settings:
                Toast.makeText(this, "clicked setting", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_contact_share:
                Toast.makeText(this, "clicked share", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_contact_delete:
                Toast.makeText(this, "clicked delete", Toast.LENGTH_SHORT).show();
                return true;
            default:
                //return super.onContextItemSelected(item);
                return super.onContextItemSelected(item);
        }
    }
}
