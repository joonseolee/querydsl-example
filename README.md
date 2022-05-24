# querydsl-example

JPA + QueryDSL 사용하면서 애로사항이나 특별히 쓸만한 기능들을  
정리해놓기위해 작성.

## junit default values 추가 

기본적으로 `data.sql` 에 넣으면 되지만 테이블 추가될때마다 같은 파일을 공유하기 힘들다.  
그래서 `@Sql` 을 사용하여 별도의 파일을 임포트하게 되면 분리되어 보기 더 편하다.  

