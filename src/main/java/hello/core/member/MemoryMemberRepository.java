package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {  // MemberRepository 인터페이스의 메소드 오버라이드
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {  // MemberRepository 인터페이스의 메소드 오버라이드
        return store.get(memberId);
    }
}