package studysmart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class StudyPlan {

    public int planId;


    public Date generatedDate;


    public List<StudySession> studySession = new ArrayList<StudySession> ();


    public void addSession(final StudySession session) {
    }

}
