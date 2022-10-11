package studentTesting;

import org.example.student.StudentDAO;
import org.example.student.StudentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetScoreTesting {

    @Test
    public void testFindTotal(){
        StudentService service=new StudentService(new StudentDAOStub());
        int total= service.findTotalScore();

        assertEquals(110,total);
    }
}

//Using stub as imitation dao instead of studentDAO and using it for testing
class StudentDAOStub extends StudentDAO {

    @Override
    public int[] getScore(){
        return new int[]{45,40,25};
    }
}