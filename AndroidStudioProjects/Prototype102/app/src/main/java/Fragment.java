import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mothupii_.prototype102.MainActivity;
import com.example.mothupii_.prototype102.R;

/**
 * Created by Mothupii_ on 2017-08-22.
 */

public class
Fragment extends android.support.v4.app.Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.activity_fragments, container,false);

        TextView txtV = (TextView) v.findViewById(R.id.textView);
        txtV.setText(getArguments().getString("message"));

        return v;
    }

    public static Fragment newInstance(String text)
    {
        Fragment f = new Fragment();
        Bundle b = new Bundle();
        b.putString("message",text);

        f.setArguments(b);

        return f;
    }
}
