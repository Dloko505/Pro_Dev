package edu.cnm.deepdive.dloko505.pro_dev;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;

public class ExpandableListAdaptor extends BaseExpandableListAdapter {

  private Context context;
  private List<String> listDataHeader;
  private HashMap<String,List<String>> listHashMap;

  public ExpandableListAdaptor(Context context, List<String>
      listDataHeader, HashMap<String, List<String>> listHashMap) {
    this.context = context;
    this.listDataHeader = listDataHeader;
    this.listHashMap = listHashMap;
  }

  @Override
  public int getGroupCount() {
    return listDataHeader.size();
  }

  @Override
  public int getChildrenCount(int i) {
    return listHashMap.get(listDataHeader.get(i)).size();
  }

  @Override
  public Object getGroup(int i) {
    return listDataHeader.get(i);
  }

  @Override
  public Object getChild(int i, int il) {
    return listHashMap.get(listDataHeader.get(i)).get(il);
    // i = Group Item, il = Child Item
  }

  @Override
  public long getGroupId(int i) {
    return i;
  }

  @Override
  public long getChildId(int i, int il) {
    return il;
  }

  @Override
  public boolean hasStableIds() {
    return false;
  }

  @Override
  public View getGroupView(int i, boolean b, View view,
      ViewGroup parent) {
    String headerTitle = (String)getGroup(i);
    if (view == null) {
      LayoutInflater inflater = (LayoutInflater)this.context.
          getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      view = inflater.inflate(R.layout.homework_list_group,null);
    }
    TextView exp_list_header = (TextView)view.findViewById(R.id.exp_list_header);
    exp_list_header.setTypeface(null, Typeface.BOLD);
    exp_list_header.setText(headerTitle);
    return view;
  }

  @Override
  public View getChildView(int i, int il, boolean b,
      View view, ViewGroup parent) {
    final String childText =  (String)getChild(i, il);
    if (view == null) {
      LayoutInflater inflater = (LayoutInflater)this.context.
          getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      view = inflater.inflate(R.layout.homework_list_item, null);
    }

    TextView txtListChild = (TextView)view.findViewById(R.id.exp_list_text);
    txtListChild.setText(childText);
    return view;
  }

  @Override
  public boolean isChildSelectable(int i, int il) {
    return true;
  }
}
