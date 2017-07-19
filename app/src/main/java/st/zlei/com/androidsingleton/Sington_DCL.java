package st.zlei.com.androidsingleton;

import android.util.Log;

/**
 * Created by zl on 2017/7/19.
 */

public class Sington_DCL {
    private static final String TAG = "TestSingle";
    private Sington_DCL() {
    }

    private static Sington_DCL singtonDcl = null;

    public static Sington_DCL getInstance(){
        if (singtonDcl == null){
            synchronized (Sington_DCL.class){
                if (singtonDcl == null){
                    singtonDcl = new Sington_DCL();
                }
            }
        }
        return singtonDcl;
    }

    public void work(){
        Log.d(TAG, "onClick: "+"我是DCL模式里面的work");
    }
}
