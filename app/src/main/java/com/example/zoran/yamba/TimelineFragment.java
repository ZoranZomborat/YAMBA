package com.example.zoran.yamba;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

/**
 * Created by Zoran on 10.12.2017.
 */

public class TimelineFragment extends ListFragment {

    private static final String TAG = TimelineFragment.class.getSimpleName();
    private static final String[] FROM = { StatusContract.Column.USER,
            StatusContract.Column.MESSAGE, StatusContract.Column.CREATED_AT };
    private static final int[] TO = { R.id.list_item_text_user,
            R.id.list_item_text_message, R.id.list_item_text_created_at};
    private SimpleCursorAdapter mAdapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAdapter = new SimpleCursorAdapter(getActivity(), R.layout.list_item,
                null, FROM, TO, 0);
        setListAdapter(mAdapter);
    }

}
