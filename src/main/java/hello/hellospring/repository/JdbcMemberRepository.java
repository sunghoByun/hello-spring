//package hello.hellospring.repository;
//import hello.hellospring.domain.Member;
//
//import javax.sql.DataSource;
//import java.sql.*;
//import java.util.Optional;
//
//public class JdbcTemplateMemberRepository implements MemberRepository
//{
//    private final DataSource dataSource;
//    public JdbcTemplateMemberRepository(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//    @Override
//    public Member save(Member member) {
//        String sql = "insert into member(name) values(?)";
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        try {
//            conn = dataSource.getConnection();
//            pstmt = conn.prepareStatement(sql,
//                    Statement.RETURN_GENERATED_KEYS);
//            pstmt.setString(1, member.getName());
//            pstmt.executeUpdate();
//            rs = pstmt.getGeneratedKeys();
//            if (rs.next()) {
//                member.setId(rs.getLong(1));
//            } else {
//                throw new SQLException("id 조회 실패");
//            }
//            return member;
//        } catch (Exception e) {
//            throw new IllegalStateException(e);
//        } finally {
//            close(conn, pstmt, rs);
//        }
//    }
//    @Override
//    public Optional<Member> findById(Long id) {
//        String sql = "select * from member where id = ?";
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//}
