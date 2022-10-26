package interfaces;

import models.Exercise;
import models.Gymnast;
import java.io.IOException;

// Interface voor Loose Coupling injecteren in Logica laag

public interface IDataLayer {
    Gymnast[] getGymnasts() throws  IOException;
    Exercise[] getExercisesFrontflip() throws IOException;
    Exercise[] getExercisesHandspring() throws  IOException;
    Exercise[] getAlterExercisesFrontflip() throws IOException;
}
