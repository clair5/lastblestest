package com.example.bletest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class TabFragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        getData();
    }

    RecyclerViewAdapter adapter;



    public void init(){
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
    }

    private void getData(){
        ItemData itemData = new ItemData(R.drawable.intro_logo, "mth Beacon을 이용한 문화관광플랫폼");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.eland, "대구 E랜드 별빛축제");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.ten, "스페인클럽 수성못점 제휴 할인");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.thr, "올 한해 체험코스 재진행합니다!!" );

        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.citybus, "대구 시티버스 ");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.su, "수험생 할인 이벤트!!");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.a, "아쿠아리움 연계 할인!!");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.sp, "스파크랜드 연계 할인 안내");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.pe, "대구인물기행 가이드 안내");
        adapter.addItem(itemData);
        itemData = new ItemData(R.drawable.food, "대구 한식체험 프로그램 소개");
        adapter.addItem(itemData);



    }
}


