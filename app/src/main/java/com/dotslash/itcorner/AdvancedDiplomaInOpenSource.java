package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AdvancedDiplomaInOpenSource extends AppCompatActivity {

    ListView listdiploma;
    String[] DiplomaCourses = {"Duration : 3.5 Months\n" ,
            "Eligibility :\n" ,
            "BE | BTech | MCA | MCS | MCM | MSc | BCA | BCS | BSc etc\n" ,
            "Pre-requisite :\n" ,
            "Basic Knowledge of C Programming\n" ,
            "1) PROGRAMMING FUNDAMENTALS :\n" ,
            "Programming in C\n" ,
            " Introduction to Programming\n" ,
            "Data Types, Operators\n" ,
            "Compilation, Linking, Execution, Debugging\n" ,
            " Integrated Development Environment\n" ,
            " Console Input and Output\n" ,
            "Control Structures\n",
            " Pointers\n" ,
            " Storage classes, Dynamic Memory allocation\n" ,
            "Arrays, Strings\n" ,
            " File IO\n" ,
            " Structures and Unions\n" ,
            "Command Line arguments\n" ,
            "Macros\n" ,
            "Programming in C++\n" ,
            " Concepts of Object Oriented Programming\n" ,
            "Class and Object\n" ,
            "C++ as a better C\n" ,
            " Operator Overloading\n" ,
            "Inheritance\n" ,
            "Polymorphism\n" ,
            "File IO\n" ,
            "Exception Handling\n" ,
            " RTTI, Type Casting\n" ,
            "Templates\n" ,
            " Namespaces\n" ,
            "Standard Template Library\n" ,
            "Database Fundamentals & SQL\n" ,
            "Database fundamentals\n" ,
            "Normalization\n" ,
            "Stored Procedure, Function\n" ,
            "Triggers,Indexes, Clusters\n" ,
            "Introduction to OS & Networking\n" ,
            "Overview of Operating System\n" ,
            "Concept of Process and Thread\n" ,
            " Memory Management\n" ,
            "Network Basics\n" ,
            "Classification of Networks\n" ,
            "Network Topologies\n" ,
            "Network Communication and Protocols\n" ,
            "TCP/IP fundamentals\n" ,
            "2) WEB FUNDAMENTALS\n" ,
            "HTML\n" ,
            "HTML Basics: Structure, Elements and Attributes\n" ,
            "Various Input fields in html\n" ,
            "Tables, Frames, Lists, Layouts\n" ,
            "Fonts, Colors\n" ,
            " Images, Audio, Videos\n" ,
            "HTML Forms\n" ,
            "Cascading Style Sheet\n" ,
            "Java Script\n" ,
            "Java Script Language basics\n" ,
            "Variables, Data Types, Functions, Operators\n" ,
            "Control flow using conditional and Iterative statements\n" ,
            "Managing HTML DOM and Events\n" ,
            " Java Script Objects\n" ,
            "Window Management using Java Script\n" ,
            "3) OPEN SOURCE TECHNOLOGIES\n" ,
            "Linux\n" ,
            "Introduction to Linux\n" ,
            "The Linux File System\n" ,
            "Getting Started to Linux\n" ,
            "Basic Commands\n" ,
            " Pipes and Filters\n" ,
            " Using vi Editor\n" ,
            "Linux Shell Programming\n" ,
            "Process, Signals\n" ,
            "Semaphore and Mutex\n" ,
            "Inter-process Communication\n" ,
            " POSIX Threads\n" ,
            "PHP\n" ,
            "Basics of PHP\n" ,
            "Using Web Forms\n" ,
            "Data Validation\n" ,
            "Session and State management\n" ,
            "User Identification\n" ,
            " Working with Databases\n" ,
            "Handling XML\n" ,
            "File Handling\n" ,
            " Sending Emails\n" ,
            "Regular Expressions\n" ,
            " AJAX using PHP\n" ,
            "MySQL\n" ,
            "Installation and Administration\n" +
                    "Connection to MySQL\n" +
                    "MySQL Data types\n" +
                    "Creating database and Tables\n" +
                    " Select, Insert, Update, Delete\n" +
                    "MySQL Regular Expression\n" +
                    "\tJoins\n" +
                    "Transactions\n" +
                    " Indexes and Sequences\n" +
                    "PERL\n" +
                    "\n" +
                    "Installation and Setting\n" +
                    "Perl Variables, scalars\n" +
                    "Arrays and Hashes\n" +
                    "Control flow statements\n" +
                    " Perl File IO\n" +
                    "Subroutines\n" +
                    "\tRegular Expressions\n" +
                    "Object Oriented Perl\n" +
                    "PYTHON\n" +
                    "\n" +
                    "Installation and Setting\n" +
                    "Understanding Python environment\n" +
                    "Python Data types\n" +
                    "Basic Operators and Control Structures\n" +
                    " Collection classes\n" +
                    "File IO using Python\n" +
                    "Handling Exceptions\n" +
                    "CGI Programming\n" +
                    "Handling Databases\n" +
                    "4) INTERVIEW SKILLS\n" +
                    "Interview Techniques\n" +
                    "Frequently Asked Questions\n" +
                    "Group Discussion\n" +
                    "Resume Writing\n" +
                    "Mock Test Based on MNC Test Pattern\n" +
                    "5) EVALUATION\n" +
                    "Technical Assignments\n" +
                    "Technical Test\n" +
                    "Technical Interview\n" +
                    "6) INTERNATIONAL CERTIFICATION\n" +
                    "Guidance for International Certification\n" +
                    "7) PROJECT (OPTIONAL)\n" +
                    "Design\n" +
                    "Development"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_diploma_in_open_source);

        hookUp();
        addClickListener();
        fillcourses();
    }

    void hookUp() {
        listdiploma = (ListView) findViewById(R.id.listdiploma);
    }

    private void fillcourses() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DiplomaCourses);
        listdiploma.setAdapter(adapter);
    }

    private void addClickListener() {
        listdiploma.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(AdvancedDiplomaInOpenSource.this, listdiploma.getAdapter().getItem(i).toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
