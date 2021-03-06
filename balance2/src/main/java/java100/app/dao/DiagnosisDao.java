package java100.app.dao;

import java.util.List;
import java.util.Map;

import java100.app.domain.Diagnosis;

public interface DiagnosisDao {
    List<Diagnosis> findAll(Map<String,Object> params);
    int countAll();
    int insert(Diagnosis diagnosis);
    Diagnosis findByNo(int no);
    int update(Diagnosis diagnosis);
    int delete(int no);
}















