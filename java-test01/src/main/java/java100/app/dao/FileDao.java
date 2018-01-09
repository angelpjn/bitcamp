package java100.app.dao;

import java.util.List;

import java100.app.domain.UploadFile;

public interface FileDao {

    List<UploadFile> findByBookNo(int no);
    
    void insert(UploadFile file);

    void deleteAllByBookNo(int no);
}
