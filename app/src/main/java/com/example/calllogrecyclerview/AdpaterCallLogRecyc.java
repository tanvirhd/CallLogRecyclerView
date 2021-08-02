package com.example.calllogrecyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdpaterCallLogRecyc extends  RecyclerView.Adapter<AdpaterCallLogRecyc.ViewHholderAdpaterCallLogRecyc>{
    private static final String TAG = "AdpaterCallLogRecyc";
    List<ModelCallLog> callLogList;
    Context context;

    public AdpaterCallLogRecyc(List<ModelCallLog> callLogList, Context context) {
        this.callLogList = callLogList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHholderAdpaterCallLogRecyc onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_calllog,parent,false);
        ViewHholderAdpaterCallLogRecyc viewHholderAdpaterCallLogRecyc=new ViewHholderAdpaterCallLogRecyc(view);
        return viewHholderAdpaterCallLogRecyc;
    }

    @Override
    public void onBindViewHolder(@NonNull  AdpaterCallLogRecyc.ViewHholderAdpaterCallLogRecyc holder, int position) {
        Log.d(TAG, "onBindViewHolder: called for item at "+position);

        holder.callerName.setText(callLogList.get(position).getCallerName());
        holder.operatorName.setText(callLogList.get(position).getOperatorName());
        holder.callTime.setText(callLogList.get(position).getCallTime());
        holder.countryName.setText(callLogList.get(position).getCountryName());

        holder.ivProfile.setImageResource(callLogList.get(position).getImage());
        holder.ivCallIcon.setImageResource(callLogList.get(position).getDialIcon());

        switch (callLogList.get(position).getCallType()){
            case "MissedCall":
                holder.ivCallType.setImageResource(R.drawable.icon_missedcall);
                break;
            case "DialedCall":
                holder.ivCallType.setImageResource(R.drawable.icon_dialcall);
                break;
            case "ReceivedCall":
                holder.ivCallType.setImageResource(R.drawable.icon_receivedcall);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return callLogList.size();
    }



    class ViewHholderAdpaterCallLogRecyc extends RecyclerView.ViewHolder{

        TextView callerName,countryName,callTime,operatorName;
        ImageView ivCallIcon,ivProfile,ivCallType;

        public ViewHholderAdpaterCallLogRecyc(@NonNull View itemView) {
            super(itemView);
            callerName=itemView.findViewById(R.id.tvCallerName);
            countryName=itemView.findViewById(R.id.tvCounytryName);
            callTime=itemView.findViewById(R.id.tvCallTime);
            operatorName=itemView.findViewById(R.id.tcOperatorName);

            ivCallIcon=itemView.findViewById(R.id.ivCallIcon);
            ivCallType=itemView.findViewById(R.id.ivCallTypeIcon);
            ivProfile=itemView.findViewById(R.id.ivProfile);
        }
    }
}
