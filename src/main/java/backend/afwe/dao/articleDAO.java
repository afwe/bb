package backend.afwe.dao;

import backend.afwe.entity.article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface articleDAO  extends JpaRepository<article,Integer> {
    article findById(int id);
}
