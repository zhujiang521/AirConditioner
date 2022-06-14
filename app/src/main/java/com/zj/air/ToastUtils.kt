package com.zj.air

import android.content.Context
import android.widget.Toast

private var toast: Toast? = null

fun showToast(
    context: Context?,
    content: String?
) {
    if (toast == null) {
        toast = Toast.makeText(
            context,
            content,
            Toast.LENGTH_SHORT
        )
    } else {
        toast?.setText(content)
    }
    toast?.show()
}

fun showToast(context: Context?, resId: Int) {
    if (toast == null) {
        toast = Toast.makeText(
            context,
            resId,
            Toast.LENGTH_SHORT
        )
    } else {
        toast?.setText(resId)
    }
    toast?.show()
}

fun cancelToast() {
    toast?.cancel()
}