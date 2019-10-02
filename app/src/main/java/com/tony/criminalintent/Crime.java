package com.tony.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime extends Object {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        //generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public UUID getID(){
        return mId;
    }
    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
