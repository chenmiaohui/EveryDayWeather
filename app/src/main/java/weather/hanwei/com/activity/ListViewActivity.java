package weather.hanwei.com.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import weather.hanwei.com.R;
import weather.hanwei.com.adapter.MyRankingAdapter;
import weather.hanwei.com.base.BaseActivity;
import weather.hanwei.com.bean.ListTest;
import weather.hanwei.com.presenter.listPresener;
import weather.hanwei.com.view.listView;

/**
 * Created by cmh on 2017/3/20.
 */
public class ListViewActivity extends BaseActivity implements listView {

    private listPresener listPresener = new listPresener(this);
    private RecyclerView recyclerView;
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_list);
        listPresener.loadList();
    }

    @Override
    public void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_horizontal);
    }
    //请求过来的数据
    @Override
    public void toListActivity(ListTest listTest) {
        //提高性能
        recyclerView.setHasFixedSize(true);
        //设置线性布局
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        //设置适配器
        MyRankingAdapter adapter = new MyRankingAdapter(listTest.getData());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showFailedError() {
        ShowToast("list fialed");
    }
}
