package com.jraska.dialog;

import android.app.Dialog;
import android.support.v4.app.FragmentActivity;

import java.io.Serializable;

public interface ActivityDialogMethod<A extends FragmentActivity>
    extends Serializable {
  Dialog onCreateDialog(A activity);
}
