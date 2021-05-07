package com.example.dialoguebox;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialogue extends AppCompatDialogFragment {
    TextView EditUName;
    TextView EditUPWD;
    ExampleDialogueListner listner;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listner=(ExampleDialogueListner)context;
        } catch (Exception e) {
            throw new ClassCastException(context.toString()+"must implement dialogue listner");
        }

    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =getActivity().getLayoutInflater();
        View view=inflater.inflate(R.layout.layout_dialgue,null);
        builder.setView(view)
                .setTitle("Login")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String username=EditUName.getText().toString();
                        String userPassword=EditUPWD.getText().toString();
                        listner.applyTests(username,userPassword);

                    }
                });
        EditUName=view.findViewById(R.id.edit_username);
        EditUPWD=view.findViewById(R.id.edit_password);

        return builder.create();
    }
    public interface  ExampleDialogueListner{
        void applyTests(String uname,String pwd);
    }
}
