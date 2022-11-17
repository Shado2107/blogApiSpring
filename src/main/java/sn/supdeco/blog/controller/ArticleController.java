package sn.supdeco.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.supdeco.blog.entity.Article;
import sn.supdeco.blog.service.ArticleService;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @PostMapping("/add")
    public ResponseEntity<Article> createArticle(@RequestBody Article article){
        articleService.create(article);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<Article>> getAllArticle() {
        return ResponseEntity.ok(articleService.getAll());
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") Long id){
        Article article = articleService.findArticleById(id);
        return new ResponseEntity<>(article, HttpStatus.OK);
    }

    @RequestMapping("/update")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article){
        Article updateArticle = articleService.update(article);
        return new ResponseEntity<>(updateArticle, HttpStatus.OK);
    }


}
