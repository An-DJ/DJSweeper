package me.andj.djsweeper.database.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import me.andj.djsweeper.database.bean.Recode;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RECODE".
*/
public class RecodeDao extends AbstractDao<Recode, Long> {

    public static final String TABLENAME = "RECODE";

    /**
     * Properties of entity Recode.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Year = new Property(1, int.class, "year", false, "YEAR");
        public final static Property Month = new Property(2, int.class, "month", false, "MONTH");
        public final static Property Day = new Property(3, int.class, "day", false, "DAY");
        public final static Property Column = new Property(4, int.class, "column", false, "COLUMN");
        public final static Property Row = new Property(5, int.class, "row", false, "ROW");
        public final static Property Mines = new Property(6, int.class, "mines", false, "MINES");
        public final static Property Second = new Property(7, int.class, "second", false, "SECOND");
        public final static Property Result = new Property(8, boolean.class, "result", false, "RESULT");
    }


    public RecodeDao(DaoConfig config) {
        super(config);
    }
    
    public RecodeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RECODE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"YEAR\" INTEGER NOT NULL ," + // 1: year
                "\"MONTH\" INTEGER NOT NULL ," + // 2: month
                "\"DAY\" INTEGER NOT NULL ," + // 3: day
                "\"COLUMN\" INTEGER NOT NULL ," + // 4: column
                "\"ROW\" INTEGER NOT NULL ," + // 5: row
                "\"MINES\" INTEGER NOT NULL ," + // 6: mines
                "\"SECOND\" INTEGER NOT NULL ," + // 7: second
                "\"RESULT\" INTEGER NOT NULL );"); // 8: result
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RECODE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Recode entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getYear());
        stmt.bindLong(3, entity.getMonth());
        stmt.bindLong(4, entity.getDay());
        stmt.bindLong(5, entity.getColumn());
        stmt.bindLong(6, entity.getRow());
        stmt.bindLong(7, entity.getMines());
        stmt.bindLong(8, entity.getSecond());
        stmt.bindLong(9, entity.getResult() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Recode entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getYear());
        stmt.bindLong(3, entity.getMonth());
        stmt.bindLong(4, entity.getDay());
        stmt.bindLong(5, entity.getColumn());
        stmt.bindLong(6, entity.getRow());
        stmt.bindLong(7, entity.getMines());
        stmt.bindLong(8, entity.getSecond());
        stmt.bindLong(9, entity.getResult() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Recode readEntity(Cursor cursor, int offset) {
        Recode entity = new Recode( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // year
            cursor.getInt(offset + 2), // month
            cursor.getInt(offset + 3), // day
            cursor.getInt(offset + 4), // column
            cursor.getInt(offset + 5), // row
            cursor.getInt(offset + 6), // mines
            cursor.getInt(offset + 7), // second
            cursor.getShort(offset + 8) != 0 // result
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Recode entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setYear(cursor.getInt(offset + 1));
        entity.setMonth(cursor.getInt(offset + 2));
        entity.setDay(cursor.getInt(offset + 3));
        entity.setColumn(cursor.getInt(offset + 4));
        entity.setRow(cursor.getInt(offset + 5));
        entity.setMines(cursor.getInt(offset + 6));
        entity.setSecond(cursor.getInt(offset + 7));
        entity.setResult(cursor.getShort(offset + 8) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Recode entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Recode entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Recode entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
