package com.example.springbootstudy.database;

import com.example.springbootstudy.bpp.Auditing;
import com.example.springbootstudy.bpp.Transaction;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@Transaction
@Auditing
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Component
@RequiredArgsConstructor
public class CompanyRepository implements CrudRepository<Integer,Company> {

    //@Resource(name = "pool1")
//    @Autowired
    //@Qualifier("pool1")
    @Qualifier("pool1")
    private final ConnectionPool pool1;
//    @Autowired
    private final List<ConnectionPool> pools;
    @Value("${db.pool.size}")
    private final Integer poolSize;


    @PostConstruct
    private void init(){
        log.info("init");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        log.info("delete method");
    }


//    @Autowired
//    @Qualifier("pool1")
//    public void setPool1(ConnectionPool pool1) {
//        this.pool1 = pool1;
//    }

    //    public CompanyRepository(ConnectionPool connectionPool) {
//        this.connectionPool = connectionPool;
//    }
//
//    public static CompanyRepository of(ConnectionPool connectionPool){
//        return new CompanyRepository(connectionPool);
//    }
}
