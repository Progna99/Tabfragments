package com.example.tableviewfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentDebit extends Fragment {
    View v;
    private RecyclerView myrecyclerdebit;
    private List<Debit> debit1;

    public FragmentDebit() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.debitfragment,container,false);
        myrecyclerdebit=(RecyclerView) v.findViewById(R.id.recycler2);
        RecyclerDebit adapter1=new RecyclerDebit(getContext(),debit1);
        myrecyclerdebit.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerdebit.setAdapter(adapter1);
        return v;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        debit1=new ArrayList<>();
        debit1.add(new Debit(R.drawable.hdfc));
        debit1.add(new Debit(R.drawable.citi));
    }



}





