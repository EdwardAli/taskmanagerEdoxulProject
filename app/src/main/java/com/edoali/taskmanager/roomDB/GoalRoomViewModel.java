package com.edoali.taskmanager.roomDB;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;
import java.util.Objects;

public class GoalRoomViewModel  extends ViewModel {
    private MainRepository mainRepository;
    private LiveData<List<Goal>> allGoals;

   public GoalRoomViewModel(@NonNull Application application){
       mainRepository=new MainRepository(application);
       allGoals= mainRepository.getAllGoals();
   }

   public void insert(Goal goal){
       mainRepository.insert(goal);
   }
   public void update(Goal goal){
       mainRepository.update(goal);
   }
   public void delete(Goal goal){
       mainRepository.delete(goal);
   }
   public void deleteAll(){
       mainRepository.deleteAllGoals();
   }
   public LiveData<List<Goal>> getAllGoals(){
       return allGoals;
   }
}
