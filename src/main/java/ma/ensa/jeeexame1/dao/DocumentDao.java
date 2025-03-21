package ma.ensa.jeeexame1.dao;

import ma.ensa.jeeexame1.entity.Document;
import ma.ensa.jeeexame1.entity.User;

import java.util.Date;
import java.util.List;

public interface DocumentDao {
    List<Document> getDocuments();
    Document getDocument(int id);
    void Emprint(Document document, User user, Date dateBorrow, Date return_date);
}
