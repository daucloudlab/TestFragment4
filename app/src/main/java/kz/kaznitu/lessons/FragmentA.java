package kz.kaznitu.lessons;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{
    private ListView listView ;
    private Communicator communicator ;

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false) ;
        listView = (ListView)view.findViewById(R.id.listView) ;
        listView.setOnItemClickListener(this);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.chapters, android.R.layout.simple_list_item_1) ;
        listView.setAdapter(adapter);
        return view ;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);
    }

    public interface Communicator{
        public void respond(int i) ;
    }
}
