package weather.hanwei.com.bean;

/**
 * 天气bean
 * Created by cmh on 2017/3/20.
 */
public class Weather {


    /**
     * error_code : 0
     * reason : successed!
     * result : {"future":{"day_20170320":{"date":"20170320","temperature":"4℃~13℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"week":"星期一","wind":"东北风微风"},"day_20170321":{"date":"20170321","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期二","wind":"东北风微风"},"day_20170322":{"date":"20170322","temperature":"6℃~10℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"week":"星期三","wind":"东风微风"},"day_20170323":{"date":"20170323","temperature":"7℃~10℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"week":"星期四","wind":"东南风微风"},"day_20170324":{"date":"20170324","temperature":"6℃~17℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"week":"星期五","wind":"西风微风"},"day_20170325":{"date":"20170325","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期六","wind":"东北风微风"},"day_20170326":{"date":"20170326","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期日","wind":"东北风微风"}},"sk":{"humidity":"61%","temp":"11","time":"13:03","wind_direction":"北风","wind_strength":"2级"},"today":{"city":"郑州","comfort_index":"","date_y":"2017年03月20日","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","dressing_index":"较冷","drying_index":"","exercise_index":"较不宜","temperature":"4℃~13℃","travel_index":"较不宜","uv_index":"最弱","wash_index":"较适宜","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"week":"星期一","wind":"东北风微风"}}
     * resultcode : 200
     */

    private int error_code;
    private String reason;
    /**
     * future : {"day_20170320":{"date":"20170320","temperature":"4℃~13℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"week":"星期一","wind":"东北风微风"},"day_20170321":{"date":"20170321","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期二","wind":"东北风微风"},"day_20170322":{"date":"20170322","temperature":"6℃~10℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"week":"星期三","wind":"东风微风"},"day_20170323":{"date":"20170323","temperature":"7℃~10℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"week":"星期四","wind":"东南风微风"},"day_20170324":{"date":"20170324","temperature":"6℃~17℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"week":"星期五","wind":"西风微风"},"day_20170325":{"date":"20170325","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期六","wind":"东北风微风"},"day_20170326":{"date":"20170326","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期日","wind":"东北风微风"}}
     * sk : {"humidity":"61%","temp":"11","time":"13:03","wind_direction":"北风","wind_strength":"2级"}
     * today : {"city":"郑州","comfort_index":"","date_y":"2017年03月20日","dressing_advice":"建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。","dressing_index":"较冷","drying_index":"","exercise_index":"较不宜","temperature":"4℃~13℃","travel_index":"较不宜","uv_index":"最弱","wash_index":"较适宜","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"week":"星期一","wind":"东北风微风"}
     */

