package com.example.aniketkotlin

import android.content.Context
import android.view.View
import android.widget.FrameLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class ToastManager {
    fun showLongToast(context: Context?, message: String?) {
        if (context != null) Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun showShortToast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

    fun showSomethingWentWrongToast(context: Context) {
        Toast.makeText(
            context,
            context.getString(R.string.something_went_wrong),
            Toast.LENGTH_SHORT
        ).show()
    }

    fun showErrorMessage(
        view: View?,
        mContext: Context?,
        message: String?,
        sideMargin: Int,
        marginBottom: Int
    ) {
        val snackbar = Snackbar.make(view!!, message!!, Snackbar.LENGTH_LONG)
        val snackBarView = snackbar.view
        // Depend upon your parent Layout Use `LayoutParams` of that Layout
        val params = snackBarView.layoutParams as FrameLayout.LayoutParams
        params.setMargins(
            params.leftMargin + sideMargin,
            params.topMargin,
            params.rightMargin + sideMargin,
            params.bottomMargin + marginBottom
        )
        snackBarView.layoutParams = params
        snackBarView.setBackgroundColor(ContextCompat.getColor(mContext!!, R.color.red))
        snackbar.show()
    }

    fun showSuccessMessage(
        view: View?,
        mContext: Context?,
        message: String?,
        sideMargin: Int,
        marginBottom: Int
    ) {
        val snackbar = Snackbar.make(view!!, message!!, Snackbar.LENGTH_LONG)
        val snackBarView = snackbar.view
        // Depend upon your parent Layout Use `LayoutParams` of that Layout
        val params = snackBarView.layoutParams as FrameLayout.LayoutParams
        params.setMargins(
            params.leftMargin + sideMargin,
            params.topMargin,
            params.rightMargin + sideMargin,
            params.bottomMargin + marginBottom
        )
        snackBarView.layoutParams = params
        snackBarView.setBackgroundColor(ContextCompat.getColor(mContext!!, R.color.green))
        snackbar.show()
    }
}