package poojab26.nolibrary_page_indicators;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pblead26 on 17-May-16.
 */
public class FragmentMain extends android.support.v4.app.Fragment {
    public static final String IMAGE = "IMAGE";
    public static final String MESSAGE = "MESSAGE";

    int[] myImageList = new int[]{R.drawable.sample1, R.drawable.sample2, R.drawable.sample3};

    public static final FragmentMain addElements(String message, int position)
    {
        FragmentMain f = new FragmentMain();
        Bundle bdl = new Bundle(1);
        bdl.putString(MESSAGE, message);
        bdl.putInt(IMAGE, position);
        f.setArguments(bdl);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String message = getArguments().getString(MESSAGE);

        int position = getArguments().getInt(IMAGE);

        View v = inflater.inflate(R.layout.fragment_main, container, false);
        TextView messageTextView = (TextView)v.findViewById(R.id.text);

        ImageView tutorialImage = (ImageView)v.findViewById(R.id.image);

        messageTextView.setText(message);

        tutorialImage.setBackgroundResource(myImageList[position]);



        return v;
    }

}
