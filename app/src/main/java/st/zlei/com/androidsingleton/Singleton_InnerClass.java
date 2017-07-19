package st.zlei.com.androidsingleton;

import android.util.Log;

/**
 * Created by zl on 2017/7/19.
 */

public class Singleton_InnerClass {
    private static final String TAG = "TestSingle";

    private Singleton_InnerClass() {
    }

    public static Singleton_InnerClass getInstance(){
        return SingletonHolder.mInstance;
    }

    private static class SingletonHolder {
        //第一次调用mInstance会初始化
        private static final Singleton_InnerClass mInstance = new Singleton_InnerClass();
    }

    public void work(){
        Log.d(TAG, "onClick: "+"我是静态内部类单例模式里面的work");
    }
}
