package weather.hanwei.com.bean;

import java.util.List;

/**
 * Created by cmh on 2017/3/20.
 */
public class ListTest {


    /**
     * AQI : 92
     * AQILevel : 2
     * pointId : 503907c5-13e0-4793-bbc3-30e6c14fd2da
     * pointName : 岗李对比点
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String AQI;
        private String AQILevel;
        private String pointId;
        private String pointName;

        public String getAQI() {
            return AQI;
        }

        public void setAQI(String AQI) {
            this.AQI = AQI;
        }

        public String getAQILevel() {
            return AQILevel;
        }

        public void setAQILevel(String AQILevel) {
            this.AQILevel = AQILevel;
        }

        public String getPointId() {
            return pointId;
        }

        public void setPointId(String pointId) {
            this.pointId = pointId;
        }

        public String getPointName() {
            return pointName;
        }

        public void setPointName(String pointName) {
            this.pointName = pointName;
        }
    }
}
