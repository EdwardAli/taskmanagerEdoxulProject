package com.edoali.taskmanager.roomDB;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Goal.class},version = 1,exportSchema = false)
public abstract class GoalRoomDB extends RoomDatabase {
    private static GoalRoomDB goalRoomDB;

    public abstract GoalDAO goalDAO();

    public static synchronized GoalRoomDB getInstance(Context context) {
        if (goalRoomDB == null) {
            goalRoomDB = Room.databaseBuilder(context.getApplicationContext(),
                    GoalRoomDB.class, "goals_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(goalRoomDBCallback)
                    .build();
        }
        return goalRoomDB;
    }

    private static RoomDatabase.Callback goalRoomDBCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDatabaseAsyncTask(goalRoomDB).execute();
        }
    };

    public static class PopulateDatabaseAsyncTask extends AsyncTask<Void,Void,Void>{
        private GoalDAO goalDAO;
        private PopulateDatabaseAsyncTask(GoalRoomDB goalRoomDB){
            goalDAO=goalRoomDB.goalDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

}

