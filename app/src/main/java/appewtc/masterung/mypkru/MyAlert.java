package appewtc.masterung.mypkru;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.provider.ContactsContract;

/**
 * Created by BIW on 5/25/2017 AD.
 */

public class MyAlert {

    //Explicit
    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }

    public void  myDialog(String strTitle, String strMessage) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.mipmap.ic_name);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

}  //Main Class
