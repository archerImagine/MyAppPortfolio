package app.com.example.android.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ArrayAdapter<String> mProjectAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create the project list to be added to listview.
        String[] data = {
                "SPOTIFY STEAMER",
                "SCORES APP",
                "LIBRARY APP",
                "BUILD IT BIGGER",
                "XYZ READER",
                "CAPSTONE: MY OWN APP"
        };
        List<String> projectList = new ArrayList<>(Arrays.asList(data));

        mProjectAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item_project,
                        R.id.list_item_project_button,
                        projectList
                );
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        View header = inflater.inflate(R.layout.header,container,false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_project);
        listView.addHeaderView(header);
        listView.setAdapter(mProjectAdapter);
        return rootView;
    }
}
