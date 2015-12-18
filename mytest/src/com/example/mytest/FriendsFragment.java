package com.example.mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class FriendsFragment extends Fragment {

	private ListView listView1;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.friends, container, false);
		// 1. ��ȡListView����
		ListView listview = (ListView) view.findViewById(R.id.listView1);

		// 2. ׼������Դ
		ArrayList<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 1; i <= 40; i++) {
			HashMap<String, Object> hashMap = null;
			map = new HashMap<String, Object>();

			map.put("title", "����" + i);
			map.put("context", "��ͨ�����ĺ�������");
			map.put("time", "����");

			list.add(map);
		}
		// 3. ׼��������Adapter
		MyAdapter adapter = new MyAdapter(this.getActivity());
		adapter.setList(list);
		// 4. ��������������ListView
		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(getActivity(), "�����������"+ (position+1) , 0).show();
				Intent intent = new Intent(getActivity(),Itemclick.class);
				startActivity(intent);
			}
		});
		return view;
	}		
}
