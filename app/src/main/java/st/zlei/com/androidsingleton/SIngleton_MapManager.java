package st.zlei.com.androidsingleton;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zl on 2017/7/19.
 */

public class SIngleton_MapManager {

    private static final String TAG = "TestSingle";

    private static Map<String,Object> map = new HashMap<String,Object>();

    private SIngleton_MapManager() {
    }

    public static void registService(String key,Object obj){
        if (!map.containsKey(key)){
            map.put(key,obj);
        }
    }

    public static Object getService(String key){
        if (map.containsKey(key)){
            Object obj = map.get(key);
            return obj;
        }
        else {
            return null;
        }
    }
}
