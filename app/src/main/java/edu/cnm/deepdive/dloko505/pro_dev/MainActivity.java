package edu.cnm.deepdive.dloko505.pro_dev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  private Button mHomeworkButton;
  private Button mProjectsButton;

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
  }
}
