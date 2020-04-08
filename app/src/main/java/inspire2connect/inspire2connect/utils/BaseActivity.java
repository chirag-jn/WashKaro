package inspire2connect.inspire2connect.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

@SuppressWarnings("SpellCheckingInspection")
public class BaseActivity extends AppCompatActivity {

    public static final String englishCode = "en";
    public static final String hindiCode = "hi";

    public static DatabaseReference usersDB = FirebaseDatabase.getInstance().getReference("users");

    public static final void Logv(String TAG, String message) {
        Log.v(TAG, message);
    }

    public static final void Loge(String TAG, String message) {
        Log.e(TAG, message);
    }

    public static final void Logd(String TAG, String message) {
        Log.d(TAG, message);
    }

    public static void changeLang(Activity mActivity, String code) {
        LocaleHelper.setLocale(mActivity, code);
        mActivity.recreate();
    }

}
