package jp.u1aryz.products.customview;

import jp.u1aryz.products.customview.PopupMenu.OnItemSelectedListener;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewPopupMenuActivity extends ListActivity implements OnItemSelectedListener {

    private final static int PLAY_SELECTION = 0;
    private final static int ADD_TO_PLAYLIST = 1;
    private final static int SEARCH = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] strs = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strs);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        PopupMenu menu = new PopupMenu(this);
        menu.setHeaderTitle("TitleTitleTitleTitleTitle");
        menu.setOnItemSelectedListener(this);
        menu.add(PLAY_SELECTION, R.string.play).setIcon(getResources().getDrawable(R.drawable.ic_context_menu_play_normal));
        menu.add(ADD_TO_PLAYLIST, R.string.add_to_playlist).setIcon(getResources().getDrawable(R.drawable.ic_context_menu_add_to_playlist_normal));
        menu.add(SEARCH, R.string.search).setIcon(getResources().getDrawable(R.drawable.ic_context_menu_search_normal));
        menu.show(v);
    }

    @Override
    public void onItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case PLAY_SELECTION:
            break;

        case ADD_TO_PLAYLIST:
            break;

        case SEARCH:
            break;
        }
    }
}