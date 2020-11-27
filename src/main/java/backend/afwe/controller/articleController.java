package backend.afwe.controller;

import backend.afwe.entity.article;
import backend.afwe.result.Result;
import backend.afwe.result.ResultFactory;
import backend.afwe.service.articleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;

@RestController
public class articleController {
    @Autowired
    articleService ArticleService;

    @CrossOrigin
    @PostMapping("/api/addarticle")
    public Result saveArticle(@RequestBody @Valid article Article) {
        ArticleService.addOrUpdate(Article);
        return ResultFactory.buildSuccessResult("保存成功");
    }

    @CrossOrigin
    @GetMapping("/api/articles")
    public Result listArticles() {
        return ResultFactory.buildSuccessResult(ArticleService.list());
    }

    @CrossOrigin
    @GetMapping("/api/article/{id}")
    public Result getOneArticle(@PathVariable("id") int id) {
        return ResultFactory.buildSuccessResult(ArticleService.findById(id));
    }

    @DeleteMapping("/api/deletearticle/{id}")
    public Result deleteArticle(@PathVariable("id") int id) {
        ArticleService.delete(id);
        return ResultFactory.buildSuccessResult("删除成功");
    }
}