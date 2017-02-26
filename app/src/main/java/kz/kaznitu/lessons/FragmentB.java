package kz.kaznitu.lessons;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment{
    private TextView textView ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false) ;
        textView = (TextView)view.findViewById(R.id.textViewOnFragmentB) ;
        return view ;
    }

    public void changeData(int index){
        Resources resources = getResources() ;
        String [] descriptions = resources.getStringArray(R.array.descriptions) ;
        textView.setText(descriptions[index]);
    }
}
