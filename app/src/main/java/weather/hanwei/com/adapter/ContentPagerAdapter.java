package weather.hanwei.com.adapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

/**
 * Created by cmh on 2017/3/24.
 */
public class ContentPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragment;
    public ContentPagerAdapter(FragmentManager supportFragmentManager, Fragment[] fragments) {
        super(supportFragmentManager);
        this.fragment = fragments;
    }



    @Override
    public int getCount() {
        return fragment.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragment[position];
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
