package com.seeteam.d3ifcool.seeteamku;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pepul on 3/11/2018.
 */

public class ItemPidatoAdapter extends ArrayAdapter<ItemPidato> {
    public ItemPidatoAdapter(Context context, ArrayList<ItemPidato> words){
        super (context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        ItemPidato word = getItem(position);
        TextView txt_pidato = (TextView) listItemView.findViewById(R.id.id_title);
        ImageView img_gambar = (ImageView) listItemView.findViewById(R.id.id_gambar);
        img_gambar.setImageResource(word.getFoto());
        txt_pidato.setText(word.getJudul());

        return listItemView;
    }
}