    private ResultBean result;
    private String resultcode;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public static class ResultBean {
        /**
         * day_20170320 : {"date":"20170320","temperature":"4℃~13℃","weather":"阴转多云","weather_id":{"fa":"02","fb":"01"},"week":"星期一","wind":"东北风微风"}
         * day_20170321 : {"date":"20170321","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期二","wind":"东北风微风"}
         * day_20170322 : {"date":"20170322","temperature":"6℃~10℃","weather":"小雨转多云","weather_id":{"fa":"07","fb":"01"},"week":"星期三","wind":"东风微风"}
         * day_20170323 : {"date":"20170323","temperature":"7℃~10℃","weather":"小雨","weather_id":{"fa":"07","fb":"07"},"week":"星期四","wind":"东南风微风"}
         * day_20170324 : {"date":"20170324","temperature":"6℃~17℃","weather":"多云转晴","weather_id":{"fa":"01","fb":"00"},"week":"星期五","wind":"西风微风"}
         * day_20170325 : {"date":"20170325","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期六","wind":"东北风微风"}
         * day_20170326 : {"date":"20170326","temperature":"8℃~15℃","weather":"多云转阴","weather_id":{"fa":"01","fb":"02"},"week":"星期日","wind":"东北风微风"}
         */

        private FutureBean future;
        /**
         * humidity : 61%
         * temp : 11
         * time : 13:03
         * wind_direction : 北风
         * wind_strength : 2级
         */

        private SkBean sk;
        /**
         * city : 郑州
         * comfort_index :
         * date_y : 2017年03月20日
         * dressing_advice : 建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。
         * dressing_index : 较冷
         * drying_index :
         * exercise_index : 较不宜
         * temperature : 4℃~13℃
         * travel_index : 较不宜
         * uv_index : 最弱
         * wash_index : 较适宜
         * weather : 阴转多云
         * weather_id : {"fa":"02","fb":"01"}
         * week : 星期一
         * wind : 东北风微风
         */

        private TodayBean today;

        public FutureBean getFuture() {
            return future;
        }

        public void setFuture(FutureBean future) {
            this.future = future;
        }

        public SkBean getSk() {
            return sk;
        }

        public void setSk(SkBean sk) {
            this.sk = sk;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public static class FutureBean {
            /**
             * date : 20170320
             * temperature : 4℃~13℃
             * weather : 阴转多云
             * weather_id : {"fa":"02","fb":"01"}
             * week : 星期一
             * wind : 东北风微风
             */

            private Day20170320Bean day_20170320;
            /**
             * date : 20170321
             * temperature : 8℃~15℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * week : 星期二
             * wind : 东北风微风
             */

            private Day20170321Bean day_20170321;
            /**
             * date : 20170322
             * temperature : 6℃~10℃
             * weather : 小雨转多云
             * weather_id : {"fa":"07","fb":"01"}
             * week : 星期三
             * wind : 东风微风
             */

            private Day20170322Bean day_20170322;
            /**
             * date : 20170323
             * temperature : 7℃~10℃
             * weather : 小雨
             * weather_id : {"fa":"07","fb":"07"}
             * week : 星期四
             * wind : 东南风微风
             */

            private Day20170323Bean day_20170323;
            /**
             * date : 20170324
             * temperature : 6℃~17℃
             * weather : 多云转晴
             * weather_id : {"fa":"01","fb":"00"}
             * week : 星期五
             * wind : 西风微风
             */

            private Day20170324Bean day_20170324;
            /**
             * date : 20170325
             * temperature : 8℃~15℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * week : 星期六
             * wind : 东北风微风
             */

            private Day20170325Bean day_20170325;
            /**
             * date : 20170326
             * temperature : 8℃~15℃
             * weather : 多云转阴
             * weather_id : {"fa":"01","fb":"02"}
             * week : 星期日
             * wind : 东北风微风
             */

            private Day20170326Bean day_20170326;

            public Day20170320Bean getDay_20170320() {
                return day_20170320;
            }

            public void setDay_20170320(Day20170320Bean day_20170320) {
                this.day_20170320 = day_20170320;
            }

            public Day20170321Bean getDay_20170321() {
                return day_20170321;
            }

            public void setDay_20170321(Day20170321Bean day_20170321) {
                this.day_20170321 = day_20170321;
            }

            public Day20170322Bean getDay_20170322() {
                return day_20170322;
            }

            public void setDay_20170322(Day20170322Bean day_20170322) {
                this.day_20170322 = day_20170322;
            }

            public Day20170323Bean getDay_20170323() {
                return day_20170323;
            }

            public void setDay_20170323(Day20170323Bean day_20170323) {
                this.day_20170323 = day_20170323;
            }

            public Day20170324Bean getDay_20170324() {
                return day_20170324;
            }

            public void setDay_20170324(Day20170324Bean day_20170324) {
                this.day_20170324 = day_20170324;
            }

            public Day20170325Bean getDay_20170325() {
                return day_20170325;
            }

            public void setDay_20170325(Day20170325Bean day_20170325) {
                this.day_20170325 = day_20170325;
            }

            public Day20170326Bean getDay_20170326() {
                return day_20170326;
            }

            public void setDay_20170326(Day20170326Bean day_20170326) {
                this.day_20170326 = day_20170326;
            }

            public static class Day20170320Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 02
                 * fb : 01
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170321Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170322Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 01
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170323Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 07
                 * fb : 07
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170324Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 00
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170325Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }

            public static class Day20170326Bean {
                private String date;
                private String temperature;
                private String weather;
                /**
                 * fa : 01
                 * fb : 02
                 */

                private WeatherIdBean weather_id;
                private String week;
                private String wind;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getTemperature() {
                    return temperature;
                }

                public void setTemperature(String temperature) {
                    this.temperature = temperature;
                }

                public String getWeather() {
                    return weather;
                }

                public void setWeather(String weather) {
                    this.weather = weather;
                }

                public WeatherIdBean getWeather_id() {
                    return weather_id;
                }

                public void setWeather_id(WeatherIdBean weather_id) {
                    this.weather_id = weather_id;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public String getWind() {
                    return wind;
                }

                public void setWind(String wind) {
                    this.wind = wind;
                }

                public static class WeatherIdBean {
                    private String fa;
                    private String fb;

                    public String getFa() {
                        return fa;
                    }

                    public void setFa(String fa) {
                        this.fa = fa;
                    }

                    public String getFb() {
                        return fb;
                    }

                    public void setFb(String fb) {
                        this.fb = fb;
                    }
                }
            }
        }

        public static class SkBean {
            private String humidity;
            private String temp;
            private String time;
            private String wind_direction;
            private String wind_strength;

            public String getHumidity() {
                return humidity;
            }

            public void setHumidity(String humidity) {
                this.humidity = humidity;
            }

            public String getTemp() {
                return temp;
            }

            public void setTemp(String temp) {
                this.temp = temp;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getWind_direction() {
                return wind_direction;
            }

            public void setWind_direction(String wind_direction) {
                this.wind_direction = wind_direction;
            }

            public String getWind_strength() {
                return wind_strength;
            }

            public void setWind_strength(String wind_strength) {
                this.wind_strength = wind_strength;
            }
        }

        public static class TodayBean {
            private String city;
            private String comfort_index;
            private String date_y;
            private String dressing_advice;
            private String dressing_index;
            private String drying_index;
            private String exercise_index;
            private String temperature;
            private String travel_index;
            private String uv_index;
            private String wash_index;
            private String weather;
            /**
             * fa : 02
             * fb : 01
             */

            private WeatherIdBean weather_id;
            private String week;
            private String wind;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getComfort_index() {
                return comfort_index;
            }

            public void setComfort_index(String comfort_index) {
                this.comfort_index = comfort_index;
            }

            public String getDate_y() {
                return date_y;
            }

            public void setDate_y(String date_y) {
                this.date_y = date_y;
            }

            public String getDressing_advice() {
                return dressing_advice;
            }

            public void setDressing_advice(String dressing_advice) {
                this.dressing_advice = dressing_advice;
            }

            public String getDressing_index() {
                return dressing_index;
            }

            public void setDressing_index(String dressing_index) {
                this.dressing_index = dressing_index;
            }

            public String getDrying_index() {
                return drying_index;
            }

            public void setDrying_index(String drying_index) {
                this.drying_index = drying_index;
            }

            public String getExercise_index() {
                return exercise_index;
            }

            public void setExercise_index(String exercise_index) {
                this.exercise_index = exercise_index;
            }

            public String getTemperature() {
                return temperature;
            }

            public void setTemperature(String temperature) {
                this.temperature = temperature;
            }

            public String getTravel_index() {
                return travel_index;
            }

            public void setTravel_index(String travel_index) {
                this.travel_index = travel_index;
            }

            public String getUv_index() {
                return uv_index;
            }

            public void setUv_index(String uv_index) {
                this.uv_index = uv_index;
            }

            public String getWash_index() {
                return wash_index;
            }

            public void setWash_index(String wash_index) {
                this.wash_index = wash_index;
            }

            public String getWeather() {
                return weather;
            }

            public void setWeather(String weather) {
                this.weather = weather;
            }

            public WeatherIdBean getWeather_id() {
                return weather_id;
            }

            public void setWeather_id(WeatherIdBean weather_id) {
                this.weather_id = weather_id;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getWind() {
                return wind;
            }

            public void setWind(String wind) {
                this.wind = wind;
            }

            public static class WeatherIdBean {
                private String fa;
                private String fb;

                public String getFa() {
                    return fa;
                }

                public void setFa(String fa) {
                    this.fa = fa;
                }

                public String getFb() {
                    return fb;
                }

                public void setFb(String fb) {
                    this.fb = fb;
                }
            }
        }
    }
}
