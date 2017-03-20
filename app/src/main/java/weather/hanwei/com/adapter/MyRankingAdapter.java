package weather.hanwei.com.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import weather.hanwei.com.R;
import weather.hanwei.com.bean.ListTest;

/**
 * Created by cmh on 2017/3/20.
 */
public class MyRankingAdapter extends RecyclerView.Adapter<MyRankingAdapter.ViewHolder>{

    private ArrayList<ListTest.DataBean> list;
    public MyRankingAdapter(List<ListTest.DataBean> data) {
        super();
        this.list= (ArrayList<ListTest.DataBean>) data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.recycler_item, null);
        //创建一个ViewHolder
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //绑定到viewHolder
        holder.rank.setText(""+(position+1));
        holder.name.setText(list.get(position).getPointName());
        holder.all.setText(list.get(position).getAQI());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView rank;
        public TextView all;
        public TextView name;
        public ViewHolder(View v) {
            super(v);
            rank = (TextView) v.findViewById(R.id.textView1);
            all = (TextView) v.findViewById(R.id.textView_all);
            name = (TextView) v.findViewById(R.id.textView);
        }
    }
}
