package com.edoali.taskmanager.roomDB;

public interface GoalDAO {
    //annotate these  as operations @Insert,@Delete,@Update
    void insertGoal(Goal goal);

    void updateGoal(Goal goal);

    void deleteGoal(Goal goal);
    //we dont pass goal entity as parameter when deleting all
    //instead we will use query
    //@Query("DELETE FROM goa_table"
    void deleteAllGoals();

    //use liveData  list here to get all goals

    // LiveData<List<Goal>> getAllGoals();

}
