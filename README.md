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

## dynamicInsert, dynamicUpdate

말그대로 동적으로 추가나 수정 쿼리를 만들어주는건데 컬럼수가 많은 경우에는 해당 아노테이션을 엔티티에 붙혀서 사용한다.  
다만 캐시가 안되기때문에 좀 느리다고하지만 실제 테스트에서는 그닥...  
나중에 필요하면 추가해야겠다.

## unique

한컬럼에 간단한 제약조건을 걸때 사용되는데 두개의 컬럼 이상을 사용하고싶다면 클래스레벨에서 @Table.uniqueConstraints 를 걸면된다.

## 양방향 연관관계

양방향이 좋긴한데 설정해야할부분이 좀 있고 복잡하기때문에 객체 그래프 탐색 기능이 필요할떄만 추가하자.

## entityManager

`EntityManager.find`, `EntityManager.getReference` 의 차이는  
즉시 조회가 되는지 지연 조회가 되는지 차이이다.

---

### 참고

https://starrybleu.github.io/development/2018/07/31/spring-data-jpa-specification.html
