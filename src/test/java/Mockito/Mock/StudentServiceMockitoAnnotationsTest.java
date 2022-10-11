package Mockito.Mock;

import org.example.student.StudentDAO;
import org.example.student.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceMockitoAnnotationsTest {

    @Mock
    StudentDAO daoMock;

    @InjectMocks
    StudentService service;

    @Test
    public void testToTalScores(){
        when(daoMock.getScore()).thenReturn(new int[]{10,30,40});

        assertEquals(80,service.findTotalScore());
    }
}
