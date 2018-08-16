 package com.baoning.spring.boot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.baoning.spring.boot.mongodb.domain.File;
//数据库访问接口
public interface FileRepository extends MongoRepository<File, String> {

}
