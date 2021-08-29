package com.edoali.taskmanager.roomDB;


//@Entity(name={"goal_table"}
public class Goal {
    //this is the entity
    //it will present one goal
    //if these are not only fields they have to be added
    //@Primary_key(Auto)
    public int id;
    //@columininfo
    public String goalDescription;

    public String title;

    public String endDate;

    public  String startDate;

    public Goal(int id, String goalDescription, String title, String endDate, String startDate) {
        this.id = id;
        this.goalDescription = goalDescription;
        this.title = title;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoalDescription() {
        return goalDescription;
    }

    public void setGoalDescription(String goalDescription) {
        this.goalDescription = goalDescription;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
