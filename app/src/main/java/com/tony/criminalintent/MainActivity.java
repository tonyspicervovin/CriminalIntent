package com.tony.criminalintent;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

   @Override
    protected  Fragment createFragment() {
       UUID crimeId = (UUID)getIntent()
               .getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);

       return CrimeFragment.newInstance(crimeId);

   }

}
