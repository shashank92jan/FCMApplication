package projects.infanion.com.fcmapplication.token;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



import projects.infanion.com.fcmapplication.Constants;

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {


    @Override
    public void onTokenRefresh() {
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(Constants.TAG, "Refreshed token: " + refreshedToken);
    }
}
