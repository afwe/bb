package backend.afwe.service;

import backend.afwe.dao.articleDAO;
import backend.afwe.entity.article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class articleService {
    @Autowired
    articleDAO ArticleDAO;

    /*public MyPage list(int page, int size) {
        MyPage<JotterArticle> articles;
        String key = "articlepage:" + page;
        Object articlePageCache = redisService.get(key);

        if (articlePageCache == null) {
            Sort sort = new Sort(Sort.Direction.DESC, "id");
            Page<JotterArticle> articlesInDb = jotterArticleDAO.findAll(PageRequest.of(page, size, sort));
            articles = new MyPage<>(articlesInDb);
            redisService.set(key, articles);
        } else {
            articles = (MyPage<JotterArticle>) articlePageCache;
        }
        return articles;
    }
    */
    public List<article> list(){
        return ArticleDAO.findAll();
    }

    public article findById(int id) {
        article Article;
        Article = ArticleDAO.findById(id);
        return Article;
    }

    public void addOrUpdate(article article) {
        ArticleDAO.save(article);
    }

    public void delete(int id) {
        ArticleDAO.deleteById(id);
    }
}