package weather.hanwei.com.presenter;

import weather.hanwei.com.bean.ListTest;
import weather.hanwei.com.model.ListImp;
import weather.hanwei.com.model.OnListListener;
import weather.hanwei.com.view.listView;

/**
 * Created by cmh on 2017/3/20.
 */
public class listPresener {

    private listView listView;
    private ListImp listImp;

    public listPresener(listView listView){
        this.listView = listView;
        listImp = new ListImp();
    }

    public void loadList(){
        listImp.loadList(new OnListListener() {
            @Override
            public void listSuccess(ListTest listTest) {
                //添加数据到listactivity
                listView.toListActivity(listTest);
            }

            @Override
            public void listFailed(String s) {
                listView.showFailedError();
            }
        });
    }
}
