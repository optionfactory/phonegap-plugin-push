package com.adobe.phonegap.push;

import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.InstanceIDListenerService;

public class PushInstanceIDListenerService extends InstanceIDListenerService {
    public void onTokenRefresh() {
        // need to re-register
    }
}