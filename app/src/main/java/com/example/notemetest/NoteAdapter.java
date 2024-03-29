package com.example.notemetest;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NoteAdapter extends ArrayAdapter<Note> {

    public NoteAdapter(Context context, List<Note> notes) {
        super(context, 0, notes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_note, parent, false);
        }

        Note note = getItem(position);

        TextView titleTextView = convertView.findViewById(R.id.titleTextView);
        TextView subtitleTextView = convertView.findViewById(R.id.subtitleTextView);
        TextView descriptionTextView = convertView.findViewById(R.id.descriptionTextView);

        titleTextView.setText(note.getTitle());
        subtitleTextView.setText(note.getSubtitle());
        descriptionTextView.setText(note.getDescription());

        // Set the background color based on the 'color' field
        convertView.setBackgroundColor(note.getColor());

        return convertView;
    }
}
