package com.example.calllogrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ModelCallLog> callLogList;
    private  AdpaterCallLogRecyc adpater;
    private RecyclerView recyclerViewCallLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewCallLog=findViewById(R.id.recycCallLog);


        initList();
        adpater=new AdpaterCallLogRecyc(callLogList,MainActivity.this);
        recyclerViewCallLog.setAdapter(adpater);
        recyclerViewCallLog.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    void initList(){
        callLogList=new ArrayList<>();
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man1,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man2,
                        R.drawable.icon_call,
                        CallType.DialedCall,
                        "Adib",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man3,
                        R.drawable.icon_call,
                        CallType.ReceivedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man4,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
        callLogList.add(
                new ModelCallLog(
                        R.drawable.man5,
                        R.drawable.icon_call,
                        CallType.MissedCall,
                        "Partha",
                        "Teletalk 3G",
                        "9:32 PM",
                        "Bangladesh"));
    }
}