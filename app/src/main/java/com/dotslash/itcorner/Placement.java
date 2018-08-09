package com.dotslash.itcorner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Placement extends AppCompatActivity {

    ListView lvProducts;
    String[] products={"Sardonyx Infosoft LLP",
            "Rack Infotech pvt. Ltd.",
            "Simplicity creation technology pvt Ltd.",
            "Einfochips Pvt. Ltd.",
            "Beeinspire",
            "Afour Tech Pvt. Ltd.",
            "Acrotrend I Pvt. Ltd.",
            "Data Soft Infotech",
            "Everrest Web Solutions",
            "Magneto Infotech",
            "Dexirity Solutions Pvt. Ltd.",
            "Vatsa Solutions pvt. Ltd.",
            "E-Biz",
            "technolabz",
            "Ameya Software",
            "Amrut Software-Mumbai",
            "Captura protechnology pvt ltd-Pune",
            "RAC IT solution India Pvt Ltd-Pune",
            "Outthinking Pvt Ltd- Bangalore",
            "Edzeal technologies Pvt Ltd- Pune",
            "Durotech Pvt Ltd- Pune",
            "Data bit technologies pvt ltd-Pune",
            "Vrishank IT solution Pvt td-Pune",
            "Apacer Technology Pvt Ltd-Pune",
            "Dynamic IT Training & Staffing Pvt Ltd",
            "Linked My Career Pune"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placement);

        hookUp();
        addClickListener();
        fillProducts();
    }

    void hookUp() {
        lvProducts = (ListView) findViewById(R.id.lvProducts);
    }
    void fillProducts(){
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,products);
        lvProducts.setAdapter(adapter);
    }
    void addClickListener() {
        lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                Toast.makeText(Placement.this, lvProducts.getAdapter().getItem(position).toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}
