package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Cprogram extends AppCompatActivity {

    ListView lv;
    String[] Courses = {" Duration : 80 Hrs\n",
            "Pre-requisite :\n" +
                    "Basic Computer Knowledge\n",
            "Contents :\n",
            " Introduction to C\n",
            "Tokens, Expressions, Data Types,Operators\n",
            " Control Flow statements: Conditional,Iterative\n",
            "Functions\n",
            " Pointers\n",
            " Arrays: 1D, 2D\n",
            " Strings\n",
            " Storage Classes\n",
            " Dynamic Memory Allocation\n",
            " Structure, Union\n",
            " File Handling and Input Output Management\n",
            " Linked List\n",
            " Searching and Sorting techniques\n",
            " Miscellaneous: Command Line parameters, Pre-processor directives, \n",
            "Variable number of parameters\n",
            "Key Learnings :\n",
            " Ability to analyze problem statement and design algorithms\n",
            "Implement algorithms in C.\n",
            " Use Integrated Development environments (IDE) for development,execution and debugging applications.\n",
            "Understand memory level details of programming.\n",
            "Recommended Next Course :\n",
            " Any Object oriented programming language like C++ (recommended), Java,C#"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cprogram);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        lv = (ListView) findViewById(R.id.lv);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Courses);
        lv.setAdapter(adapter);
    }

    private void addClickListener() {
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(Cprogram.this,lv.getAdapter().getItem(i).toString(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
