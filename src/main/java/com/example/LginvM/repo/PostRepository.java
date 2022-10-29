package com.example.LginvM.repo;

//необходимые функции для добавить удалить обновить и получить записи из табл
import com.example.LginvM.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post, Long>{
}
