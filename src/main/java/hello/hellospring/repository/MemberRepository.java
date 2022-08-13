package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface MemberRepository {
    Member save(Member member);                 //Member 객체 저장
    Optional<Member> findById(Long id);         //Member 객체 id로 검색
    Optional<Member> findByName(String name);   //Member 객체 이름으로 검색
    List<Member> findAll();                     //지금까지 저장된 모든 Member 반환
}
