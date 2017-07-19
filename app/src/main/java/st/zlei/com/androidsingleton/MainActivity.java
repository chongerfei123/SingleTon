package st.zlei.com.androidsingleton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TestSingle";
    private Button hungry_button;
    private Button lazy_button;
    private Button DCL_button;
    private Button InnerClass_button;
    private Button map_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hungry_button = (Button) findViewById(R.id.hungry_button);
        lazy_button = (Button) findViewById(R.id.lazy_button);
        DCL_button = (Button) findViewById(R.id.DCL_button);
        InnerClass_button = (Button) findViewById(R.id.InnerClass_button);
        map_button = (Button) findViewById(R.id.map_button);

        //1.test饿汉模式
        hungry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //实例1：
                Singleton_hungryMan singletonHungryMan1 = Singleton_hungryMan.getInstance();
                Log.d(TAG, "onClick: "+singletonHungryMan1.hashCode());
                singletonHungryMan1.work();

                //实例2：
                Singleton_hungryMan singletonHungryMan2 = Singleton_hungryMan.getInstance();
                Log.d(TAG, "onClick: "+singletonHungryMan2.hashCode());
                singletonHungryMan2.work();
            }
        });

        //2.test基本的懒汉模式
        lazy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //实例1：
                Singleton_lazyMan singletonLazyMan1 = Singleton_lazyMan.getInstance();
                singletonLazyMan1.work();
                Log.d(TAG, "onClick: "+singletonLazyMan1.hashCode());

                //实例2：
                Singleton_lazyMan singletonLazyMan2 = Singleton_lazyMan.getInstance();
                singletonLazyMan2.work();
                Log.d(TAG, "onClick: "+singletonLazyMan2.hashCode());
            }
        });

        //3.test DCL单例模式
        DCL_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //实例1：
                Sington_DCL singtonDcl1 = Sington_DCL.getInstance();
                singtonDcl1.work();
                Log.d(TAG, "onClick: "+singtonDcl1.hashCode());

                //实例2：
                Sington_DCL singtonDcl2 = Sington_DCL.getInstance();
                singtonDcl2.work();
                Log.d(TAG, "onClick: "+singtonDcl2.hashCode());
            }
        });

        //4.test 静态内部类单例模式
        InnerClass_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //实例1：
                Singleton_InnerClass singletonInnerClass1 = Singleton_InnerClass.getInstance();
                singletonInnerClass1.work();
                Log.d(TAG, "onClick: "+singletonInnerClass1.hashCode());

                //实例2：
                Singleton_InnerClass singletonInnerClass2 = Singleton_InnerClass.getInstance();
                singletonInnerClass2.work();
                Log.d(TAG, "onClick: "+singletonInnerClass2.hashCode());
            }
        });

        //5.test map容器单例模式
        map_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SIngleton_MapManager.registService("a","A");
                SIngleton_MapManager.registService("b","B");
                //实例1：
                Object service1 = SIngleton_MapManager.getService("a");
                Log.d(TAG, "onClick: "+service1+"-----"+service1.hashCode());

                //实例2：
                Object service2 = SIngleton_MapManager.getService("a");
                Log.d(TAG, "onClick: "+service2+"-----"+service2.hashCode());
            }
        });
    }
}
