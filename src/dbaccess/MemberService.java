
package dbaccess;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class MemberService {
    
    private I_MemberDAO memberDAO;
    
    
    /**
     *
     */
    public MemberService() {
        I_DBAccessor db = new DBAccessor();
        memberDAO = new MemberDAO(db);
    }
    
    /**
     *
     * @return
     * @throws DataAccessException
     */
    public List<Member> getAllMembers() throws DataAccessException {
        return memberDAO.retrieveAllMemebers();
    }
    
    /**
     *
     * @param memberId
     * @return
     * @throws DataAccessException
     */
    public Member getMemberById(String memberId) throws DataAccessException {
        return memberDAO.retreiveMemberById(memberId);
    }
    
    /**
     *
     * @param member
     * @throws DataAccessException
     */
    public void saveMember(Member member) throws DataAccessException {
        memberDAO.saveMember(member);
    }
    
    /**
     *
     * @param member
     * @throws DataAccessException
     */
    public void deleteMember(Member member) throws DataAccessException {
        memberDAO.deleteMember(member);
    }
    
    
//    /**
//     *
//     * @param args
//     * @throws DataAccessException
//     */
//    public static void main(String[] args) throws DataAccessException {
//        
//        MemberService ms = new MemberService();
//        Member member = new Member();
//        
//        member = ms.getMemberById("2");
//        System.out.println(member.toString());
//        System.out.println(ms.getAllMembers());
//        
//            member.setMemberId(12);
//            member.setLastName("Goon");
//            member.setFirstName("Bobby");
//            member.setAddress("909 Main St.");
//            member.setCity("Kenosha");
//            member.setState("WI");
//            member.setZip("53149");
//            member.setPhone("262-719-3232");
//            member.setEmail("goon@goon.com");
//            member.setJoinDate(new Date());
//            member.setMembershipType("1sin");
//            member.setMembershipStatus("1act");
//            member.setMembershipPayment("1mon");
//            member.setFreeSession("1una");
//            
//            ms.saveMember(member);
//            
//            System.out.println(member.toString());
//    }

}
