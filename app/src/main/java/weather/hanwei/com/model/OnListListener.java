package weather.hanwei.com.model;

import weather.hanwei.com.bean.ListTest;

/**
 * Created by Administrator on 2017/3/20.
 */
public interface OnListListener {

    void listSuccess(ListTest listTest);

    void listFailed(String s);
}
