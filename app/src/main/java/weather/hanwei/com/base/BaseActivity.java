package weather.hanwei.com.base;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.widget.Toast;

import butterknife.ButterKnife;

/**
 *
 网络环境监控
 统一的数据接口
 生命周期不同方法应该做的事情

 * Created by cmh on 2017/3/20.
 */
public abstract class BaseActivity extends AppCompatActivity{

    protected int mScreenWidth;
    protected int mScreenHeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 公共属性
        DisplayMetrics metric = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metric);
        mScreenWidth = metric.widthPixels;
        mScreenHeight = metric.heightPixels;

        // 定制流程
        setContentView();
        ButterKnife.inject(this);
        initViews();
//        initListeners();
//        initData();
    }

    Toast mToast;

    public abstract void setContentView();

    public abstract void initViews();

//    public abstract void initListeners();
//
//    public abstract void initData();

    // 常用方法
    public void ShowToast(String text) {
        if (!TextUtils.isEmpty(text)) {
            if (mToast == null) {
                mToast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
            } else {
                mToast.setText(text);
            }
            mToast.show();
        }
    }

    // 常用方法
    public int getStateBar() {
        Rect frame = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight = frame.top;
        return statusBarHeight;
    }

    // 常用方法
    public static int dip2px(Context context, float dipValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (scale * dipValue + 0.5f);
    }

}
