# querydsl-example

JPA + QueryDSL 사용하면서 애로사항이나 특별히 쓸만한 기능들을  
정리해놓기위해 작성.

## junit default values 추가 

기본적으로 `data.sql` 에 넣으면 되지만 테이블 추가될때마다 같은 파일을 공유하기 힘들다.  
그래서 `@Sql` 을 사용하여 별도의 파일을 임포트하게 되면 분리되어 보기 더 편하다.  

## specification

우연히 블로그를 돌아보다가 찾은 키워드인데 약간 querydsl 나오기전에 잠깐 대용품같은 느낌이다.  
지금은 모두 대체가 가능하다고 생각이 들고 이걸로 개발할필요는 없다고 생각이 드는데  
실사용은 `schoolSpecRepositoryImpl` 에 있다.  
개인적으로 단점은 `querydsl` 보다 사용하기 불편하고 보기에도 불편하다.  
그 외에도 여러가지 장점을 찾아보았지만 머릿속에 생각나는것도 없고 진짜 전혀 없어서 그냥 사용하지 말기를 빈다.  

---

### 참고 

https://starrybleu.github.io/development/2018/07/31/spring-data-jpa-specification.html