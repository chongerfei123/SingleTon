package st.zlei.com.androidsingleton;

import android.util.Log;

/**
 * Created by zl on 2017/7/19.
 */

public class Singleton_lazyMan {
    private static final String TAG = "TestSingle";

    //私有的构造方法
    private Singleton_lazyMan() {

    }

    private static Singleton_lazyMan singletonLazyMan = null;

    //synchronized保证多线程的同步问题
    public static synchronized Singleton_lazyMan getInstance(){
        if (singletonLazyMan == null){
            singletonLazyMan = new Singleton_lazyMan();
        }
        return singletonLazyMan;
    }

    public void work(){
        Log.d(TAG, "onClick: "+"我是基本的懒汉模式里面的work");
    }
}
