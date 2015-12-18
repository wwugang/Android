package com.example.mytest;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	List<Map<String,Object>> list;
	LayoutInflater inflater;
	
	public MyAdapter(Context context){
		this.inflater = LayoutInflater.from(context);
	}
	
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position; 
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = inflater.inflate(R.layout.listview, null);
		
		TextView title = (TextView) view.findViewById(R.id.title);
		TextView time = (TextView) view.findViewById(R.id.time);
		TextView context = (TextView) view.findViewById(R.id.context);
		
		
		title.setText((String )list.get(position).get("title"));
		time.setText((String) list.get(position).get("time"));
		context.setText((String) list.get(position).get("context"));
		
		
		return view;
	}

}
