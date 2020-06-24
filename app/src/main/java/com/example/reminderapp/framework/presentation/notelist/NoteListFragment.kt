package com.example.reminderapp.framework.presentation.notelist

import android.os.Bundle
import android.view.View
import com.example.reminderapp.R
import com.example.reminderapp.framework.presentation.common.BaseNoteFragment

const val NOTE_LIST_STATE_BUNDLE_KEY =
    "com.example.reminderapp.framework.presentation.notelist.state"

class NoteListFragment : BaseNoteFragment(R.layout.fragment_note_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun inject() {
        TODO("prepare dagger")
    }

}
