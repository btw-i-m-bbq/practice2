package com.mirea.veremeev.l.m.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

public class MyDialogFragment : DialogFragment(){
    public override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        builder.setTitle("Здравствуй МИРЕА!")
            .setMessage("Успех близок?")
            .setIcon(R.mipmap.ic_launcher_round)
            .setPositiveButton("Иду дальше") {
                dialog, id ->
                (activity as MainActivity).onOkClicked()
                dialog.cancel()
            }
            .setNeutralButton("На паузе"){
                dialog, id ->
                (activity as MainActivity).onNeutralClicked()
                dialog.cancel()
            }
            .setNegativeButton("Нет"){
                dialog, id ->
                (activity as MainActivity).onCancelClicked()
                dialog.cancel()
            }
        return builder.create()
    }
}