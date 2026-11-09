package software.ulpgc.katas.io;

import software.ulpgc.katas.model.Employee;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class FileEmployeeReader implements EmployeeReader {
    private final File file;

    public FileEmployeeReader(File file) {
        this.file = file;
    }

    @Override
    public List<Employee> readAll(){
        return List.of();
    }
}
