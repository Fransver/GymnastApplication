package interfaces;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import models.Exercise;
import models.Gymnast;

import java.io.IOException;

public interface IDataLayer {
    Gymnast[] getGymnasts() throws  IOException;
    Exercise[] getExercisesFrontflip() throws IOException;
    Exercise[] getExercisesHandspring() throws  IOException;
    Exercise[] getAlterExercisesFrontflip() throws IOException;
}
