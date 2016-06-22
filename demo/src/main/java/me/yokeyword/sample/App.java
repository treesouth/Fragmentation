package me.yokeyword.sample;

import android.app.Application;
import com.socks.library.KLog;

/**
 * Created by zn on 16/6/22.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        KLog.init(true);
    }
}
