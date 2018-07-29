import android.content.Context;
import android.widget.Toast;

public class Message {

    public static void message(Context context,String messgae){

        Toast.makeText(context,messgae,Toast.LENGTH_LONG).show();

    }

}
