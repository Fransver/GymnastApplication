package dataConvert;


// krijg de data niet werkend.


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataTransfer.Exercise;
import dataTransfer.Feedback;
import dataTransfer.Gymnast;
import interfaces.IDataLayer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * To do
 * 1. Methode schrijven voor WRITE VALUE van java naar de Json files.
 */


public class DataLayer implements IDataLayer {

    final String ApplicationDirectory = "user.dir";
    final String DataDirectoryName = "dataLayer\\data";

    final String ExercisesFrontflip = "exercises-frontflip.json";
    final String AlterExercisesFrontflip = "exercises-frontflip-alter.json";
    final String ExercisesHandspring = "exercises-handspring.json";
    final String EmptyList = "empty-exerciselist.json"; // Gemaakt voor parent Exercisepage

    final String GymnastsDataFile = "gymnasts.json"; // Users
    final String FeedbackList = "feedback.json"; // from feedback Class to JSON

    private String dataDirectoryName;


    public DataLayer() {
        super();
        dataDirectoryName = new File(System.getProperty(ApplicationDirectory), DataDirectoryName).getPath();
    }

    private Gymnast[] loadGymnasts() throws JsonParseException, JsonMappingException, IOException {
        // Create mapper
        ObjectMapper mapper = new ObjectMapper();
        // convert the Json file
        return mapper.readValue(Paths.get(dataDirectoryName, GymnastsDataFile).toFile(), Gymnast[].class);
    }


    // Juiste verwijzingen aangepast van DATATRANSER-GYMNAST tot de (kern)GYMNAST
    public models.Gymnast[] getGymnasts() throws JsonParseException, JsonMappingException, IOException {
        // Load all person data
        Gymnast[] gymnastsData = loadGymnasts();
        // Create the people
        List<models.Gymnast> gymnastsList = new ArrayList<models.Gymnast>();
        for (Gymnast gymnastData : gymnastsData) {
            models.Gymnast gymnast = new models.Gymnast(gymnastData.id, gymnastData.name, gymnastData.gender, gymnastData.points,
                    gymnastData.club);
            gymnastsList.add(gymnast);
        }
        return gymnastsList.toArray(new models.Gymnast[0]);
    }

    // Load the JSON FrontFlip
    private Exercise[] loadExercisesFrontflip() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(Paths.get(dataDirectoryName, ExercisesFrontflip).toFile(), Exercise[].class);
    }

    public models.Exercise[] getExercisesFrontflip() throws JsonParseException, JsonMappingException, IOException {
        // Load FrontFlip data
        Exercise[] frontflipsData = loadExercisesFrontflip();
        // Create the FrontFlip exercises
        List<models.Exercise> frontflipList = new ArrayList<models.Exercise>();
        for (Exercise frontflipData : frontflipsData) {
            models.Exercise frontflipExercise = new models.Exercise(frontflipData.exerciseId, frontflipData.exerciseName, frontflipData.exerciseSkillLevel
                    , frontflipData.discription);
            frontflipList.add(frontflipExercise);
        }
        return frontflipList.toArray(new models.Exercise[0]);
    }


    // Load the JSON Handspring
    private Exercise[] loadExercisesHandspring() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(Paths.get(dataDirectoryName, ExercisesHandspring).toFile(), Exercise[].class);
    }


    public models.Exercise[] getExercisesHandspring() throws JsonParseException, JsonMappingException, IOException {
        // Load Handpspring data
        Exercise[] handspringsData = loadExercisesHandspring();
        // Create the Handspring exercises
        List<models.Exercise> handspringList = new ArrayList<>();
        for (Exercise handspringData : handspringsData) {
            models.Exercise handspringExercise = new models.Exercise(handspringData.exerciseId, handspringData.exerciseName, handspringData.exerciseSkillLevel
                    , handspringData.discription);
            handspringList.add(handspringExercise);
        }
        return handspringList.toArray(new models.Exercise[0]);
    }

    private Exercise[] loadEmptyExerciseList() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(Paths.get(dataDirectoryName, EmptyList).toFile(), Exercise[].class);
    }

    public models.Exercise[] getEmptyExerciseList() throws JsonParseException, JsonMappingException, IOException {
        // Load Empty data
        Exercise[] emptyExercisesData = loadEmptyExerciseList();
        // Create the Empty exercises
        List<models.Exercise> emptyList = new ArrayList<>();
        for (Exercise emptyExercisedata : emptyExercisesData) {
            models.Exercise emptyExercise = new models.Exercise(emptyExercisedata.exerciseId, emptyExercisedata.exerciseName, emptyExercisedata.exerciseSkillLevel
                    , emptyExercisedata.discription);
            emptyList.add(emptyExercise);
        }
        return emptyList.toArray(new models.Exercise[0]);
    }

    // Load the JSON FrontFlip
    private Exercise[] loadAlterExercisesFrontflip() throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(Paths.get(dataDirectoryName, AlterExercisesFrontflip).toFile(), Exercise[].class);
    }

    public models.Exercise[] getAlterExercisesFrontflip() throws JsonParseException, JsonMappingException, IOException {
        // Load FrontFlip data
        Exercise[] alterFrontflipsData = loadAlterExercisesFrontflip();
        // Create the FrontFlip exercises
        List<models.Exercise> alterfrontflipList = new ArrayList<>();
        for (Exercise alterfrontflipData : alterFrontflipsData) {
            models.Exercise alterFrontflipExercise = new models.Exercise(alterfrontflipData.exerciseId, alterfrontflipData.exerciseName, alterfrontflipData.exerciseSkillLevel
                    , alterfrontflipData.discription);
            alterfrontflipList.add(alterFrontflipExercise);
        }
        return alterfrontflipList.toArray(new models.Exercise[0]);
    }

    // Load Feedbacklist
    private Feedback[] loadFeedback() throws JsonParseException, JsonMappingException, IOException {
        // Create mapper
        ObjectMapper mapper = new ObjectMapper();
        // convert the Json file
        return mapper.readValue(Paths.get(dataDirectoryName, FeedbackList).toFile(), Feedback[].class);
    }

//    public SuggestAlterCourseConsole[] getFeedbackfromAlterCourse() throws JsonParseException, JsonMappingException, IOException {
//        // Load Feedback data
//        Feedback[] feedbacks = loadFeedback();
//        // Create the feedback data
//        List<SuggestAlterCourseConsole> feedbackList = new ArrayList<SuggestAlterCourseConsole>();
//        for (Feedback feedbackDate : feedbacks) {
//            SuggestAlterCourseConsole feedback = new SuggestAlterCourseConsole(feedbackDate.frustrationScore,
//                    feedbackDate.attemptsExercise);
//            feedbackList.add(feedback);
//        }
//        return feedbackList.toArray(new SuggestAlterCourseConsole[0]);
//    }

}




















