package sn.supdeco.blog.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sn.supdeco.blog.dao.ArticleDao;
import sn.supdeco.blog.entity.Article;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService {

    private final ArticleDao articleDao;

    public Article create(Article article){
        article.setTitle(article.getTitle());
        article.setContent((article.getContent()));

        return articleDao.save(article);
    }

    public List<Article> getAll() {
        return articleDao.findAll();
    }

    public Article update(Article article) {
        return articleDao.save(article);
    }

    public Article findArticleById(Long id){
        return articleDao.findArticleById(id);
    }


}
