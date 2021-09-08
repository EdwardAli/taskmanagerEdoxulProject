package com.edoali.taskmanager.roomDB;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class MainRepository {
    private GoalDAO goalDAO;
    private LiveData<List<Goal>> allGoals;

    public MainRepository(Application application){
        GoalRoomDB goalRoomDB=GoalRoomDB.getInstance(application);
        goalDAO=goalRoomDB.goalDAO();
        allGoals=goalDAO.getAllGoals();
    }
    public void insert(Goal goal){new InsertGoalAsyncTask(goalDAO).execute(goal);}
    public void update(Goal goal){new UpdateGoalAsyncTask(goalDAO).execute(goal);}
    public void delete (Goal goal){new DeleteGoalAsyncTask(goalDAO).execute(goal);}
    public void deleteAllGoals(){
        new DeleteAllGoalsAsyncTask(goalDAO).execute();
    }
    public LiveData<List<Goal>> getAllGoals() {
        return allGoals;
    }

    private static class InsertGoalAsyncTask extends AsyncTask<Goal,Void,Void>{
        private GoalDAO goalDAO;
        private InsertGoalAsyncTask(GoalDAO goalDAO){
            this.goalDAO=goalDAO;
        }

        @Override
        protected Void doInBackground(Goal... goals) {
            goalDAO.insertGoal(goals[0]);
            return null;
        }
    }
    private static class UpdateGoalAsyncTask extends AsyncTask<Goal,Void,Void>{
        private GoalDAO goalDAO;
        private UpdateGoalAsyncTask(GoalDAO goalDAO){
            this.goalDAO=goalDAO;
        }

        @Override
        protected Void doInBackground(Goal... goals) {
            goalDAO.updateGoal(goals[0]);
            return null;
        }
    }
    public  static class DeleteGoalAsyncTask extends AsyncTask<Goal,Void,Void>{
        private GoalDAO goalDAO;
        private DeleteGoalAsyncTask(GoalDAO goalDAO){
            this.goalDAO=goalDAO;
        }

        @Override
        protected Void doInBackground(Goal... goals) {
            goalDAO.deleteGoal(goals[0]);
            return null;
        }
    }
    public static class DeleteAllGoalsAsyncTask extends AsyncTask<Void,Void,Void>{
        private GoalDAO goalDAO;
        DeleteAllGoalsAsyncTask(GoalDAO goalDAO){
            this.goalDAO=goalDAO;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            goalDAO.deleteAllGoals();
            return null;
        }
    }

}
