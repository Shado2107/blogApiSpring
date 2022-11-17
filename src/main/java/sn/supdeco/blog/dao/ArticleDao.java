package sn.supdeco.blog.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.supdeco.blog.entity.Article;

import java.util.List;

@Repository
public interface ArticleDao extends CrudRepository<Article, String> {
    Article findArticleById(Long id);

}
