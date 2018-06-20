package edu.cnm.deepdive.dloko505.pro_dev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeworkActivity extends AppCompatActivity {

  private ExpandableListView mListView;
  private ExpandableListAdaptor mListAdaptor;
  private List<String> mListDataHeader;
  private HashMap<String,List<String>> mListHash;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_homework);

    mListView = findViewById(R.id.exp_list);
    initData();
    mListAdaptor = new ExpandableListAdaptor(this, mListDataHeader, mListHash);
    mListView.setAdapter(mListAdaptor);
  }

  private void initData() {
    mListDataHeader = new ArrayList<>();
    mListHash = new HashMap<>();

    mListDataHeader.add("Balancing Left and Right Brain");
    mListDataHeader.add("Elevator Pitch");
    mListDataHeader.add("Golden Circle");
    mListDataHeader.add("Quantitative and Qualitative");
    mListDataHeader.add("Stove Top Goals");

    List<String> balancing_left_right_brain = new ArrayList<>();
    balancing_left_right_brain.add("I am always trying to learn something new whether its work or project related or just \n"
        + "something I find interesting. Ripping stuff apart and putting it back together to figure \n"
        + "out how it works, reading a book on a new topic, or even just going google crazy I find its\n"
        + "like an escape for me to just retreat from a stressful day and learn something different.");

    List<String> elevator_pitch = new ArrayList<>();
    elevator_pitch.add("Hi my name is August. I am an learning software development with the hopes of creating tools to help my fellow \n"
        + "automotive and audio technicians and maybe some games for entertaining my children and myself. I'm doing this with\n"
        + "the help of Deep Dive Coding and my strive to be successful in my career to provide and be a better roll model for my family.");

    List<String> golden_circle = new ArrayList<>();
    golden_circle.add("Why:\n"
        + "Every morning I wake get up to support and care for my sons\n"
        + "\n"
        + "How:\n"
        + "I am constantly learning new skills and builing upon my coding, cooking, and mechanical skills.\n"
        + "\n"
        + "what:\n"
        + "Reading and lots of practice");

    List<String> quantitative_qualitative = new ArrayList<>();
    quantitative_qualitative.add("Quantitative\n"
        + "1. I have received 4 of my ASE certs.\n"
        + "2. I received my fundamentals and associates degree in Auto Tech\n"
        + "3.\n"
        + "\n"
        + "Qualitative\n"
        + "1. I am almost always trying to learn something new.\n"
        + "2. \n"
        + "3.");

    List<String> stove_top_goals = new ArrayList<>();
    stove_top_goals.add("BACK BURNERS\n"
        + "\n"
        + "1. Start a business\n"
        + "   -build up my portfolio\n"
        + "   -build up my presence in my community and surrounding areas\n"
        + "   -\n"
        + "\n"
        + "2. Become proficient in shell scripting\n"
        + "   -install Ubuntu and get rid of Windows.\n"
        + "   -practice\n"
        + "   -Practice!\n"
        + "   \n"
        + "FRONT BURNERS\n"
        + "\n"
        + "1. Build and release my first app\n"
        + "   -study android more\n"
        + "   -figure out what technologies are required and how to implement them\n"
        + "   -research app stores and what may be required \n"
        + "   \n"
        + "2. Complete bootcamp and get certs.\n"
        + "   -study\n"
        + "   -do homework\n"
        + "   -go to class\n"
        + "   -pay attention\n"
        + "  ");

    mListHash.put(mListDataHeader.get(0), balancing_left_right_brain);
    mListHash.put(mListDataHeader.get(1), elevator_pitch);
    mListHash.put(mListDataHeader.get(2), golden_circle);
    mListHash.put(mListDataHeader.get(3), quantitative_qualitative);
    mListHash.put(mListDataHeader.get(4), stove_top_goals);

  }
}
