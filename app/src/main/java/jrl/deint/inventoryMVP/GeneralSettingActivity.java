package jrl.deint.inventoryMVP;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class GeneralSettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.generic_settings);
    }
}
