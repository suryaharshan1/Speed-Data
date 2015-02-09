package com.example.speeddata;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomGrid extends BaseAdapter{

	private Context mContext;
	  private final int[] Imageid;
	  private final String[] web;
	  private int[] opflags;
	public CustomGrid(Context c, String[] web, int[] imageId,int[] opflags) {
		// TODO Auto-generated constructor stub
		mContext = c;
	     this.Imageid = imageId;
	     this.web = web;
	     this.opflags = opflags;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return web.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View grid;
		LayoutInflater inflater = (LayoutInflater) mContext
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
        if (convertView == null) {  
        	
        	grid = new View(mContext);
			grid = inflater.inflate(R.layout.grid_single, null);
        	ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
        	imageView.setImageResource(Imageid[position]);
        } else {
        	grid = (View) convertView;
        }
		
        if(opflags[position] == 1){
        	grid.setAlpha(0.25F);
        }
        else if(opflags[position] == 0){
        	grid.setAlpha(1.0F);
        }
		return grid;
	}


}
