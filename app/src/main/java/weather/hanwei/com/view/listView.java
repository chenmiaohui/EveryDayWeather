package weather.hanwei.com.view;

import weather.hanwei.com.bean.ListTest;

/**
 * Created by cmh on 2017/3/20.
 */
public interface listView {

    void toListActivity(ListTest listTest);

    //加载失败
    void showFailedError();
}
