package edu.cnm.deepdive.dloko505.pro_dev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  private Button mHomeworkButton;
  private Button mProjectsButton;
  private ImageButton mImageButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mHomeworkButton = (Button) findViewById(R.id.homework_button);
    mHomeworkButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, HomeworkActivity.class);
        startActivity(intent);
        // Start HomeworkActivity
      }
    });

    mProjectsButton = (Button) findViewById(R.id.projects_button);
    mProjectsButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, ProjectsActivity.class);
        startActivity(intent);
        // Start ProjectsActivity
      }
    });

    mImageButton = (ImageButton) findViewById(R.id.head_shot);
    mImageButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
        startActivity(intent);
        // Start AboutMeActivity
      }
    });

  }
}
