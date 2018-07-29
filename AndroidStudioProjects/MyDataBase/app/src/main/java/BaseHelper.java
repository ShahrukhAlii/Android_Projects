import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;




public class BaseHelper extends SQLiteOpenHelper {
    public BaseHelper(Context context, String DATABASE_NAME, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DataBase_Version);
        this.context=context;
        Message.message(context,"Constructor is created");
    }



    private static final String DATABASE_NAME="MyDataBase";
    private static final String TABLE_NAME="MyTable";
    private static final  String NAME="Name";
    private static final String UID="_id";
    private static final  String CREATE_TABLE="CREATE TABLE   "+TABLE_NAME+"("+UID+" INTGER PRIMARY AUTOINCREAMENT "+NAME+" VARCHAR(225)) ";
    private static final int DataBase_Version=2;
    private Context context;
    private static final String  DROP_TABEL="Drop Tabel if Exist"+TABLE_NAME;


    public BaseHelper(Context context, String DATABASE_NAME, SQLiteDatabase.CursorFactory cursorFactory, int DataBase_Version, DatabaseErrorHandler errorHandler) {
        super(context, DATABASE_NAME, null, DataBase_Version, errorHandler);
        this.context=context;
        Message.message(context,"Constructor is created");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        Message.message(context,"Database is now created");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

       db.execSQL(DROP_TABEL);
       onCreate(db);

    }
}
