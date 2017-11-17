package jrl.deint.inventoryMVP.ui.settings;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import jrl.deint.inventoryMVP.R;

public class GeneralSettingActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.generic_settings);
    }
}
