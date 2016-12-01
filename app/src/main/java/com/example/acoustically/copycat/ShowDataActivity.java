package com.example.acoustically.copycat;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ShowDataActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_show_data);
    Intent intent = getIntent();
    String mStringData = intent.getStringExtra("StringData");
    buildTextView(mStringData);
  }
  private void buildTextView(String string) {
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
      ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    layoutParams.setMargins(20, 20, 10, 10);
    TextView textView = new TextView(this);
    textView.setText(string);
    textView.setPadding(10, 10 ,10 ,10);
    textView.setLayoutParams(layoutParams);
    LinearLayout layout = (LinearLayout)findViewById(R.id.TextDataView);
    layout.addView(textView);
  }

}
