package com.majhub.thevibe;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class TabAccessorAdapter extends FragmentPagerAdapter {


    public TabAccessorAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
            ChatFragment chatFragment= new ChatFragment();
            return chatFragment;
            case 1:
                GroupsFragment groupsFragment= new GroupsFragment();
                return groupsFragment;
            case 2:
                ContactsFragment contactsFragment= new ContactsFragment();
                return contactsFragment;
            case 3:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;
            default:
            return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
              return "Chats";
            case 1:
                return "Groups";
            case 2:
                return "Contacts";
            case 3:
                return "Requests";

            default:
                return null;
        }
    }
}
