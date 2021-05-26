package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
                Affirmation(R.string.affirmation1,R.drawable.ft),
                Affirmation(R.string.affirmation2, R.drawable.ozil),
                Affirmation(R.string.affirmation3, R.drawable.messi),
                Affirmation(R.string.affirmation4, R.drawable.neymar),
                Affirmation(R.string.affirmation5, R.drawable.pogba),
                Affirmation(R.string.affirmation6, R.drawable.adm)
        )
    }
}