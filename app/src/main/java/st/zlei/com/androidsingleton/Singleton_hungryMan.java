package st.zlei.com.androidsingleton;

import android.util.Log;

/**
 * Created by zl on 2017/7/19.
 */

public class Singleton_hungryMan {
    private static final String TAG = "TestSingle";
    private static Singleton_hungryMan singletonHungryMan = new Singleton_hungryMan();

    //构造方法为private，其他地方就无法new本类的对象
    private Singleton_hungryMan() {

    }
    //static以便类名.方法名调用
    public static Singleton_hungryMan getInstance(){
        return singletonHungryMan;
    }
    public void work(){
        Log.d(TAG, "onClick: "+"我是饿汉模式里面的work方法");
    }
}
