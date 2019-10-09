package com.tony.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class CrimeLab {
    private ArrayList<Crime> mCrimes;

    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    //populates with some test data
    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mCrimes = new ArrayList<Crime>();
        for (int i = 0; i < 100; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }
    //private constructer prevents more than one instance
    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());

        }
        return sCrimeLab;
    }
    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }
    //gets a list of crimes
    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getID().equals(id))
                return c;
        }
        return null;
    }
}
