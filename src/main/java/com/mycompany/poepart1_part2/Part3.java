/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1_part2;

/**
 *
 * @author RC_Student_lab
 */
public class Part3 {
    public class TaskManager {
public static void main(String[] args) {
    TaskManager tm = new TaskManager();
    tm.addTask("Mike Smith", "Create Login", 1, 5, "To Do");
    tm.addTask("Edward Harrison", "Create Add Features",
}
    String[] developers;
    String[] taskNames;
    int[] taskIDs;
    int[] taskDurations;
    String[] taskStatuses;

    //Constructor to initialize arrays with a default size (adjust as needed)
    public TaskManager(){
        developers = new String[100];
        taskNames = new String[100];
        taskIDs = new int[100];
        taskDurations = new int[100];
        taskStatuses = new String[100];
        
          //Method to add a new task.  Needs error handling for full arrays.
    public void addTask(String developer, String taskName, int taskID, int duration, String status){
        //Find the next available index in the arrays.  This is a simplification.
        int nextIndex = findNextAvailableIndex();
        developers[nextIndex] = developer;
        taskNames[nextIndex] = taskName;
        taskIDs[nextIndex] = taskID;
        taskDurations[nextIndex] = duration;
        taskStatuses[nextIndex] = status;
    }
    
    private int findNextAvailableIndex(){
        for(int i = 0; i < developers.length; i++){
            if(developers[i] == null){
                return i;
            }
        }
        return -1; //Indicates that the arrays are full.  Should throw an exception.
    }

    // ... (other methods will be added in the next steps) ...
}
    
    public void displayDoneTasks() {
        System.out.println("Done Tasks:");
        for (int i = 0; i < taskNames.length; i++) {
            if (taskStatuses[i] != null && taskStatuses[i].equals("Done")) {
                System.out.println("Developer: " + developers[i] +
                        ", Task Name: " + taskNames[i] +
                        ", Duration: " + taskDurations[i]);
            }
        }
    }
public void displayLongestTask() {
        //Find the index of the longest task.  Needs error handling for empty arrays.
        int longestTaskIndex = findLongestTaskIndex();
        System.out.println("Longest Task:");
        System.out.println("Developer: " + developers[longestTaskIndex] +
                ", Duration: " + taskDurations[longestTaskIndex]);
    }
private int findLongestTaskIndex(){
        int maxDuration = -1;
        int maxIndex = -1;
        for(int i = 0; i < taskDurations.length; i++){
            if(taskDurations[i] > maxDuration){
                maxDuration = taskDurations[i];
                maxIndex = i;
            }
        }
         return maxIndex;
    }

    // ... (Implement other display and search methods similarly) ...

public void searchTaskByName(String taskName) {
        //Implement search by task name.
    }

    public void searchTasksByDeveloper(String developer) {
        //Implement search by developer.
    }

    public void deleteTask(String taskName) {
        //Implement task deletion.  This is complex and requires shifting array elements.
    }
    
     public void displayFullReport(){
        //Implement a method to display a full report of all tasks.
    }
     
     public static void main(String[] args) {
    TaskManager tm = new TaskManager();
    tm.addTask("Mike Smith", "Create Login", 1, 5, "To Do");
    tm.addTask("Edward Harrison", "Create Add Features",
    }
     }
public static void main(String[] args) {
    TaskManager tm = new TaskManager();
    tm.addTask("Mike Smith", "Create Login", 1, 5, "To Do");
    tm.addTask("Edward Harrison", "Create Add Features",
}