package jrl.deint.inventoryMVP;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class AccountSettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.account_settings);
    }
}
