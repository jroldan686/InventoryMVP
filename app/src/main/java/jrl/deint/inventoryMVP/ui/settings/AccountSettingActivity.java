package jrl.deint.inventoryMVP.ui.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import jrl.deint.inventoryMVP.R;

public class AccountSettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.account_settings);
    }
}
