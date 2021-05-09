package com.example.thechefofficial.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thechefofficial.HomeActivity;
import com.example.thechefofficial.R;
import com.example.thechefofficial.ui.MypostListRecyclerViewAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {


    private FirebaseFirestore firebaseFirestore;


    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;
    private FirebaseUser user;
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private StorageReference storageReference;
    private CollectionReference postCollection = db.collection("recipe");
    private List<postModel> postList;
    private RecyclerView recyclerview;
    private MypostListRecyclerViewAdapter mypostListRecyclerViewAdapter;
    private TextView emptyList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
         View root = inflater.inflate(R.layout.fragment_home, container, false);

        firebaseAuth = FirebaseAuth.getInstance();
        user = firebaseAuth.getCurrentUser();

        postList = new ArrayList<>();

        return root;


    }
    @Override
    public void onStart() {
        super.onStart();
        postCollection
                .get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        if(!queryDocumentSnapshots.isEmpty()){

                            for(QueryDocumentSnapshot posts : queryDocumentSnapshots){
                                postModel post = posts.toObject(postModel.class);
                                postList.add(post);
                            }

                            mypostListRecyclerViewAdapter = new MypostListRecyclerViewAdapter(HomeFragment.this,postList);
                            recyclerview.setAdapter(mypostListRecyclerViewAdapter);
                            mypostListRecyclerViewAdapter.notifyDataSetChanged();
                        }else{
                            emptyList.setVisibility(View.VISIBLE);
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });
    }
}