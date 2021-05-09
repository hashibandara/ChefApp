package com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.officialcookit.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    //private  DatabaseReference databaseReference;
    //private ValueEventListener eventListener;
    //ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

       // progressDialog=new ProgressDialog(this);
       // progressDialog.setMessage("Item Loading....");



        myFoodList=new ArrayList<>();

        final MyAdapter myAdapter=new MyAdapter(MainActivity.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);

       // databaseReference=FirebaseDatabase.getInstance().getReference("Recipe");

        //progressDialog.show();

        //eventListener=databaseReference.addValueEventListener(new ValueEventListener() {
          //@Override
          // public void onDataChange(@NonNull DataSnapshot snapshot) {
               // myFoodList.clear();
              //  for (DataSnapshot itemSnapshot:snapshot.getChildren() )
             //  {
               //    FoodData foodData=itemSnapshot.getValue(FoodData.class);
                 //   myFoodList.add(foodData);
              //  }
                //myAdapter.notifyDataSetChanged();
                //progressDialog.dismiss();
            }

            //@Override
           // public void onCancelled(@NonNull DatabaseError error) {
            //    progressDialog.dismiss();

           // }
        //});
   // }

    public void btn_uploadActivity(View view) {
        startActivity(new Intent(this,Upload_Recipe.class));
    }
}