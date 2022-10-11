package Mockito.Mock;
import org.example.student.StudentDAO;
import org.example.student.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StudentServiceMockTest {
    @Test
    public void testFindTotal(){
        StudentDAO daoMock= mock(StudentDAO.class);
        System.out.println(daoMock.getClass().getSimpleName());

        when(daoMock.getScore()).thenReturn(new int[]{10,30,40});
        StudentService service=new StudentService(daoMock);

        int total=service.findTotalScore();
        assertEquals(80,total);
    }
}
