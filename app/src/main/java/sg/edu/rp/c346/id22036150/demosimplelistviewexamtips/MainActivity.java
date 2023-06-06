package sg.edu.rp.c346.id22036150.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    ListView lvExamTips2;
    String[] tips;
    ArrayList<String> alTips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);
        lvExamTips2 = findViewById(R.id.listViewExamTips2);


        tips = new String[5];
        tips[0] = "Don't just read the code, code it as much as possible during each practical session";
        tips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        tips[2] = "Prepare your template source code for each topic";
        tips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        tips[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, tips);

        lvExamTips.setAdapter(adapter);


        alTips = new ArrayList<>();
        alTips.add("Don't just read the code, code it as much as possible during each practical session");
        alTips.add("Seek help from the lecturer ASAP, don't wait till you lost in the jungle");
        alTips.add("Prepare your template source code for each topic");
        alTips.add("Create a few empty Android projects to speed up your coding during the exam");
        alTips.add("Ensure that your Android Studio is up and running before the exam");

        ArrayAdapter adapter2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, tips);

        lvExamTips2.setAdapter(adapter2);

    }
}