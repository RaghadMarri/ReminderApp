package com.example.reminderapp.framework.presentation.notedetail

import android.os.Bundle
import android.view.View
import com.example.reminderapp.R
import com.example.reminderapp.framework.presentation.common.BaseNoteFragment

const val NOTE_DETAIL_STATE_BUNDLE_KEY =
    "com.example.reminderapp.framework.presentation.notedetail.state"

class NoteDetailFragment : BaseNoteFragment(R.layout.fragment_note_detail) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun inject() {
        TODO("prepare dagger")
    }


}
