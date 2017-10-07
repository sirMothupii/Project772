package com.example.mothupii_.project176;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mothupii_ on 2017-10-07.
 */

public class ChatArrayAdapter extends ArrayAdapter<ChatMessage>
{

    private TextView chatText;
    private List<ChatMessage> chatMessageList = new ArrayList<ChatMessage>();
    private Context context;

    @Override
    public void add(ChatMessage object)
    {
        chatMessageList.add(object);
        super.add(object);
    }


    public ChatArrayAdapter(@NonNull Context context, @LayoutRes Object resource)
    {
        super(context, (Integer) resource);
    }

    public int getCount()
    {
        return this.chatMessageList.size();
    }
    public ChatMessage getItem(int index)
    {
        return this.chatMessageList.get(index);
    }
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ChatMessage chatMessageObj = getItem(position);
        View row = convertView;
        LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (chatMessageObj.left) {
            row = inflater.inflate(R.layout.activity_i_socialize_right, parent, false);
        }else{
            row = inflater.inflate(R.layout.activity_i_socialize_left, parent, false);
        }
        chatText = (TextView) row.findViewById(R.id.msgr);
        chatText.setText(chatMessageObj.message);
        return row;
    }
}
